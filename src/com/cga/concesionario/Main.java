package com.cga.concesionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cga.concesionario.conexion.connection;
import com.cga.concesionario.modelo.Cliente;
import com.cga.concesionario.repositorio.ClientesImpl;

public class Main {	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		try (Connection con = connection.devolverCon()){
//			Statement stmt = con.createStatement();
//			ResultSet registros =stmt.executeQuery("select * from vehiculos");
//			while (registros.next()){
//			    System.out.println ("Id: " +registros.getInt(1)+ "\nMarca: "+registros.getString(2) + " \nModelo: " + registros.getString(3)+ "\n"+ "Año: "+registros.getString(4)+ "\n"+ "Precio: "+registros.getString(5)+ "\n"+ "Tipo: "+registros.getString(6)+ "\n"+ "Kilometraje: "+registros.getString(7)+"\n"+ "VIN (nº carrocería): "+registros.getString(8)+"\n");
//			}
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		ClientesImpl mostrarClientes = new ClientesImpl();
		List<Cliente> arrayClientes=new ArrayList<>();
		arrayClientes=mostrarClientes.listar();
		for (int i = 0; i < arrayClientes.size(); i++) {
			System.out.println(arrayClientes.get(i));
		}
	}
	
	
//	 public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		try (Connection con = connection.devolverCon()){
//			Statement stmt = con.createStatement();
//			ResultSet registros =stmt.executeQuery("select Nombre,Apellidos from alumnos");
//			while (registros.next()){
//			    //System.out.println ("Nombre: "+registros.getString (1) + " \nApellidos: " + registros.getString (2)+ "\n");
//			}
//			Date fecha = new Date(31,3,7);
//			RepositorioImpl mostrarAlumnos = new RepositorioImpl();
//			List<Alumnos> arrayAlumnos=new ArrayList<>();
//			arrayAlumnos=mostrarAlumnos.listar();
//			for (int i = 0; i < arrayAlumnos.size(); i++) {
//				//System.out.println(arrayAlumnos.get(i));
//			}
//			Alumnos alu = new Alumnos(0, null, null, 0, null, null, null);
//			alu.setNombre("paco");
//			alu.setApellidos("PO");
//			alu.setEdad(99);
//			alu.setSexo("M");
//			alu.setP_nac("20-20-2020");
//			alu.setFecha_ing(fecha);
//			RepositorioImpl insertarAlumno = new RepositorioImpl();
//			//insertarAlumno.insertarRegistro(alu);
//			
//			RepositorioImpl aluE= new RepositorioImpl();
//			aluE.eliminar(18);
//			
//			for (int i = 0; i < arrayAlumnos.size(); i++) {
//				System.out.println(arrayAlumnos.get(i));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
