/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones;

import entidades.Movimiento;

/**
 *
 * @author LUCANO
 */
public class IFrmDatosMovimientoObtenidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmDatosMovimientoObtenidos
     */
    private Movimiento movimiento;
    
    public IFrmDatosMovimientoObtenidos() {
        this.movimiento = IFrmConsultarDatosMovimiento.getMovimiento();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tituloPanel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtImporte = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelCodigo1 = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        cbxAño = new javax.swing.JComboBox<>();
        txtCode = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        labelCodigo2 = new javax.swing.JLabel();
        labelCodigo3 = new javax.swing.JLabel();
        labelCodigo4 = new javax.swing.JLabel();
        labelCodigo5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel1.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel1.setText("Datos del Movimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloPanel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código de la cuenta:");

        labelCodigo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo1.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo1.setText("Número de Movimiento:");

        cbxDia.setBackground(new java.awt.Color(255, 255, 255));
        cbxDia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxDia.setForeground(new java.awt.Color(0, 0, 0));
        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbxMes.setBackground(new java.awt.Color(255, 255, 255));
        cbxMes.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxMes.setForeground(new java.awt.Color(0, 0, 0));
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbxAño.setBackground(new java.awt.Color(255, 255, 255));
        cbxAño.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxAño.setForeground(new java.awt.Color(0, 0, 0));
        cbxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA", "2010", "2011", "2012", "2013", "2014", "2015", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        cbxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAñoActionPerformed(evt);
            }
        });

        labelCodigo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo2.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo2.setText("Fecha:");

        labelCodigo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo3.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo3.setText("Importe:");

        labelCodigo4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo4.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo4.setText("Estado:");

        labelCodigo5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo5.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo5.setText("Referencia:");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.gif"))); // NOI18N
        btnRegistrar.setMnemonic('R');
        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.gif"))); // NOI18N
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCodigo3)
                        .addGap(188, 188, 188)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addComponent(txtImporte)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(labelCodigo1))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum)
                            .addComponent(txtCode)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCodigo5)
                        .addGap(174, 174, 174)
                        .addComponent(txtReferencia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCodigo4)
                        .addGap(196, 196, 196)
                        .addComponent(txtEstado)))
                .addGap(102, 102, 102))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnRegistrar)
                .addGap(105, 105, 105)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo1)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigo2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo3))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCodigo5)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo4))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegistrar))
                .addGap(90, 90, 90))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAñoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtCode.setText(movimiento.getCuencodigo());
        txtNum.setText(String.valueOf(movimiento.getMovinumero()));
        txtImporte.setText(String.valueOf(movimiento.getImporte()));
        txtReferencia.setText(movimiento.getCuenReferencia());
        txtEstado.setText(String.valueOf(movimiento.getEstado()));
        int dia = movimiento.getFecha().getDate();
        cbxDia.setSelectedItem(String.valueOf(dia));
        int mes = movimiento.getFecha().getMonth() + 1; 
        cbxMes.setSelectedItem(String.valueOf(mes));
        int año = movimiento.getFecha().getYear() + 1900 ;
        cbxAño.setSelectedItem(String.valueOf(año));
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxAño;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigo1;
    private javax.swing.JLabel labelCodigo2;
    private javax.swing.JLabel labelCodigo3;
    private javax.swing.JLabel labelCodigo4;
    private javax.swing.JLabel labelCodigo5;
    private javax.swing.JLabel tituloPanel1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
