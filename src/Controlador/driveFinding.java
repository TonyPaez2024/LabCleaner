package Controlador;

import java.io.File;


public class driveFinding {
    static String usbDevicePath = "/";



    public static String getDriveLetter(String usbDevicePath) {
        File usbDevice = new File(usbDevicePath);
        if (usbDevice.isDirectory()) {
            File[] roots = File.listRoots();
            for (File root : roots) {
                if (root.getAbsolutePath().equals(usbDevice.getAbsolutePath())) {
                    return root.getAbsolutePath();
                }
            }
        }
        return null; // dispositivo no encontrado
    }

    public static void getDeviceInfo() {
        File[] roots = File.listRoots();
        for (File root : roots) {
            long totalSpace = root.getTotalSpace();
            long freeSpace = root.getFreeSpace();
            long usedSpace = totalSpace - freeSpace;

            double totalGb = totalSpace / (1024 * 1024 * 1024.0);
            double freeGb = freeSpace / (1024 * 1024 * 1024.0);
            double usedGb = usedSpace / (1024 * 1024 * 1024.0);

            System.out.println("Dispositivo: " + root.getAbsolutePath());
            if (totalGb < 1) {
                System.out.printf("Espacio total: %.2f MB%n", totalGb * 1024);
                System.out.printf("Espacio libre: %.2f MB%n", freeGb * 1024);
                System.out.printf("Espacio ocupado: %.2f MB%n", usedGb * 1024);
            }else {
                System.out.printf("Espacio total: %.2f GB%n", totalGb);
                System.out.printf("Espacio libre: %.2f GB%n", freeGb);
                System.out.printf("Espacio ocupado: %.2f GB%n", usedGb);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String driveLetter = getDriveLetter(usbDevicePath);

        if (driveLetter != null) {
            driveFinding.getDeviceInfo();
        } else {
            System.out.println("Dispositivo no encontrado");
        }
    }
}