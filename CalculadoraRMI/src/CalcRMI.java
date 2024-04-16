import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcRMI extends UnicastRemoteObject implements Calculadora {

    protected CalcRMI() throws RemoteException {
        super();
    }

    @Override
    public float div(int a, int b) throws RemoteException {
        System.out.println(a + "/" + b + " = " + a/b);
        return a /b;
    }

    @Override
    public float mul(int a, int b) throws RemoteException {
        System.out.println(a + "*" + b + " = " + a*b);
        return a*b;
    }

    @Override
    public int res(int a, int b) throws RemoteException {
        System.out.println(a + " - " + b + " = " + (a-b));
        return a -b;
    }

    @Override
    public float sum(int a, int b) throws RemoteException {
        System.out.println(a + " + " + b + " = " + (a + b));
        return a + b;
    }
    
    
}
