import java.rmi.*;

public class RMIServer {

    public static void main(String[] args) {

        try {

            PalinImpl obj = new PalinImpl();

            Naming.rebind("rmi://localhost/palin", obj);

            System.out.println("Server Started");

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
