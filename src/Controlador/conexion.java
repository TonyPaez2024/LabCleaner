package Controlador;

import java.sql.*;

public class conexion {
    private static String url;
    private static String usuario;
    private static String contrasenna;
    private static Connection conexion;

    private static String query;
    private static PreparedStatement pstate;
    private static ResultSet rset;

    public conexion(String url, String usuario, String contrasenna) {
        this.url = url;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    public static void conectar(String fileName) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        conexion = DriverManager.getConnection(url, usuario, contrasenna);

        // Crea una consulta SQL con un parámetro
        query = "Select * from files where file like ?";
        pstate = conexion.prepareStatement(query);
        pstate.setString(1, "%" + fileName + "%"); // Establece el valor del parámetro

        // Ejecuta la consulta y recorre el resultado
        rset = pstate.executeQuery();
    }

    public static boolean archivoExiste(String fileName) throws SQLException, ClassNotFoundException {
        conexion conexion = new conexion("jdbc:mysql://127.0.0.1:3306/archivos", "root", "123456789");
        conectar(fileName);
        boolean exists = false;
        if (rset.next()) {
            String dbFileName = rset.getString("file");
            if (dbFileName.equals(fileName)) {
                exists = true;
            }
        }
        return exists;
    }
}