package Controlador;

import java.sql.*;

public class conexion {
    private static String url;
    private static String usuario;
    private static String contrasenna;
    private static Connection conexion;

    public conexion(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    public static void conectar() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, contrasenna);
        System.out.println("Conectado a la base de datos");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        conexion conexion = new conexion("jdbc:mysql://localhost:3306/archivos", "root", "123456789");
        conectar();
    }
}