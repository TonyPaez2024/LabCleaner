
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

        Logo = new javax.swing.JLabel();
        Panel = new Vistas.PanelRound();
        detallesPendrive = new javax.swing.JLabel();
        barraCarga = new javax.swing.JProgressBar();
        nombrePendrive = new javax.swing.JLabel();
        scanButton = new javax.swing.JButton();
        elementosDefectuosos = new javax.swing.JLabel();
        buttonElementosDefectuso = new javax.swing.JButton();
        historialScan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 244, 240));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 440, 780));
        setMaximumSize(new java.awt.Dimension(440, 780));
        setMinimumSize(new java.awt.Dimension(440, 780));
        setResizable(false);
        setSize(new java.awt.Dimension(440, 780));
        getContentPane().setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo (1).png"))); // NOI18N
        getContentPane().add(Logo);
        Logo.setBounds(90, 70, 250, 110);

        Panel.setBackground(new java.awt.Color(4, 72, 96));
        Panel.setRoundBottomLeft(50);
        Panel.setRoundBottomRight(50);
        Panel.setRoundTopLeft(50);
        Panel.setRoundTopRight(50);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detallesPendrive.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        detallesPendrive.setForeground(new java.awt.Color(255, 255, 255));
        detallesPendrive.setText("12GB Disponibles de 28,8gb");
        Panel.add(detallesPendrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        barraCarga.setBackground(new java.awt.Color(239, 244, 240));
        barraCarga.setBorder(null);
        Panel.add(barraCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 20));

        nombrePendrive.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nombrePendrive.setForeground(new java.awt.Color(255, 255, 255));
        nombrePendrive.setText("Disco Local (C):");
        Panel.add(nombrePendrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(Panel);
        Panel.setBounds(60, 250, 320, 139);

        scanButton.setBackground(new java.awt.Color(239, 244, 240));
        scanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-escanear (2).png"))); // NOI18N
        scanButton.setBorder(null);
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(scanButton);
        scanButton.setBounds(90, 470, 238, 70);

        elementosDefectuosos.setBackground(new java.awt.Color(255, 255, 255));
        elementosDefectuosos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        elementosDefectuosos.setForeground(new java.awt.Color(58, 216, 152));
        elementosDefectuosos.setText("4");
        getContentPane().add(elementosDefectuosos);
        elementosDefectuosos.setBounds(350, 566, 30, 30);

        buttonElementosDefectuso.setBackground(new java.awt.Color(239, 244, 240));
        buttonElementosDefectuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-elementos-defectuosos (1) (1).png"))); // NOI18N
        buttonElementosDefectuso.setBorder(null);
        buttonElementosDefectuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElementosDefectusoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonElementosDefectuso);
        buttonElementosDefectuso.setBounds(10, 540, 410, 80);

        historialScan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        historialScan.setForeground(new java.awt.Color(58, 216, 152));
        historialScan.setText("Nunca");
        getContentPane().add(historialScan);
        historialScan.setBounds(190, 700, 50, 19);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 96));
        jLabel1.setText("Último escáner de virus:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 700, 180, 19);

        Fondo.setBackground(new java.awt.Color(239, 244, 240));
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 430, 780);

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
    private javax.swing.JLabel detallesPendrive;
    private javax.swing.JLabel elementosDefectuosos;
    private javax.swing.JLabel historialScan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombrePendrive;
    private javax.swing.JButton scanButton;
    // End of variables declaration//GEN-END:variables
}
