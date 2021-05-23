
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Paciente  implements Runnable{
    private final String id;
    private final int t_espera_observacion;
    private final int prob_reaccion;
    private final int prob_cita;
    private final EstadoSalas estado_salas;
    private boolean vacunado;
    private boolean comprobado;
    private int puesto;//puesto en la sala de vacunacion
    private boolean terminar;
    private int puesto_observacion;

    public Paciente(String id, EstadoSalas estado_salas) {
        this.id = id;
        this.t_espera_observacion =  10*1000;
        this.prob_reaccion = (int)(100*Math.random());
        this.prob_cita = (int)(100*Math.random());
        this.estado_salas = estado_salas;
        this.vacunado=false;
        this.comprobado = false;
        this.puesto=100;
        this.puesto_observacion=100;
        this.terminar = false;
    }
    
    public String getNombre() {
        return id;
        
    }

    public int getT_espera_observacion() {
        return t_espera_observacion;
    }

    public int getProb_reaccion() {
        return prob_reaccion;
    }

    public int getProb_cita() {
        return prob_cita;
    }
    public void terminar() throws  IOException{
        Thread.currentThread().interrupt();
        try {
            sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("El paciente "+this.id+" abandona el hospital.");
        }
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getPuesto_observacion() {
        return puesto_observacion;
    }

    public void setPuesto_observacion(int puesto_observacion) {
        this.puesto_observacion = puesto_observacion;
    }
    
    

    public boolean isVacunado() {
        return vacunado;
    }
    

    public void setVacunado(boolean vacunado)  {
        this.vacunado = vacunado;
        
    }

    public boolean isComprobado() {
        return comprobado;
    }

    public void setComprobado(boolean comprobado) {
        this.comprobado = comprobado;
    }

    public void setTerminar(boolean terminar) {
        this.terminar = terminar;
    }
    

    public void run() {
        try {
            estado_salas.entrarRecepcion(this);
            estado_salas.salirRecepcion(this);
            if(terminar){
                this.terminar();                
            }
            else{                
                estado_salas.entrarVacunacionPaciente(this);              
                estado_salas.sacarPacienteVac(this);
                estado_salas.meterPacienteObs(this);
                estado_salas.siReaccion(this);                            
                estado_salas.sacarPacienteObs(this);
            }
            
        } catch (IOException | InterruptedException  ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
