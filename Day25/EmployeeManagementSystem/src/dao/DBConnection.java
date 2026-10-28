package dao;

import java.sql.Connection;
import java.sql.DriverManager;

class DBConnection{

    private static final String URL="jdbc:mysql://localhost:3306/employee_db";
    private static final String user="root";
    private static final String password="krati@020304";

   public static Connection getConnection(){
    try{
        return DriverManager.getConnection(URL, user, password);
    }
    catch (Exception e) {

        System.out.println("Database connection failed!");
        e.printStackTrace();

        return null;
        }
   }
}