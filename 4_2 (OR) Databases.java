import java.sql.*;

public class Databases {

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root123");

            // Statement
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate(
                    "create table if not exists students("
                    + "id int, name varchar(20))");

            // Insert Data
            st.executeUpdate(
                    "insert into students values(1,'Ak')");

            // Retrieve Data
            ResultSet rs = st.executeQuery(
                    "select * from students");

            // Display
            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " "
                        + rs.getString(2));
            }

            // Close Connection
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
