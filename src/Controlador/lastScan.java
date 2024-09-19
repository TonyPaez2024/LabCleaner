package Controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.io.File;

public class lastScan {


    public static void createFile(String rutaUSB) {
        Date fecha = new Date();
        File lastScan = new File(rutaUSB + "/lastScan.txt");
        if(lastScan.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(lastScan))) {
                writer.write(String.valueOf(fecha));
                System.out.println("Se actualizo el archivo");
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(lastScan))) {
                writer.write(String.valueOf(fecha));
                System.out.println("Se creo el archivo");
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

}
