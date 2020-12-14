package br.com.pi.app;

import br.com.pi.bll.AdministradorBll;
import br.com.pi.interfaces.ConnectionObserver;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.AdministradorModel;
import br.com.pi.util.ConexaoPostRead;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame implements ConnectionObserver {

    ICRUD_GENERIC<AdministradorModel> userValid;
    private ConexaoPostRead conection = ConexaoPostRead.getInstance();
    boolean isConnected = true;

    public LoginView() {
        initComponents();
        try {
            conection.addConnectionObserver(this);
            userValid = new AdministradorBll();
            onConnectionChange(isConnected);
        } catch (Exception ex) {
            isConnected = false;
            onConnectionChange(isConnected);
            JOptionPane.showMessageDialog(null, "Erro na Conexão!", "Erro ao conectar no Banco", JOptionPane.ERROR_MESSAGE);
        }
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/rental_car_key.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDescriptionStatus = new javax.swing.JLabel();
        lblDescriptionStatusImg = new javax.swing.JLabel();
        jRadioButtonShowSenha = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmCadastro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Projeto Integrador");

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/entrar.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });

        txtSenha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtSenhaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtSenhaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtSenha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSenhaPropertyChange(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/excluir_small.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha ");

        jLabel3.setText("Usuário");

        lblDescriptionStatus.setText("Conexão: ");

        lblDescriptionStatusImg.setText(".");

        jRadioButtonShowSenha.setText("Exibir Senha");
        jRadioButtonShowSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonShowSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblDescriptionStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescriptionStatusImg))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonShowSenha)
                    .addComponent(txtSenha)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonShowSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescriptionStatus)
                    .addComponent(lblDescriptionStatusImg))
                .addGap(25, 25, 25))
        );

        jMenu1.setText("Gerir Usuários");

        jmCadastro.setText("Cadastrar Novo Usuario");
        jmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastro);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            saveUser();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed

    }//GEN-LAST:event_btnEntrarKeyPressed

    private void txtSenhaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtSenhaAncestorAdded

    }//GEN-LAST:event_txtSenhaAncestorAdded

    private void txtSenhaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtSenhaAncestorMoved

    }//GEN-LAST:event_txtSenhaAncestorMoved

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed

    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased

    }//GEN-LAST:event_txtSenhaKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            System.exit(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroActionPerformed
        try {
            String user = JOptionPane.showInputDialog(null, "Login Master", "Acesso Restrito", JOptionPane.INFORMATION_MESSAGE);
            if (user.equalsIgnoreCase("Master")) {
                LoginViewCrud loginCrud = new LoginViewCrud();
                loginCrud.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credencias Negadas", "Acesso Não permitido", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmCadastroActionPerformed

    private void txtSenhaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtSenhaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaPropertyChange

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
        try {
            char pressEnter = evt.getKeyChar();
            if (pressEnter == KeyEvent.VK_ENTER) {
                saveUser();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtSenhaKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            isConnected = true;
        } catch (Exception e) {
            isConnected = false;
        }
    }//GEN-LAST:event_formWindowActivated

    private void jRadioButtonShowSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonShowSenhaActionPerformed
        if (txtSenha.getEchoChar() == '*') {
            txtSenha.setEchoChar((char) 0);
        } else {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButtonShowSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginView().setVisible(true);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Erro na Conexão!", "Erro ao conectar no Banco", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro na Conexão!", "Erro ao conectar no Banco", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonShowSenha;
    private javax.swing.JMenuItem jmCadastro;
    private javax.swing.JLabel lblDescriptionStatus;
    private javax.swing.JLabel lblDescriptionStatusImg;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void saveUser() {
        try {
            if (txtSenha.getPassword().length == 0 || txtUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os Campos precisam ser Informados");
            } else {
                AdministradorModel usuAuth = new AdministradorModel();
                usuAuth.setAdministrador_usuario(txtUsuario.getText());
                usuAuth.setAdministrador_senha(new String(txtSenha.getPassword()));

                if (AdministradorBll.validaLogin(usuAuth)) {
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.transferirDados(userValid.getByNome(txtUsuario.getText()).getAdministrador_nome());
                    menu.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inváĺido!");
                    txtSenha.setText("");
                    txtUsuario.setText("");
                    txtUsuario.setRequestFocusEnabled(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique suas credenciais", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
            txtSenha.setText("");
            txtUsuario.setText("");
            txtUsuario.setRequestFocusEnabled(true);
        }
    }

    @Override
    public void onConnectionChange(boolean isConnectionOk) {
        if (isConnectionOk) {
            lblDescriptionStatus.setForeground(Color.GREEN);
            lblDescriptionStatusImg.setIcon(new ImageIcon("src/br/com/pi/icons/bd_OK.png"));
        } else {
            lblDescriptionStatus.setForeground(Color.RED);
            lblDescriptionStatusImg.setIcon(new ImageIcon("src/br/com/pi/icons/Bd_Off.png"));
            jmCadastro.setEnabled(false);
            txtSenha.setEnabled(false);
            txtUsuario.setEnabled(false);
            btnEntrar.setEnabled(false);
        }
    }
}
