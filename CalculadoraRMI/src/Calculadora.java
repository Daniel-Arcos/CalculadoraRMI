import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    
    public float div(int a, int b) throws RemoteException;

    public float mul(int a, int b) throws RemoteException;

    public float sum(int a, int b) throws RemoteException;

    public int res(int a, int b) throws RemoteException;
}
