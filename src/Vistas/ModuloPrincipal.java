
package Vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ModuloPrincipal extends javax.swing.JFrame {

    public ModuloPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 //esto es un cambio realizado
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escanear = new javax.swing.JLabel();
        defectuoso = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Panel = new Vistas.PanelRound();
        detallesPendrive = new javax.swing.JLabel();
        elementos = new javax.swing.JLabel();
        barraCarga = new javax.swing.JProgressBar();
        scanButton = new javax.swing.JButton();
        elementosDefectuosos = new javax.swing.JLabel();
        buttonElementosDefectuso = new javax.swing.JButton();
        historialScan = new javax.swing.JLabel();
        historial = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 244, 240));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 440, 780));
        setMinimumSize(new java.awt.Dimension(440, 780));
        setResizable(false);
        setSize(new java.awt.Dimension(440, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escanear.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        escanear.setForeground(new java.awt.Color(255, 255, 255));
        escanear.setText("Escanear");
        getContentPane().add(escanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        defectuoso.setBackground(new java.awt.Color(255, 255, 255));
        defectuoso.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        defectuoso.setForeground(new java.awt.Color(4, 72, 96));
        defectuoso.setText("Elementos Defectuoso:");
        getContentPane().add(defectuoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));

        Logo.setBackground(new java.awt.Color(239, 244, 240));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo-labcleaner-.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 110));

        Panel.setBackground(new java.awt.Color(4, 72, 96));
        Panel.setRoundBottomLeft(50);
        Panel.setRoundBottomRight(50);
        Panel.setRoundTopLeft(50);
        Panel.setRoundTopRight(50);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detallesPendrive.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        detallesPendrive.setForeground(new java.awt.Color(255, 255, 255));
        detallesPendrive.setText("12GB Disponibles de 28,8gb");
        Panel.add(detallesPendrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        elementos.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        elementos.setForeground(new java.awt.Color(255, 255, 255));
        elementos.setText("Disco Local (C):");
        Panel.add(elementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        barraCarga.setBackground(new java.awt.Color(4, 72, 96));
        barraCarga.setForeground(new java.awt.Color(255, 255, 255));
        barraCarga.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Panel.add(barraCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 20));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 139));

        scanButton.setBackground(new java.awt.Color(239, 244, 240));
        scanButton.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        scanButton.setForeground(new java.awt.Color(255, 255, 255));
        scanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-escanear-.png"))); // NOI18N
        scanButton.setBorder(null);
        scanButton.setBorderPainted(false);
        scanButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scanButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(scanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, 70));

        elementosDefectuosos.setBackground(new java.awt.Color(255, 255, 255));
        elementosDefectuosos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        elementosDefectuosos.setForeground(new java.awt.Color(58, 216, 152));
        elementosDefectuosos.setText("4");
        getContentPane().add(elementosDefectuosos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 30, 40));

        buttonElementosDefectuso.setBackground(new java.awt.Color(239, 244, 240));
        buttonElementosDefectuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-elementos.png"))); // NOI18N
        buttonElementosDefectuso.setBorder(null);
        buttonElementosDefectuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElementosDefectusoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonElementosDefectuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 400, 80));

        historialScan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        historialScan.setForeground(new java.awt.Color(58, 216, 152));
        historialScan.setText("Nunca");
        getContentPane().add(historialScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 50, -1));

        historial.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        historial.setForeground(new java.awt.Color(4, 72, 96));
        historial.setText("Último escáner de virus:");
        getContentPane().add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 180, -1));

        Fondo.setBackground(new java.awt.Color(239, 244, 240));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 440, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scanButtonActionPerformed

    private void buttonElementosDefectusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElementosDefectusoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonElementosDefectusoActionPerformed

    public static void main(String args[]) {
      

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         //Temas y colores
        //FlatDarkLaf() este es el modo oscuro
         try {
            FlatLightLaf.setup(); 
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private Vistas.PanelRound Panel;
    private javax.swing.JProgressBar barraCarga;
    private javax.swing.JButton buttonElementosDefectuso;
    private javax.swing.JLabel defectuoso;
    private javax.swing.JLabel detallesPendrive;
    private javax.swing.JLabel elementos;
    private javax.swing.JLabel elementosDefectuosos;
    private javax.swing.JLabel escanear;
    private javax.swing.JLabel historial;
    private javax.swing.JLabel historialScan;
    private javax.swing.JButton scanButton;
    // End of variables declaration//GEN-END:variables
}
