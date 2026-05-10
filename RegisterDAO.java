package com.exp10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDAO {

    public static int save(
            String uname,
            String pass,
            String email,
            String country) {

        int status = 0;

        try {

            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con =
                    DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/exp10db",
                    "root",
                    "1234"
            );

            // SQL query
            PreparedStatement ps =
                    con.prepareStatement(
                    "insert into registration(username,password,email,country) values(?,?,?,?)"
            );

            // Set values
            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, country);

            // Execute query
            status = ps.executeUpdate();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}