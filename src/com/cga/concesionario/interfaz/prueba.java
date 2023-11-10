package com.cga.concesionario.interfaz;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

// Clase que representa un coche
class Car {
  // Atributos del coche
  private int id;
  private String brand;
  private String model;
  private String color;
  private double price;

  // Constructor del coche
  public Car(int id, String brand, String model, String color, double price) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.price = price;
  }

  // Métodos para obtener los atributos del coche
  public int getId() {
    return id;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public double getPrice() {
    return price;
  }
}

// Clase que se conecta a la base de datos y obtiene los datos de los coches
class CarDAO {
  // Atributos para la conexión a la base de datos
  private String url = "jdbc:sqlserver://localhost:3306;databaseName=concesionario";
  private String user = "root";
  private String password = "CGA2023";

  // Método que devuelve una lista de coches
  public List<Car> getvehiculo() {
    // Crear una lista vacía de coches
    List<Car> vehiculo = new ArrayList<>();

    // Crear una conexión a la base de datos
    try (Connection con = DriverManager.getConnection(url, user, password)) {
      // Crear una sentencia sql
      String sql = "SELECT * FROM vehiculo";
      Statement stmt = con.createStatement();

      // Ejecutar la sentencia y obtener el resultado
      ResultSet rs = stmt.executeQuery(sql);

      // Recorrer el resultado y crear los objetos coche
      while (rs.next()) {
        // Obtener los valores de las columnas
        int id = rs.getInt("id");
        String brand = rs.getString("brand");
        String model = rs.getString("model");
        String color = rs.getString("color");
        double price = rs.getDouble("price");

        // Crear el objeto coche
        Car car = new Car(id, brand, model, color, price);

        // Añadir el coche a la lista
        vehiculo.add(car);
      }
    } catch (SQLException e) {
      // Mostrar el error en caso de excepción
      e.printStackTrace();
    }

    // Devolver la lista de coches
    return vehiculo;
  }
}

// Clase que crea la interfaz gráfica de usuario que muestra los datos de los coches
class CarGUI {
  // Atributos para la interfaz gráfica de usuario
  private JFrame frame;
  private JTable table;
  private JScrollPane scrollPane;

  // Constructor de la interfaz gráfica de usuario
  public CarGUI() {
    // Crear el objeto que se conecta a la base de datos y obtiene los datos de los coches
    CarDAO carDAO = new CarDAO();

    // Obtener la lista de coches
    List<Car> vehiculo = carDAO.getvehiculo();

    // Crear el modelo de la tabla
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[] {"ID", "Marca", "Modelo", "Color", "Precio"});

    // Añadir los datos de los coches al modelo de la tabla
    for (Car car : vehiculo) {
      model.addRow(new Object[] {car.getId(), car.getBrand(), car.getModel(), car.getColor(), car.getPrice()});
    }

    // Crear la tabla con el modelo
    table = new JTable(model);

    // Crear el panel de desplazamiento con la tabla
    scrollPane = new JScrollPane(table);

    // Crear el marco con el panel de desplazamiento
    frame = new JFrame("Datos de los coches");
    frame.add(scrollPane);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  // Método principal para ejecutar la interfaz gráfica de usuario
  public static void main(String[] args) {
    // Crear el objeto de la interfaz gráfica de usuario
    CarGUI carGUI = new CarGUI();
  }
}