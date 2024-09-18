package Controlador;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class driveFinding {

    private static String getDeviceLabel(String usbDevicePath) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File file = new File(usbDevicePath);
        return fsv.getSystemDisplayName(file);
    }

    public static List<DeviceInfo> getDeviceInfo() {
        List<DeviceInfo> devices = new ArrayList<>();
        File[] roots = File.listRoots();
        for (File root : roots) {
            long totalSpace = root.getTotalSpace();
            long freeSpace = root.getFreeSpace();
            long usedSpace = totalSpace - freeSpace;

            double totalGb = totalSpace / (1024 * 1024 * 1024.0);
            double freeGb = freeSpace / (1024 * 1024 * 1024.0);
            double usedGb = usedSpace / (1024 * 1024 * 1024.0);

            String deviceLabel = getDeviceLabel(root.getAbsolutePath());

            DeviceInfo device = new DeviceInfo(
                    root.getAbsolutePath(),
                    deviceLabel,
                    totalGb,
                    freeGb,
                    usedGb
            );
            devices.add(device);
        }
        return devices;
    }

    public static class DeviceInfo {
        private String devicePath;
        private String deviceLabel;
        private double totalSpace;
        private double freeSpace;
        private double usedSpace;

        public DeviceInfo(String devicePath, String deviceLabel, double totalSpace, double freeSpace, double usedSpace) {
            this.devicePath = devicePath;
            this.deviceLabel = deviceLabel;
            this.totalSpace = totalSpace;
            this.freeSpace = freeSpace;
            this.usedSpace = usedSpace;
        }

        public String getDevicePath() {
            return devicePath;
        }

        public String getDeviceLabel() {
            return deviceLabel;
        }

        public double getTotalSpace() {
            return totalSpace;
        }

        public double getFreeSpace() {
            return freeSpace;
        }

        public double getUsedSpace() {
            return usedSpace;
        }
    }

    public static void main(String[] args) {
        List<DeviceInfo> devices = getDeviceInfo();
        for (DeviceInfo device : devices) {
            System.out.println("Dispositivo: " + device.getDevicePath());
            System.out.println("Etiqueta del dispositivo: " + device.getDeviceLabel());
            System.out.printf("Espacio total: %.2f GB%n", device.getTotalSpace());
            System.out.printf("Espacio libre: %.2f GB%n", device.getFreeSpace());
            System.out.printf("Espacio ocupado: %.2f GB%n", device.getUsedSpace());
            System.out.println();
        }
    }
}