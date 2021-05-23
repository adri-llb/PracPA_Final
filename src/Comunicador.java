/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josea
 */
public class Comunicador  extends UnicastRemoteObject implements InterfaceComunica{
    private JFrameCliente interfaz_cliente;
    private SalasJFrame interfaz_servidor;
    private EstadoSalas estado_salas; 
    public Comunicador(JFrameCliente interfaz_cliente,SalasJFrame interfaz_servidor, EstadoSalas estado_salas) throws RemoteException {
        this.interfaz_cliente=interfaz_cliente;
        this.interfaz_servidor=interfaz_servidor;
        this.estado_salas=estado_salas;
        
    }                 //Constructor

    @Override

    public void visualizar ()throws RemoteException{
        interfaz_cliente.setVisible(true);
    }
    public void actualizarFrame() throws RemoteException{            
             //SALA RECEPCION
            interfaz_cliente.getjTextAreaColaEspera().setText(interfaz_servidor.getjTextAreaColaEspera().getText());
            interfaz_cliente.getjTextFieldPacienteRecepcion().setText(interfaz_servidor.getjTextFieldPacienteRecepcion().getText());
            interfaz_cliente.getjTextFieldAux1().setText(interfaz_servidor.getjTextFieldAux1().getText());

            //SALA DESCANSO
            interfaz_cliente.getjTextFieldDESCANSO().setText(interfaz_servidor.getjTextFieldDESCANSO().getText());

            //SALA VACUNACION
            interfaz_cliente.getjTextFieldAux2().setText(interfaz_servidor.getjTextFieldAux2().getText());
            interfaz_cliente.getjTextFieldVacunasDisp().setText(interfaz_servidor.getjTextFieldVacunasDisp().getText());

            interfaz_cliente.getjTextFieldPV1().setText(interfaz_servidor.getjTextFieldPV1().getText());
            interfaz_cliente.getjTextFieldPV2().setText(interfaz_servidor.getjTextFieldPV2().getText());
            interfaz_cliente.getjTextFieldPV3().setText(interfaz_servidor.getjTextFieldPV3().getText());
            interfaz_cliente.getjTextFieldPV4().setText(interfaz_servidor.getjTextFieldPV4().getText());
            interfaz_cliente.getjTextFieldPV5().setText(interfaz_servidor.getjTextFieldPV5().getText());
            interfaz_cliente.getjTextFieldPV6().setText(interfaz_servidor.getjTextFieldPV6().getText());
            interfaz_cliente.getjTextFieldPV7().setText(interfaz_servidor.getjTextFieldPV7().getText());
            interfaz_cliente.getjTextFieldPV8().setText(interfaz_servidor.getjTextFieldPV8().getText());
            interfaz_cliente.getjTextFieldPV9().setText(interfaz_servidor.getjTextFieldPV9().getText());
            interfaz_cliente.getjTextFieldPV10().setText(interfaz_servidor.getjTextFieldPV10().getText());

            //SALA OBSERVACION
            interfaz_cliente.getjTextFieldPO1().setText(interfaz_servidor.getjTextFieldPO1().getText());
            interfaz_cliente.getjTextFieldPO2().setText(interfaz_servidor.getjTextFieldPO2().getText());
            interfaz_cliente.getjTextFieldPO3().setText(interfaz_servidor.getjTextFieldPO3().getText());
            interfaz_cliente.getjTextFieldPO4().setText(interfaz_servidor.getjTextFieldPO4().getText());
            interfaz_cliente.getjTextFieldPO5().setText(interfaz_servidor.getjTextFieldPO5().getText());
            interfaz_cliente.getjTextFieldPO6().setText(interfaz_servidor.getjTextFieldPO6().getText());
            interfaz_cliente.getjTextFieldPO7().setText(interfaz_servidor.getjTextFieldPO7().getText());
            interfaz_cliente.getjTextFieldPO8().setText(interfaz_servidor.getjTextFieldPO8().getText());
            interfaz_cliente.getjTextFieldPO9().setText(interfaz_servidor.getjTextFieldPO9().getText());
            interfaz_cliente.getjTextFieldPO10().setText(interfaz_servidor.getjTextFieldPO10().getText());
            interfaz_cliente.getjTextFieldPO11().setText(interfaz_servidor.getjTextFieldPO11().getText());
            interfaz_cliente.getjTextFieldPO12().setText(interfaz_servidor.getjTextFieldPO12().getText());
            interfaz_cliente.getjTextFieldPO13().setText(interfaz_servidor.getjTextFieldPO13().getText());
            interfaz_cliente.getjTextFieldPO14().setText(interfaz_servidor.getjTextFieldPO14().getText());
            interfaz_cliente.getjTextFieldPO15().setText(interfaz_servidor.getjTextFieldPO15().getText());
            interfaz_cliente.getjTextFieldPO16().setText(interfaz_servidor.getjTextFieldPO16().getText());
            interfaz_cliente.getjTextFieldPO17().setText(interfaz_servidor.getjTextFieldPO17().getText());
            interfaz_cliente.getjTextFieldPO18().setText(interfaz_servidor.getjTextFieldPO18().getText());
            interfaz_cliente.getjTextFieldPO19().setText(interfaz_servidor.getjTextFieldPO19().getText());
            interfaz_cliente.getjTextFieldPO20().setText(interfaz_servidor.getjTextFieldPO20().getText());
            if(interfaz_cliente.getCerrado()) {
                cerrarPuesto(interfaz_cliente.getPuesto());
                interfaz_cliente.setCerrado(false);
            }
            
            
            
        
    }
    
    public boolean cerrarPuesto(int puesto){
        estado_salas.getVacunacion_sanitarios()[puesto].setPuesto_cerrado(true);
        System.out.println("SANITARIO "+estado_salas.getVacunacion_sanitarios()[puesto].getNombre()+" ESTADO CERRADO "+estado_salas.getVacunacion_sanitarios()[puesto].isPuesto_cerrado());
        return estado_salas.getVacunacion_sanitarios()[puesto].isPuesto_cerrado();
    }
    
}
