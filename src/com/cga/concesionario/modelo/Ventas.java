package com.cga.concesionario.modelo;

import java.sql.Date;

public class Ventas {
	private int VentaID; 
	private int VehiculoID; 
	private int ClienteID; 
	private int EmpleadoID; 
	private Date FechaVenta; 
	private double PrecioFinal;
	public Ventas(int ventaID, int vehiculoID, int clienteID, int empleadoID, Date fechaVenta, double precioFinal) {
		super();
		VentaID = ventaID;
		VehiculoID = vehiculoID;
		ClienteID = clienteID;
		EmpleadoID = empleadoID;
		FechaVenta = fechaVenta;
		PrecioFinal = precioFinal;
	}
	public int getVentaID() {
		return VentaID;
	}
	public void setVentaID(int ventaID) {
		VentaID = ventaID;
	}
	public int getVehiculoID() {
		return VehiculoID;
	}
	public void setVehiculoID(int vehiculoID) {
		VehiculoID = vehiculoID;
	}
	public int getClienteID() {
		return ClienteID;
	}
	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}
	public int getEmpleadoID() {
		return EmpleadoID;
	}
	public void setEmpleadoID(int empleadoID) {
		EmpleadoID = empleadoID;
	}
	public Date getFechaVenta() {
		return FechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		FechaVenta = fechaVenta;
	}
	public double getPrecioFinal() {
		return PrecioFinal;
	}
	public void setPrecioFinal(double precioFinal) {
		PrecioFinal = precioFinal;
	}
	@Override
	public String toString() {
		return "ventas [VentaID=" + VentaID + ", VehiculoID=" + VehiculoID + ", ClienteID=" + ClienteID
				+ ", EmpleadoID=" + EmpleadoID + ", FechaVenta=" + FechaVenta + ", PrecioFinal=" + PrecioFinal + "]";
	}
	
	
}
