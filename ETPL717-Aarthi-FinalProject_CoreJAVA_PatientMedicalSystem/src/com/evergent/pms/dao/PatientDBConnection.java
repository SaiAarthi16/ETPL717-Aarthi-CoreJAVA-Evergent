package com.evergent.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class PatientDBConnection {
    public static Connection getConnection() throws Exception {
    	Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "evergentdb";
        String driverName = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "admin";
        Class.forName(driverName);   
        conn = DriverManager.getConnection(url+dbName, userName, password);
        return conn;
    }
}
