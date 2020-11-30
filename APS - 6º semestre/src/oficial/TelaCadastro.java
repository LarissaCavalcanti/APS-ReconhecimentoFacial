package oficial;

import Modelos.Usuario;
import SQLite.ConectarBanco;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.bytedeco.javacv.FrameGrabber;

public class TelaCadastro extends javax.swing.JFrame {

    Usuario usuario;
    ConectarBanco banco;

    public TelaCadastro() {
        initComponents();
        banco = new ConectarBanco();
        this.setSize(338, 403);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral1 = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        pnlCentral = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblCargo = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("frmCadastro"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(466, 425));
        getContentPane().setLayout(null);

        pnlCentral1.setBackground(new java.awt.Color(44, 47, 51));
        pnlCentral1.setMinimumSize(new java.awt.Dimension(466, 400));
        pnlCentral1.setLayout(new java.awt.BorderLayout());

        lblInfo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("Tela de Cadastro");
        pnlCentral1.add(lblInfo, java.awt.BorderLayout.PAGE_START);

        pnlCentral.setBackground(new java.awt.Color(44, 47, 51));
        pnlCentral.setMinimumSize(new java.awt.Dimension(466, 400));
        pnlCentral.setPreferredSize(new java.awt.Dimension(466, 400));
        pnlCentral.setLayout(new java.awt.GridLayout(6, 0));

        lblNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");
        pnlCentral.add(lblNome);

        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pnlCentral.add(txtNome);

        lblSobrenome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        lblSobrenome.setText("Sobrenome:");
        pnlCentral.add(lblSobrenome);

        txtSobrenome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pnlCentral.add(txtSobrenome);

        lblLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login:");
        pnlCentral.add(lblLogin);

        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pnlCentral.add(txtLogin);

        lblSenha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        pnlCentral.add(lblSenha);
        pnlCentral.add(txtPassword);

        lblCargo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo:");
        pnlCentral.add(lblCargo);

        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUNCIONARIO", "DIRETOR", "MINISTRO" }));
        pnlCentral.add(cboCargo);

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
        pnlCentral.add(btnVoltar);

        btnSalvar.setBackground(new java.awt.Color(58, 65, 84));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlCentral.add(btnSalvar);

        pnlCentral1.add(pnlCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCentral1);
        pnlCentral1.setBounds(0, 0, 330, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telainicial = new TelaInicial();
        telainicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        validarUsuario();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void validarUsuario() {
        usuario = new Usuario();

        usuario.setId(banco.pegarUltimoId() + 1);
        usuario.setCargo(cboCargo.getSelectedItem().toString());
        usuario.setNome(txtNome.getText());
        usuario.setSobrenome(txtSobrenome.getText());
        usuario.setPermissao(permissao(cboCargo.getSelectedItem().toString()));
        usuario.setLogin(txtLogin.getText());
        usuario.setSenha(Criptografia.Cripto(new String(txtPassword.getPassword())));

        if (!txtNome.getText().equals("") && !txtSobrenome.getText().equals("")
                && !txtLogin.getText().equals("") && !txtPassword.getText().equals("")) {
            if (banco.CadastroUsuario(usuario)) {
                JOptionPane.showConfirmDialog(null, "Começando o reconhecimento facial", "Cadastro", JOptionPane.DEFAULT_OPTION);
                try {
                    TelaFoto telaFoto = new TelaFoto(usuario);
                    
                    JOptionPane.showConfirmDialog(null, "Cadastro realizado", "Cadastro", JOptionPane.DEFAULT_OPTION);
                    this.dispose();
                } catch (FrameGrabber.Exception | InterruptedException ex) {
                    JOptionPane.showConfirmDialog(null, "Não foi detectado webcam, somente o cadastro de usuario foi realizado, voltando a tela inicial.", "Cadastro", JOptionPane.DEFAULT_OPTION);
                    this.dispose();
                    new TelaInicial().setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "É obrigatorio preencher todos os campos");
        }
    }

    private int permissao(String nome) {

        switch (nome) {
            case "FUNCIONARIO":
                return 1;
            case "DIRETOR":
                return 2;
            case "MINISTRO":
                return 3;
            default:
                return 1;
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlCentral1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
