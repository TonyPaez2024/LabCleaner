package Vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class ModuloPrincipal extends javax.swing.JFrame {

    Timer t;
    ActionListener ac;
    int x = 0;

    public ModuloPrincipal() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);

        //ESQUINAS REDONDEADAS 
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 33, 33));

        progressBar.setUI(new BasicProgressBarUI() {
            @Override
            protected void paintDeterminate(Graphics g, JComponent c) {
                Graphics2D g2d = (Graphics2D) g;

                // Activar suavizado para bordes más suaves
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Obtener dimensiones del JProgressBar
                int ancho = progressBar.getWidth();
                int alto = progressBar.getHeight();

                // Definir márgenes
                int margen = 2;

                // Calcular el área donde dibujar el progreso (dentro del margen)
                int espacioAncho = ancho - 2 * margen;
                int espacioAlto = alto - 2 * margen;

                // Esquinas redondeadas: radio
                int radioEsquina = 20;

                // Dibujar el fondo del ProgressBar con esquinas redondeadas
                g2d.setColor(Color.decode("#044860")); // Color para el fondo
                g2d.fillRoundRect(margen, margen, espacioAncho, espacioAlto, radioEsquina, radioEsquina);

                // Obtener el porcentaje de progreso (de 0.0 a 1.0)
                double porcentajeProgress = progressBar.getPercentComplete();
                if (porcentajeProgress < 0) {
                    porcentajeProgress = 0;
                }

                // Calcular el ancho del progreso basado en el porcentaje
                int progresoAncho = (int) (espacioAncho * porcentajeProgress);

                // Dibujar el progreso con esquinas redondeadas
                g2d.setColor(Color.decode("#EFF4F0"));
                g2d.fillRoundRect(margen, margen, progresoAncho, espacioAlto, radioEsquina, radioEsquina);

                // Dibujar un borde redondeado fijo, independiente del progreso
                g2d.setColor(Color.decode("#EFF4F0"));
                Stroke bordeGrosor = new BasicStroke(3); // Grosor del borde
                g2d.setStroke(bordeGrosor);

                // Dibujar el borde alrededor de toda la barra de progreso
                g2d.drawRoundRect(margen, margen, espacioAncho, espacioAlto, radioEsquina, radioEsquina);
            }
        });

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                x = x + 1;
                progressBar.setValue(x);
            }
        };

        t = new Timer(50, ac);
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modoDark = new javax.swing.JButton();
        escanear = new javax.swing.JLabel();
        defectuoso = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Panel = new Vistas.PanelRound();
        detallesPendrive = new javax.swing.JLabel();
        elementos = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        btnListarDrive = new javax.swing.JButton();
        scanButton = new javax.swing.JButton();
        elementosDefectuosos = new javax.swing.JLabel();
        buttonElementosDefectuso = new javax.swing.JButton();
        historialScan = new javax.swing.JLabel();
        historial = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 244, 240));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 440, 780));
        setMaximumSize(new java.awt.Dimension(430, 780));
        setMinimumSize(new java.awt.Dimension(430, 780));
        setResizable(false);
        setSize(new java.awt.Dimension(440, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modoDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icono-sol.png"))); // NOI18N
        modoDark.setBorder(null);
        modoDark.setBorderPainted(false);
        modoDark.setContentAreaFilled(false);
        modoDark.setFocusPainted(false);
        modoDark.setFocusable(false);
        modoDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoDarkActionPerformed(evt);
            }
        });
        getContentPane().add(modoDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 710, -1, 30));

        escanear.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        escanear.setForeground(new java.awt.Color(255, 255, 255));
        escanear.setText("Escanear");
        getContentPane().add(escanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, 40));

        defectuoso.setBackground(new java.awt.Color(255, 255, 255));
        defectuoso.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        defectuoso.setForeground(new java.awt.Color(4, 72, 96));
        defectuoso.setText("Elementos Defectuoso:");
        getContentPane().add(defectuoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimizar (4)_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 30));

        Logo.setBackground(new java.awt.Color(239, 244, 240));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo-labcleaner-.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 110));

        Panel.setBackground(new java.awt.Color(4, 72, 96));
        Panel.setRoundBottomLeft(50);
        Panel.setRoundBottomRight(50);
        Panel.setRoundTopLeft(50);
        Panel.setRoundTopRight(50);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detallesPendrive.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        detallesPendrive.setForeground(new java.awt.Color(255, 255, 255));
        detallesPendrive.setText("12GB Disponibles de 28,8gb");
        Panel.add(detallesPendrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        elementos.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        elementos.setForeground(new java.awt.Color(255, 255, 255));
        elementos.setText("Disco Local (C):");
        Panel.add(elementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        progressBar.setBackground(new java.awt.Color(4, 72, 96));
        progressBar.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 20));

        btnListarDrive.setBackground(new java.awt.Color(4, 72, 96));
        btnListarDrive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-abajo.png"))); // NOI18N
        btnListarDrive.setToolTipText("");
        btnListarDrive.setBorder(null);
        btnListarDrive.setBorderPainted(false);
        btnListarDrive.setContentAreaFilled(false);
        btnListarDrive.setFocusPainted(false);
        btnListarDrive.setFocusable(false);
        btnListarDrive.setRequestFocusEnabled(false);
        btnListarDrive.setRolloverEnabled(false);
        btnListarDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDriveActionPerformed(evt);
            }
        });
        Panel.add(btnListarDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 30));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 320, 140));

        scanButton.setBackground(new java.awt.Color(239, 244, 240));
        scanButton.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        scanButton.setForeground(new java.awt.Color(255, 255, 255));
        scanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-escanear-.png"))); // NOI18N
        scanButton.setBorder(null);
        scanButton.setBorderPainted(false);
        scanButton.setContentAreaFilled(false);
        scanButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scanButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-escanear-oscuro.png"))); // NOI18N
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(scanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, 60));

        elementosDefectuosos.setBackground(new java.awt.Color(255, 255, 255));
        elementosDefectuosos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        elementosDefectuosos.setForeground(new java.awt.Color(58, 216, 152));
        elementosDefectuosos.setText("4");
        getContentPane().add(elementosDefectuosos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 30, 40));

        buttonElementosDefectuso.setBackground(new java.awt.Color(239, 244, 240));
        buttonElementosDefectuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-elementos.png"))); // NOI18N
        buttonElementosDefectuso.setBorder(null);
        buttonElementosDefectuso.setContentAreaFilled(false);
        buttonElementosDefectuso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-elementos-oscuro.png"))); // NOI18N
        buttonElementosDefectuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElementosDefectusoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonElementosDefectuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, 60));

        historialScan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        historialScan.setForeground(new java.awt.Color(21, 110, 74));
        historialScan.setText("Nunca");
        getContentPane().add(historialScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, 50, -1));

        historial.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        historial.setForeground(new java.awt.Color(4, 72, 96));
        historial.setText("Último escáner de virus:");
        getContentPane().add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 180, -1));

        jButton1.setBackground(new java.awt.Color(239, 244, 240));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cerrar (1).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 30));

        Fondo.setBackground(new java.awt.Color(239, 244, 240));
        Fondo.setMaximumSize(new java.awt.Dimension(430, 780));
        Fondo.setMinimumSize(new java.awt.Dimension(430, 780));
        Fondo.setPreferredSize(new java.awt.Dimension(430, 780));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 780));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scanButtonActionPerformed

    private void buttonElementosDefectusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElementosDefectusoActionPerformed
        Confirmar confirmar = new Confirmar();
        confirmar.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_buttonElementosDefectusoActionPerformed

    private void btnListarDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarDriveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(ModuloPrincipal.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void modoDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoDarkActionPerformed

        
      
    }//GEN-LAST:event_modoDarkActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //Temas y colores
        //FlatDarkLaf() este es el modo oscuro
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
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
    private javax.swing.JButton btnListarDrive;
    private javax.swing.JButton buttonElementosDefectuso;
    private javax.swing.JLabel defectuoso;
    private javax.swing.JLabel detallesPendrive;
    private javax.swing.JLabel elementos;
    private javax.swing.JLabel elementosDefectuosos;
    private javax.swing.JLabel escanear;
    private javax.swing.JLabel historial;
    private javax.swing.JLabel historialScan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modoDark;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton scanButton;
    // End of variables declaration//GEN-END:variables
}
