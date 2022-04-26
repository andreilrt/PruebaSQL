package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaInicial extends javax.swing.JFrame {

    
    public VistaInicial() {
        initComponents();
    }

 
    public JButton getjBtnRegEmp() {
        return jBtnRegEmp;
    }

    public JButton getjBtnRegPer() {
        return jBtnRegPer;
    }

    public JButton getjBtnSal() {
        return jBtnSal;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTxtNombres() {
        return jTxtNombres;
    }

    public JButton getjBtnGuarPers() {
        return jBtnGuarPers;
    }

    public JComboBox<String> getjCmBoxDoc() {
        return jCmBoxDoc;
    }

    public JTextField getjTxtApellidos() {
        return jTxtApellidos;
    }

    public JTextField getjTxtDoc() {
        return jTxtDoc;
    }

    public JTextField getjTxtTelPer() {
        return jTxtTelPer;
    }

    public JPanel getjPanEmp() {
        return jPanEmp;
    }

    public JPanel getjPanPer() {
        return jPanPer;
    }

    public JButton getjBtnGuarEmp() {
        return jBtnGuarEmp;
    }

    public JTextField getjTxtDir() {
        return jTxtDir;
    }

    public JTextField getjTxtEmail() {
        return jTxtEmail;
    }

    public JTextField getjTxtNIT() {
        return jTxtNIT;
    }

    public JTextField getjTxtRazSoc() {
        return jTxtRazSoc;
    }

    public JTextField getjTxtTelEmp() {
        return jTxtTelEmp;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnRegEmp = new javax.swing.JButton();
        jBtnRegPer = new javax.swing.JButton();
        jBtnSal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanPer = new javax.swing.JPanel();
        jTxtNombres = new javax.swing.JTextField();
        jTxtApellidos = new javax.swing.JTextField();
        jTxtDoc = new javax.swing.JTextField();
        jCmBoxDoc = new javax.swing.JComboBox<>();
        jTxtTelPer = new javax.swing.JTextField();
        jBtnGuarPers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanEmp = new javax.swing.JPanel();
        jTxtRazSoc = new javax.swing.JTextField();
        jTxtNIT = new javax.swing.JTextField();
        jTxtDir = new javax.swing.JTextField();
        jTxtTelEmp = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jBtnGuarEmp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnRegEmp.setBackground(new java.awt.Color(154, 231, 180));
        jBtnRegEmp.setText("Registrar Empresa");
        jPanel1.add(jBtnRegEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 160, 30));

        jBtnRegPer.setBackground(new java.awt.Color(154, 231, 180));
        jBtnRegPer.setText("Registrar Persona");
        jPanel1.add(jBtnRegPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 30));

        jBtnSal.setBackground(new java.awt.Color(240, 99, 126));
        jBtnSal.setText("Salir");
        jPanel1.add(jBtnSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/empresa.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 140, 160));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT Condensed", 3, 48)); // NOI18N
        jLabel3.setText("PRINCIPAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 200, 80));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT Condensed", 3, 48)); // NOI18N
        jLabel4.setText("MENÚ ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 310, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/persona.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 310));

        jPanPer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtNombres.setForeground(new java.awt.Color(153, 153, 153));
        jTxtNombres.setText("Nombres");
        jTxtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtNombresFocusLost(evt);
            }
        });
        jTxtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombresActionPerformed(evt);
            }
        });
        jPanPer.add(jTxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, -1));

        jTxtApellidos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtApellidos.setForeground(new java.awt.Color(153, 153, 153));
        jTxtApellidos.setText("Apellidos");
        jTxtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtApellidosFocusLost(evt);
            }
        });
        jPanPer.add(jTxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 530, -1));

        jTxtDoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtDoc.setForeground(new java.awt.Color(153, 153, 153));
        jTxtDoc.setText("Nro. Documento");
        jTxtDoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtDocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtDocFocusLost(evt);
            }
        });
        jPanPer.add(jTxtDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 460, 30));

        jCmBoxDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI" }));
        jPanPer.add(jCmBoxDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTxtTelPer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtTelPer.setForeground(new java.awt.Color(153, 153, 153));
        jTxtTelPer.setText("Nro. Telefono");
        jTxtTelPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtTelPerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtTelPerFocusLost(evt);
            }
        });
        jPanPer.add(jTxtTelPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 530, 30));

        jBtnGuarPers.setBackground(new java.awt.Color(102, 255, 102));
        jBtnGuarPers.setText("Guardar");
        jBtnGuarPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuarPersActionPerformed(evt);
            }
        });
        jPanPer.add(jBtnGuarPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/persona.png"))); // NOI18N
        jPanPer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 150, 150));

        getContentPane().add(jPanPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 320));

        jPanEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtRazSoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtRazSoc.setForeground(new java.awt.Color(153, 153, 153));
        jTxtRazSoc.setText("Razon Social");
        jTxtRazSoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtRazSocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtRazSocFocusLost(evt);
            }
        });
        jPanEmp.add(jTxtRazSoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, -1));

        jTxtNIT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtNIT.setForeground(new java.awt.Color(153, 153, 153));
        jTxtNIT.setText("NIT");
        jTxtNIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtNITFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtNITFocusLost(evt);
            }
        });
        jPanEmp.add(jTxtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 530, -1));

        jTxtDir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtDir.setForeground(new java.awt.Color(153, 153, 153));
        jTxtDir.setText("Direccion");
        jTxtDir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtDirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtDirFocusLost(evt);
            }
        });
        jPanEmp.add(jTxtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 530, 30));

        jTxtTelEmp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtTelEmp.setForeground(new java.awt.Color(153, 153, 153));
        jTxtTelEmp.setText("Nro. Telefono");
        jTxtTelEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtTelEmpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtTelEmpFocusLost(evt);
            }
        });
        jPanEmp.add(jTxtTelEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 530, 30));

        jTxtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTxtEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTxtEmail.setText("Email");
        jTxtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtEmailFocusLost(evt);
            }
        });
        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        jPanEmp.add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 530, 30));

        jBtnGuarEmp.setBackground(new java.awt.Color(102, 255, 102));
        jBtnGuarEmp.setText("Guardar");
        jPanEmp.add(jBtnGuarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/empresa.png"))); // NOI18N
        jPanEmp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        getContentPane().add(jPanEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 310));

        jMenu1.setText("Ayuda");

        jMenuItem2.setText("La finalidad de este programa es acceder a a la base de datos, y modificarla.Registrando tanto personas u empresas");
        jMenuItem2.setActionCommand("La finalidad de este programa es acceder a ala vase de datos, y modificarla.Registrando tanto personas u empresas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        jMenuItem1.setText("Diseñado por: Laura Sofia Rebolledo Agudelo");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNombresFocusGained
        if("Nombres".equals(this.jTxtNombres.getText())){
            this.jTxtNombres.setText("");
            this.jTxtNombres.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtNombresFocusGained

    private void jTxtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNombresFocusLost
        if("".equals(this.jTxtNombres.getText())){
            jTxtNombres.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtNombres.setText("Nombres");
        }
    }//GEN-LAST:event_jTxtNombresFocusLost

    private void jTxtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtApellidosFocusGained
        if("Apellidos".equals(this.jTxtApellidos.getText())){
            this.jTxtApellidos.setText("");
            this.jTxtApellidos.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtApellidosFocusGained

    private void jTxtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtApellidosFocusLost
        if("".equals(this.jTxtApellidos.getText())){
            jTxtApellidos.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtApellidos.setText("Apellidos");
        }
    }//GEN-LAST:event_jTxtApellidosFocusLost

    private void jTxtDocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDocFocusGained
        if("Nro. Documento".equals(this.jTxtDoc.getText())){
            this.jTxtDoc.setText("");
            this.jTxtDoc.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtDocFocusGained

    private void jTxtDocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDocFocusLost
        if("".equals(this.jTxtDoc.getText())){
            jTxtDoc.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtDoc.setText("Nro. Documento");
        }
    }//GEN-LAST:event_jTxtDocFocusLost

    private void jTxtTelPerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtTelPerFocusGained
        if("Nro. Telefono".equals(this.jTxtTelPer.getText())){
            this.jTxtTelPer.setText("");
            this.jTxtTelPer.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtTelPerFocusGained

    private void jTxtTelPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtTelPerFocusLost
        if("".equals(this.jTxtTelPer.getText())){
            jTxtTelPer.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtTelPer.setText("Nro. Telefono");
        }
    }//GEN-LAST:event_jTxtTelPerFocusLost

    private void jTxtRazSocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtRazSocFocusGained
        if("Razon Social".equals(this.jTxtRazSoc.getText())){
            this.jTxtRazSoc.setText("");
            this.jTxtRazSoc.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtRazSocFocusGained

    private void jTxtRazSocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtRazSocFocusLost
        if("".equals(this.jTxtRazSoc.getText())){
            jTxtRazSoc.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtRazSoc.setText("Razon Social");
        }
    }//GEN-LAST:event_jTxtRazSocFocusLost

    private void jTxtNITFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNITFocusGained
        if("NIT".equals(this.jTxtNIT.getText())){
            this.jTxtNIT.setText("");
            this.jTxtNIT.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtNITFocusGained

    private void jTxtNITFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNITFocusLost
        if("".equals(this.jTxtNIT.getText())){
            jTxtNIT.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtNIT.setText("NIT");
        }
    }//GEN-LAST:event_jTxtNITFocusLost

    private void jTxtDirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDirFocusGained
        if("Direccion".equals(this.jTxtDir.getText())){
            this.jTxtDir.setText("");
            this.jTxtDir.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtDirFocusGained

    private void jTxtDirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDirFocusLost
        if("".equals(this.jTxtDir.getText())){
            jTxtDir.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtDir.setText("Direccion");
        }
    }//GEN-LAST:event_jTxtDirFocusLost

    private void jTxtTelEmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtTelEmpFocusGained
        if("Nro. Telefono".equals(this.jTxtTelEmp.getText())){
            this.jTxtTelEmp.setText("");
            this.jTxtTelEmp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtTelEmpFocusGained

    private void jTxtTelEmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtTelEmpFocusLost
        if("".equals(this.jTxtTelEmp.getText())){
            jTxtTelEmp.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtTelEmp.setText("Nro. Telefono");
        }
    }//GEN-LAST:event_jTxtTelEmpFocusLost

    private void jBtnGuarPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuarPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGuarPersActionPerformed

    private void jTxtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtEmailFocusGained
        if("Email".equals(this.jTxtEmail.getText())){
            this.jTxtEmail.setText("");
            this.jTxtEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtEmailFocusGained

    private void jTxtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtEmailFocusLost
        if("".equals(this.jTxtEmail.getText())){
            jTxtEmail.setForeground(new java.awt.Color(153, 153, 153));
            this.jTxtEmail.setText("Email");
        }
    }//GEN-LAST:event_jTxtEmailFocusLost

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTxtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuarEmp;
    private javax.swing.JButton jBtnGuarPers;
    private javax.swing.JButton jBtnRegEmp;
    private javax.swing.JButton jBtnRegPer;
    private javax.swing.JButton jBtnSal;
    private javax.swing.JComboBox<String> jCmBoxDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanEmp;
    private javax.swing.JPanel jPanPer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtApellidos;
    private javax.swing.JTextField jTxtDir;
    private javax.swing.JTextField jTxtDoc;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtNIT;
    private javax.swing.JTextField jTxtNombres;
    private javax.swing.JTextField jTxtRazSoc;
    private javax.swing.JTextField jTxtTelEmp;
    private javax.swing.JTextField jTxtTelPer;
    // End of variables declaration//GEN-END:variables
}
