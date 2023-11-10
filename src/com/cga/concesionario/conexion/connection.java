package com.cga.concesionario.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection{
	public static String url ="jdbc:mysql://localhost:3306/concesionario";
	public static String user ="german";
	public static String passwd ="CGA2023";
	public static Connection con;
	public static Connection devolverCon(){
		if (con==null)
			try {
				con= DriverManager.getConnection(url,user,passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return con;
	}
}
