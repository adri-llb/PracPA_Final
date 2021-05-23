
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josea
 */
public class Hospital extends Thread{
    private ExecutorService poolPacientes;
    private EstadoSalas estado_salas;
    private int num_pacientes;
    private int t_min_llegada_pacientes, t_max_llegada_pacientes;
    
        
    
    
    
    public Hospital(ExecutorService poolPacientes,int num_pacientes,EstadoSalas estado_salas) throws IOException{
        this.poolPacientes = poolPacientes;
        this.estado_salas = estado_salas;
        this.t_min_llegada_pacientes= 1*1000;
        this.t_max_llegada_pacientes= 3*1000; 
        this.num_pacientes = num_pacientes;
        
       
    }

    public EstadoSalas getEstado_salas() {
        return estado_salas;
    }
    
    
    public void run(){
        
        
        //creamos los sanitatios
        for(int i=1;i<11;i++){
            String id_s;
            if(i<10) id_s = "S0"+i;
            else id_s = "S"+i;
            Sanitario s = new Sanitario(id_s,estado_salas); 
            s.start();
        }
        
        //creamos auxiliares
        Auxiliar1 aux1 = new Auxiliar1 ("A1",estado_salas);
        aux1.start();
        Auxiliar2 aux2 = new Auxiliar2("A2", estado_salas);
        aux2.start();
        
        //creamos los pacientes
        for (int i = 0; i < num_pacientes; i++) {
            try{
                Thread.sleep(t_min_llegada_pacientes+(int)(Math.random()*(t_max_llegada_pacientes-t_min_llegada_pacientes)));//creamos pacientes en intervalo 1-3 segundos
            }catch(InterruptedException ie){}
            String id_p;
            if(i <10) id_p = "P000"+i;
            else if(i < 100) id_p = "P00"+i;
            else if(i<1000) id_p = "P0"+i;
            else id_p = "P"+i;
            Paciente paciente = new Paciente(id_p,estado_salas);
            paciente.start();
            //poolPacientes.execute(paciente);
            
            
        }
        poolPacientes.shutdown();
        try{
           poolPacientes.awaitTermination(10,TimeUnit.MINUTES);   
        }catch(InterruptedException ie){}
         
    }
}
