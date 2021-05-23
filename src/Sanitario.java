
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Sanitario extends Thread{
    private final String id;
    private final EstadoSalas estado_salas;
    //Variables para tiempos aleatorios
    private final int t_min_cambiarse;
    private final int t_max_cambiarse;
    private final int t_min_vacunacion;
    private final int t_max_vacunacion;
    private final int t_min_descanso;
    private final int t_max_descanso;
    private final int t_min_problema;
    private final int t_max_problema;
    private final int vacunados_descanso;
    private int vacunados;
    private int descanso; 
    private boolean puesto_cerrado;

    public Sanitario(String id, EstadoSalas estado_salas) {
        this.id = id;
        this.estado_salas = estado_salas;
        this.t_min_cambiarse = 1*1000;
        this.t_max_cambiarse =3 *1000;
        this.t_min_vacunacion = 3*1000;
        this.t_max_vacunacion = 5*1000;
        this.t_min_descanso = 5*1000;
        this.t_max_descanso = 8*1000;
        this.t_min_problema = 2*1000;
        this.t_max_problema = 5*1000; 
        this.vacunados_descanso = 15;
        this.vacunados=0;
        this.puesto_cerrado=false;
        this.descanso=0;
    }

    
    public String getNombre() {
        return this.id;
    }

    public int getT_min_descanso() {
        return t_min_descanso;
    }

    public int getT_max_descanso() {
        return t_max_descanso;
    }

    public int getVacunados() {
        return vacunados;
    }

    public int getT_min_problema() {
        return t_min_problema;
    }

    public int getT_max_problema() {
        return t_max_problema;
    }

    public int getT_min_vacunacion() {
        return t_min_vacunacion;
    }

    public int getT_max_vacunacion() {
        return t_max_vacunacion;
    }

    public void setPuesto_cerrado(boolean puesto_cerrado) {
        this.puesto_cerrado = puesto_cerrado;
    }

    public boolean isPuesto_cerrado() {
        return puesto_cerrado;
    }

    
    public void run(){       
        try {
            estado_salas.cambiarse(id, t_min_cambiarse, t_max_cambiarse);
            int puesto = estado_salas.entrarVacunacionSanitario(this);
            while(true){
                estado_salas.vacunar(puesto);                
                vacunados++;
                descanso++;
                if(descanso==vacunados_descanso|| puesto_cerrado){
                    puesto_cerrado = false; 
                    descanso = 0;
                    estado_salas.descansar(this.id,this.t_min_descanso,this.t_max_descanso);
                    estado_salas.tratarReaccion(this);//si hay pacientes con reaccion les tratamos
                    puesto = estado_salas.entrarVacunacionSanitario(this);//volvemos a meter al sanitario en la sala de vacunación
                }
            }
            
            
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Sanitario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    

    
}
