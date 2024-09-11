package Controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;


public class scanner {
    static List<String> searcher(File file) {
        List<String> foundFiles = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        queue.add(file);

        while (!queue.isEmpty()) {
            File currentFile = queue.poll();
            if (currentFile.isDirectory()) {
                File[] files = currentFile.listFiles();
                if (files != null) {
                    for (File f : files) {
                        queue.add(f);
                    }
                } else {
                    System.out.println("No se puede leer el contenido del directorio.");
                }
            } else {
                foundFiles.add(currentFile.getName()); // Solo guardamos el nombre del archivo
            }
        }
        return foundFiles;
    }
}