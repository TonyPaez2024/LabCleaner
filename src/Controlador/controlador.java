package Controlador;

import java.io.File;
import java.sql.*;
import java.io.File.*;
import java.util.List;

import Controlador.driveFinding.*;
import Controlador.conexion.*;
import Controlador.lastScan.*;
import Controlador.scanner.*;

public class controlador {
    static String fileName = ".lnk";

    public static void main(String[] args) {
        String rutaUSB = "D:";
        File file = new File(rutaUSB);
        //Se selecciona la ruta usb a escanear


        //Se escanea los archivos
        List<String> foundFiles = scanner.searcher(file);
        for (String files : foundFiles) {
            try {
                if (conexion.archivoExiste(files)) {
                    System.out.println("Se comparo exitosamente");
                    System.out.println(files);
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        //Se eliminan los archivos escontrados y seleccionados


        //Se crea el archivo que indica la fecha del ultimo escaneo
        lastScan.createFile(rutaUSB);
    }
}
