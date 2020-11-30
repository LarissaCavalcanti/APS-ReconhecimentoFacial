package oficial;

import Modelos.Usuario;
import SQLite.ConectarBanco;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bytedeco.javacv.FrameGrabber;

public class TelaInicial extends javax.swing.JFrame {
    ConectarBanco banco;
    Usuario usuario;
    
    public TelaInicial() {
        initComponents();
        banco = new ConectarBanco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        pnlCentral = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        btnBiometria = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(527, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(527, 290));
        getContentPane().setLayout(new java.awt.FlowLayout());

        pnlCentral.setBackground(new java.awt.Color(44, 47, 51));
        pnlCentral.setMaximumSize(new java.awt.Dimension(527, 263));
        pnlCentral.setMinimumSize(new java.awt.Dimension(527, 263));
        pnlCentral.setPreferredSize(new java.awt.Dimension(527, 263));
        pnlCentral.setLayout(new java.awt.CardLayout());

        pnlMenu.setBackground(new java.awt.Color(44, 47, 51));
        pnlMenu.setMaximumSize(new java.awt.Dimension(527, 263));
        pnlMenu.setMinimumSize(new java.awt.Dimension(527, 263));
        pnlMenu.setPreferredSize(new java.awt.Dimension(527, 263));
        pnlMenu.setLayout(null);

        btnSair.setBackground(new java.awt.Color(217, 81, 51));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorderPainted(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSair);
        btnSair.setBounds(149, 182, 205, 33);

        btnCadastro.setBackground(new java.awt.Color(58, 65, 84));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastro");
        btnCadastro.setBorderPainted(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.setFocusPainted(false);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCadastro);
        btnCadastro.setBounds(149, 132, 205, 33);

        btnLogin.setBackground(new java.awt.Color(58, 65, 84));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlMenu.add(btnLogin);
        btnLogin.setBounds(149, 82, 205, 33);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Secretaria do Meio Ambiente");
        pnlMenu.add(jLabel1);
        jLabel1.setBounds(10, 10, 510, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-webcam-100.png"))); // NOI18N
        pnlMenu.add(jLabel2);
        jLabel2.setBounds(410, 140, 100, 90);

        pnlCentral.add(pnlMenu, "pnlMenu");

        pnlLogin.setBackground(new java.awt.Color(44, 47, 51));
        pnlLogin.setMaximumSize(new java.awt.Dimension(527, 263));
        pnlLogin.setMinimumSize(new java.awt.Dimension(527, 263));
        pnlLogin.setOpaque(false);
        pnlLogin.setPreferredSize(new java.awt.Dimension(527, 263));

        lblSenha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha: ");

        lblLogin1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin1.setText("Login: ");

        btnBiometria.setBackground(new java.awt.Color(58, 65, 84));
        btnBiometria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBiometria.setForeground(new java.awt.Color(255, 255, 255));
        btnBiometria.setText("Biometria");
        btnBiometria.setBorderPainted(false);
        btnBiometria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBiometria.setFocusPainted(false);
        btnBiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiometriaActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(58, 65, 84));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnVoltar.setBackground(new java.awt.Color(217, 81, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorderPainted(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBiometria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBiometria)
                .addGap(26, 26, 26)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlCentral.add(pnlLogin, "pnlLogin");

        getContentPane().add(pnlCentral);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "pnlLogin");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "pnlMenu");
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuario usuarioLogin = banco.getUserLogin(txtLogin.getText(), Criptografia.Cripto(new String(txtPassword.getPassword())));

        validarAcesso(usuarioLogin);
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnBiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiometriaActionPerformed
        try {
            TelaReconhecimento reconhecimento = new TelaReconhecimento();
            dispose();
        } catch (FrameGrabber.Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBiometriaActionPerformed

    private void validarAcesso (Usuario usuario) {
        
        if(!(usuario == null)){
            TelaUsuario telausuario = new TelaUsuario(usuario); 
            telausuario.setVisible(true);
            dispose();
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiometria;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
