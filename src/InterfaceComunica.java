/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author josea
 */
public interface InterfaceComunica extends Remote{
    void visualizar ()throws RemoteException;
    void actualizarFrame() throws RemoteException;
    boolean cerrarPuesto(int puesto) throws RemoteException;
}
