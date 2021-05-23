
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        int num_pacientes=2000;
        int cap_sala_vacunacion=10;
        int cap_sala_observacion=20; 
        ExecutorService poolPacientes = Executors.newCachedThreadPool();
        SalasJFrame interfaz_servidor =new  SalasJFrame();
        EstadoSalas estado_salas= new EstadoSalas (num_pacientes,cap_sala_vacunacion,cap_sala_observacion,interfaz_servidor);
        
        interfaz_servidor.setVisible(true);  
        interfaz_servidor.setLocationRelativeTo(null);
        Hospital h1 = new Hospital(poolPacientes,num_pacientes,estado_salas);
        h1.start();
               
        //INICIO PARTE DITRIBUIDA(SERVIDOR)
        try{            
            JFrameCliente interfaz_cliente = new JFrameCliente();
            Comunicador obj = new Comunicador(interfaz_cliente,interfaz_servidor,estado_salas); //Crea una instancia del objeto que implementa la interfaz, como objeto a registra
            Registry registry = LocateRegistry.createRegistry(1099); //Arranca rmiregistry local en el puerto 1099
            Naming.rebind("//localhost/ObjetoSaludann",obj);   //rebind sólo funciona sobre una url del equipo local
            System.out.println("\n\nSERVIDOR INICIADO\n\n");           
        }catch (MalformedURLException | RemoteException e)
        {
            System.out.println(" Error: " + e.getMessage());
            e.printStackTrace();
        }


        
        
        
        
    }
    
}
