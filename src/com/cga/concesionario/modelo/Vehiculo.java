package com.cga.concesionario.modelo;

public class Vehiculo {
	private int VehiculoID; 
	private String Marca; 
	private String Modelo;
	private int Año; 
	private double Precio; 
	private String Tipo; 
	private int Kilometraje; 
	private String VIN;
	public Vehiculo(int vehiculoID, String marca, String modelo, int año, double precio, String tipo, int kilometraje,
			String vIN) {
		super();
		VehiculoID = vehiculoID;
		Marca = marca;
		Modelo = modelo;
		Año = año;
		Precio = precio;
		Tipo = tipo;
		Kilometraje = kilometraje;
		VIN = vIN;
	}
	public Vehiculo() {}
	public int getVehiculoID() {
		return VehiculoID;
	}
	public void setVehiculoID(int vehiculoID) {
		VehiculoID = vehiculoID;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getAño() {
		return Año;
	}
	public void setAño(int año) {
		Año = año;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getKilometraje() {
		return Kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		Kilometraje = kilometraje;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	@Override
	public String toString() {
		return "vehiculo [VehiculoID=" + VehiculoID + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Año=" + Año
				+ ", Precio=" + Precio + ", Tipo=" + Tipo + ", Kilometraje=" + Kilometraje + ", VIN=" + VIN + "]";
	}
	 
	
}
