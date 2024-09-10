package Controlador;

import java.sql.*;

import Controlador.driveFinding;
import Controlador.conexion.*;

public class controlador {
    public static void main(String[] args) {
        String fileName = ".lnk";
        try {
            if (conexion.archivoExiste(fileName)) {
                System.out.println("Se comparo exitosamente");
            } else {
                System.out.println("No se encontró el archivo en la base de datos");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
