import java.rmi.*;

public interface Palin extends Remote {

    String check(String str) throws RemoteException;

}