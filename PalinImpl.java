import java.rmi.*;
import java.rmi.server.*;

public class PalinImpl extends UnicastRemoteObject implements Palin {

    public PalinImpl() throws RemoteException {

        super();

    }

    public String check(String str) throws RemoteException {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }

        if (str.equals(rev)) {

            return "Palindrome";

        } else {

            return "Not Palindrome";

        }
    }
}