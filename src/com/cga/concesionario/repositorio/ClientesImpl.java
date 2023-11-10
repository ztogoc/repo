package com.cga.concesionario.repositorio;
import com.cga.concesionario.conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cga.concesionario.modelo.Cliente;
import java.sql.Connection;
public class ClientesImpl implements DAO<Cliente> {
	private Connection getConnection() throws SQLException{
		return connection.devolverCon();
}
	@Override
	public List<Cliente> listar() {
		List<Cliente> clientes=new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()){
			ResultSet registros =stmt.executeQuery("select * from clientes");
			while (registros.next()){
				Cliente cliente = metCliente(registros);
				clientes.add(cliente);
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	@Override
	public Cliente busquedaId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarRegistro(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unused")
	private Cliente metCliente(ResultSet results) throws SQLException {
		Cliente cliente = new Cliente(0, null, null, null, null, null, null);
		cliente.setClienteID(results.getInt(1));
		cliente.setNombre(results.getString(2));
		cliente.setApellido(results.getString(3));
		cliente.setDNI(results.getString(4));
		cliente.setTeléfono(results.getString(5));
		cliente.setEmail(results.getString(6));
		cliente.setDireccion(results.getString(7));
	return cliente;
	}

}
