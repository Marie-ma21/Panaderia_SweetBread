
import javax.swing.JOptionPane;

public class bebidas extends javax.swing.JPanel {

    Double Total=0.0;
    String informacion="";
    
    public bebidas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel15.setBackground(new java.awt.Color(0, 153, 0));
        jLabel15.setForeground(new java.awt.Color(51, 255, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galletaintegral.png"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setPreferredSize(new java.awt.Dimension(520, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bebidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 579, 37));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una bebida", "Coca Cola", "Naranjada", "Frappe", "Mocca", "Cafe", "Granizados", "Smoothies", " ", " ", " " }));
        jPanel1.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));
        jPanel1.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 120, -1));

        jButtonCalcular.setText("Calcular ");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jButtonMenu.setText("Nueva Compra");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        jLabel3.setText("2. Naranjada");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 100, -1));

        jLabel16.setBackground(new java.awt.Color(0, 153, 0));
        jLabel16.setForeground(new java.awt.Color(51, 255, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frappes100.jpg"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 100, 80));

        jLabel17.setBackground(new java.awt.Color(0, 153, 0));
        jLabel17.setForeground(new java.awt.Color(51, 255, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naranjada100.jpg"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, 80));

        jLabel18.setBackground(new java.awt.Color(0, 153, 0));
        jLabel18.setForeground(new java.awt.Color(51, 255, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe100.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 60));

        jLabel19.setBackground(new java.awt.Color(0, 153, 0));
        jLabel19.setForeground(new java.awt.Color(51, 255, 0));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mocca100.jpg"))); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 80));

        jLabel20.setBackground(new java.awt.Color(0, 153, 0));
        jLabel20.setForeground(new java.awt.Color(51, 255, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smoothies100.jpg"))); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, 60));

        jLabel21.setBackground(new java.awt.Color(0, 153, 0));
        jLabel21.setForeground(new java.awt.Color(51, 255, 0));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/granizado100.jpg"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 100, 60));

        jLabel22.setBackground(new java.awt.Color(0, 153, 0));
        jLabel22.setForeground(new java.awt.Color(51, 255, 0));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocacola100.jpg"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 80));

        jLabel5.setText("Total:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel6.setText("3. Frappe");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel7.setText("4. Mocca");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jLabel8.setText("5. Cafe");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel9.setText("6. Granizados");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel10.setText("7. Smoothies");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel11.setText("1. Coca-cola");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bebidas.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
         Double precioU = 0.0;

        switch (jComboBox.getSelectedIndex()) {
            case 1:
            precioU = 2500.0;
            break;
            case 2:
            precioU = 2000.0;
            break;
            case 3:
            precioU = 8000.0;
            break;
            case 4:
            precioU = 4500.0;
            break;
            case 5:
            precioU = 2500.0;
            break;
            case 6:
            precioU = 6500.0;
            break;
            case 7:
            precioU = 10250.0;
            break;
            
            default:
            JOptionPane.showMessageDialog(null, "Seleccione su producto(s)");
        }

        int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
        Double precioTotal = precioU * cantidad;
        jTextFieldTotal.setText(precioTotal+"");

        String texto = jComboBox.getSelectedItem()+" | "+cantidad+" | "+precioTotal;

        Informe informe = new Informe();
        Total +=precioTotal;
        informacion = informacion+"\n"+texto;
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        
        
        Interfaz_Panaderia inter = new Interfaz_Panaderia();
        //panaderia.totalCuenta(Total, informacion, false);
        //JOptionPane.showMessageDialog(null, informacion);
        inter.totalCuenta(Total, informacion);
        Total=0.0;
        informacion="";
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        Interfaz_Panaderia inter = new Interfaz_Panaderia();
        
        inter.nuevaCompra();
        jTextFieldTotal.setText("");
        jTextFieldCantidad.setText("");
        
    }//GEN-LAST:event_jButtonMenuActionPerformed
 private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButtonAgregarActionPerformed() {                                               
        // TODO add your handling code here:

        
        Interfaz_Panaderia inter = new Interfaz_Panaderia();
        //panaderia.totalCuenta(Total, informacion, false);
        //JOptionPane.showMessageDialog(null, informacion);
        inter.totalCuenta(Total, informacion);
        Total=0.0;
        informacion="";
        //JOptionPane.showMessageDialog(null, informacion);

    }                                              


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
