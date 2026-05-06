//import java.rmi.*;
//
//public class RMIClient {
//
//    public static void main(String[] args) {
//
//        try {
//
//            Palin obj = (Palin)
//                    Naming.lookup("rmi://localhost/palin");
//
//            String result = obj.check("madam");
//
//            System.out.println(result);
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//    }
//}
import java.rmi.*;
import java.util.Scanner;

public class RMIClient {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter String:");

            String input = sc.nextLine();

            Palin obj = (Palin)
                    Naming.lookup("rmi://localhost/palin");

            String result = obj.check(input);

            System.out.println(result);

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}