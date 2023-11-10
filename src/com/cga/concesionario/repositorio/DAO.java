package com.cga.concesionario.repositorio;
import java.util.List;

public interface DAO<T>{
	// Método listar que devuelve una lista
	List<T> listar();
	//Método de búsqueda por ID
	T busquedaId(int id);
	//Método guardar
	void insertarRegistro(T t);
	//Método eliminar 
	void eliminar(int id);
	
}