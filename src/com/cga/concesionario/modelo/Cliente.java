package com.cga.concesionario.modelo;

public class Cliente {
	private int ClienteID; 
	private String Nombre; 
	private String Apellido; 
	private String DNI; 
	private String Teléfono; 
	private String Email; 
	private String Direccion;
	public Cliente(int clienteID, String nombre, String apellido, String dni, String teléfono, String email,String direccion) {
		super();
		ClienteID = clienteID;
		Nombre = nombre;
		Apellido = apellido;
		DNI = dni;
		Teléfono = teléfono;
		Email = email;
		Direccion = direccion;
	}
	public Cliente() {
		super();
	}
	public int getClienteID() {
		return ClienteID;
	}
	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String i) {
		DNI = i;
	}
	public String getTeléfono() {
		return Teléfono;
	}
	public void setTeléfono(String teléfono) {
		Teléfono = teléfono;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	@Override
	public String toString() {
		return "Cliente [ClienteID=" + ClienteID + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI
				+ ", Teléfono=" + Teléfono + ", Email=" + Email + ", Direccion=" + Direccion + "]";
	}
	
	
}
