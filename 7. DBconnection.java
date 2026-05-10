package com.exp7;

import java.sql.*;

public class DBConnection {

    public static Connection getCon() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =
        DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/exp7db",
        "root",
        "1234");

        return con;
    }
}
