/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author roy_z
 */
public class registro extends javax.swing.JPanel {

    /**
     * Creates new form registro
     */
    public registro() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
<<<<<<< Updated upstream
        jLabelNombre = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelFechaLlegada = new javax.swing.JLabel();
        jLabelNumeroPersonas = new javax.swing.JLabel();
        jLabelFechaSalida = new javax.swing.JLabel();
        jLabelHabitacionTipo = new javax.swing.JLabel();
        jLabelNumeroPiso = new javax.swing.JLabel();
        jLabelLimiteHuesped = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
=======
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldNombreHuesped = new javax.swing.JTextField();
>>>>>>> Stashed changes
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldLimiteHuesped = new javax.swing.JTextField();
        jDateChooserFechaLlegada = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaSalida = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< Updated upstream
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxHabitacionTipo = new javax.swing.JComboBox<>();
        jLabelHabitacionNumero = new javax.swing.JLabel();
        jSpinnerNumeroPersona = new javax.swing.JSpinner();
        jTextFieldHabitacionNumero = new javax.swing.JTextField();
        jSpinnerNumeroPiso = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
=======
        jTextAreaTicket = new javax.swing.JTextArea();
        jComboBoxTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerNumeroPersonas = new javax.swing.JSpinner();
        jTextFieldNumeroHabitacion = new javax.swing.JTextField();
        jSpinnerNumeroPiso = new javax.swing.JSpinner();
        jCheckBox1personaextra = new javax.swing.JCheckBox();
        jCheckBox2personaextra = new javax.swing.JCheckBox();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
>>>>>>> Stashed changes

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

<<<<<<< Updated upstream
        jLabelNombre.setText("NOMBRE DEL HUESPED");

        jLabelTitulo.setText("R E G I S T R O ");

        jLabelCiudad.setText("CIUDAD DE ORIGEN");

        jLabelFechaLlegada.setText("FECHA DE LLEGADA");

        jLabelNumeroPersonas.setText("NUMERO DE PERSONAS");

        jLabelFechaSalida.setText("FECHA DE SALIDA");

        jLabelHabitacionTipo.setText("TIPO DE HABITACION");

        jLabelNumeroPiso.setText("NUMERO DE PISO");

        jLabelLimiteHuesped.setText("LIMITE HUESPED");

=======
        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel7.setText("NOMBRE DEL HUESPED");

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 1, 26)); // NOI18N
        jLabel8.setText("R E G I S T R O ");

        jLabel13.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel13.setText("CIUDAD DE ORIGEN");

        jLabel14.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel14.setText("FECHA DE LLEGADA");

        jLabel15.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel15.setText("NUMERO DE PERSONAS");

        jLabel16.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel16.setText("FECHA DE SALIDA");

        jLabel17.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel17.setText("TIPO DE HABITACION");

        jLabel20.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel20.setText("NUMERO DE PISO");

        jLabel23.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel23.setText("LIMITE HUESPED");

        jTextFieldNombreHuesped.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N

        jTextFieldCiudad.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N

        jTextFieldLimiteHuesped.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
>>>>>>> Stashed changes
        jTextFieldLimiteHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLimiteHuespedActionPerformed(evt);
            }
        });

        jTextAreaTicket.setColumns(20);
        jTextAreaTicket.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTicket);

<<<<<<< Updated upstream
        jComboBoxHabitacionTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelHabitacionNumero.setText("NUMERO DE HABITACION");
=======
        jComboBoxTipoHabitacion.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
        jComboBoxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sencilla", "Doble", "Triple" }));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel1.setText("NUMERO DE HABITACION");

        jSpinnerNumeroPersonas.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
>>>>>>> Stashed changes

        jTextFieldNumeroHabitacion.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N

        jSpinnerNumeroPiso.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N

        jCheckBox1personaextra.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jCheckBox1personaextra.setText("1 PERSONA EXTRA");

        jCheckBox2personaextra.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jCheckBox2personaextra.setText("2 PERSONA EXTRA");

        jButtonRegistrar.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
        jButtonRegistrar.setText("REGISTRAR");

        jButtonLimpiar.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
        jButtonLimpiar.setText("LIMPIAR");

        jButtonMostrar.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
        jButtonMostrar.setText("MOSTRAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< Updated upstream
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelFechaSalida)
                            .addComponent(jLabelHabitacionNumero)
                            .addComponent(jLabelHabitacionTipo)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1)
                                .addComponent(jLabelNumeroPersonas)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFechaLlegada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldCiudad)
                            .addComponent(jDateChooserFechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                        .addGap(121, 121, 121)
                        .addComponent(jCheckBox1personaextra)
                        .addGap(26, 26, 26)
                        .addComponent(jCheckBox2personaextra))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> Stashed changes
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
<<<<<<< Updated upstream
                                    .addComponent(jButton2)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSpinnerNumeroPersona, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldHabitacionNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(jComboBoxHabitacionTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabelNumeroPiso))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelLimiteHuesped)
                                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinnerNumeroPiso, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(jTextFieldLimiteHuesped)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabelTitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
=======
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonRegistrar)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooserFechaLlegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNombreHuesped)
                                .addComponent(jDateChooserFechaSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSpinnerNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldNumeroHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel20)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jButtonLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonMostrar)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinnerNumeroPiso, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLimiteHuesped))))))
                .addGap(21, 21, 21)
>>>>>>> Stashed changes
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< Updated upstream
                                .addComponent(jLabelTitulo)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCiudad)
                                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelFechaLlegada))
                            .addComponent(jDateChooserFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFechaSalida)
                            .addComponent(jDateChooserFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHabitacionTipo)
                            .addComponent(jLabelLimiteHuesped)
                            .addComponent(jTextFieldLimiteHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHabitacionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHabitacionNumero)
                            .addComponent(jLabelNumeroPiso)
                            .addComponent(jTextFieldHabitacionNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumeroPersonas)
                            .addComponent(jSpinnerNumeroPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
=======
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldNombreHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addComponent(jDateChooserFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jDateChooserFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23))
                            .addComponent(jLabel17))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldLimiteHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
>>>>>>> Stashed changes
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jSpinnerNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jSpinnerNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1personaextra)
                    .addComponent(jCheckBox2personaextra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonRegistrar))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

<<<<<<< Updated upstream
        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooserFechaLlegada, jDateChooserFechaSalida, jTextFieldCiudad, jTextFieldNombre});
=======
        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooserFechaLlegada, jDateChooserFechaSalida, jTextFieldCiudad, jTextFieldNombreHuesped});
>>>>>>> Stashed changes

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLimiteHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLimiteHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLimiteHuespedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< Updated upstream
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBoxHabitacionTipo;
    private com.toedter.calendar.JDateChooser jDateChooserFechaLlegada;
    private com.toedter.calendar.JDateChooser jDateChooserFechaSalida;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelFechaLlegada;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JLabel jLabelHabitacionNumero;
    private javax.swing.JLabel jLabelHabitacionTipo;
    private javax.swing.JLabel jLabelLimiteHuesped;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroPersonas;
    private javax.swing.JLabel jLabelNumeroPiso;
    private javax.swing.JLabel jLabelTitulo;
=======
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JCheckBox jCheckBox1personaextra;
    private javax.swing.JCheckBox jCheckBox2personaextra;
    private javax.swing.JComboBox<String> jComboBoxTipoHabitacion;
    private com.toedter.calendar.JDateChooser jDateChooserFechaLlegada;
    private com.toedter.calendar.JDateChooser jDateChooserFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
>>>>>>> Stashed changes
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
<<<<<<< Updated upstream
    private javax.swing.JSpinner jSpinnerNumeroPersona;
    private javax.swing.JSpinner jSpinnerNumeroPiso;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldHabitacionNumero;
    private javax.swing.JTextField jTextFieldLimiteHuesped;
    private javax.swing.JTextField jTextFieldNombre;
=======
    private javax.swing.JSpinner jSpinnerNumeroPersonas;
    private javax.swing.JSpinner jSpinnerNumeroPiso;
    private javax.swing.JTextArea jTextAreaTicket;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldLimiteHuesped;
    private javax.swing.JTextField jTextFieldNombreHuesped;
    private javax.swing.JTextField jTextFieldNumeroHabitacion;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}
