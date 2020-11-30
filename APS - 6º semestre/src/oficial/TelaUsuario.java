package oficial;

import Modelos.Usuario;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JFrame {
    private Usuario usuario;
    
    public TelaUsuario(){
        initComponents();       
    }

    public TelaUsuario(Usuario usuario){
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        arrumarLabel();
        validarAcesso();   
        TxtAreaTransparente();
    }
    
    private void TxtAreaTransparente (){
        spnPermissao1.setViewportView(txtPermissao1);
        spnPermissao1.getViewport().setOpaque(false);
        spnPermissao1.setOpaque(false);
        txtPermissao1.setOpaque(false);
        
        spnPermissao2.setViewportView(txtPermissao2);
        spnPermissao2.getViewport().setOpaque(false);
        spnPermissao2.setOpaque(false);
        txtPermissao2.setOpaque(false);
        
        spnPermissao3.setViewportView(txtPermissao3);
        spnPermissao3.getViewport().setOpaque(false);
        spnPermissao3.setOpaque(false);
        txtPermissao3.setOpaque(false);
    }
     
    private void arrumarLabel (){
        lblNome.setText("Nome: " + usuario.getNome() + " " + usuario.getSobrenome());
        lblCargo.setText("Cargo: " + usuario.getCargo());
    }
    
    private void validarAcesso (){
        switch (usuario.getPermissao()) {
            case 1:            
                btnPermissao1.setEnabled(true);
                btnPermissao2.setEnabled(false);
                btnPermissao3.setEnabled(false);
                break;
            case 2:
                btnPermissao1.setEnabled(true);
                btnPermissao2.setEnabled(true);
                btnPermissao3.setEnabled(false);
                break;
            case 3:
                btnPermissao1.setEnabled(true);
                btnPermissao2.setEnabled(true);
                btnPermissao3.setEnabled(true);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Não foi possivel identificar o acesso", "Acesso", JOptionPane.OK_OPTION);
                TelaInicial telainicial = new TelaInicial();
                telainicial.setVisible(true);
                this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnPermissao1 = new javax.swing.JButton();
        btnPermissao2 = new javax.swing.JButton();
        btnPermissao3 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlPermissao1 = new javax.swing.JPanel();
        btnVoltar1 = new javax.swing.JButton();
        spnPermissao1 = new javax.swing.JScrollPane();
        txtPermissao1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pnlPermissao2 = new javax.swing.JPanel();
        btnVoltar2 = new javax.swing.JButton();
        spnPermissao2 = new javax.swing.JScrollPane();
        txtPermissao2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        pnlPermissao3 = new javax.swing.JPanel();
        btnVoltar3 = new javax.swing.JButton();
        spnPermissao3 = new javax.swing.JScrollPane();
        txtPermissao3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        pnlCentral.setBackground(new java.awt.Color(27, 187, 125));
        pnlCentral.setLayout(new java.awt.CardLayout());

        pnlMenu.setBackground(new java.awt.Color(44, 47, 51));
        pnlMenu.setLayout(null);

        btnPermissao1.setBackground(new java.awt.Color(58, 65, 84));
        btnPermissao1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPermissao1.setForeground(new java.awt.Color(255, 255, 255));
        btnPermissao1.setText("Permissao 1");
        btnPermissao1.setBorderPainted(false);
        btnPermissao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPermissao1.setFocusPainted(false);
        btnPermissao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermissao1ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPermissao1);
        btnPermissao1.setBounds(10, 128, 380, 40);

        btnPermissao2.setBackground(new java.awt.Color(58, 65, 84));
        btnPermissao2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPermissao2.setForeground(new java.awt.Color(255, 255, 255));
        btnPermissao2.setText("Permissao 2");
        btnPermissao2.setBorderPainted(false);
        btnPermissao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPermissao2.setFocusPainted(false);
        btnPermissao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermissao2ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPermissao2);
        btnPermissao2.setBounds(10, 198, 380, 40);

        btnPermissao3.setBackground(new java.awt.Color(58, 65, 84));
        btnPermissao3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPermissao3.setForeground(new java.awt.Color(255, 255, 255));
        btnPermissao3.setText("Permissao 3");
        btnPermissao3.setBorderPainted(false);
        btnPermissao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPermissao3.setFocusPainted(false);
        btnPermissao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermissao3ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPermissao3);
        btnPermissao3.setBounds(10, 268, 380, 40);

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
        pnlMenu.add(btnVoltar);
        btnVoltar.setBounds(10, 380, 122, 40);

        lblNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("lblNome");
        pnlMenu.add(lblNome);
        lblNome.setBounds(15, 18, 480, 25);

        lblCargo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("lblCargo");
        pnlMenu.add(lblCargo);
        lblCargo.setBounds(15, 56, 480, 25);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-meio-ambiente-semfundo.png"))); // NOI18N
        pnlMenu.add(jLabel4);
        jLabel4.setBounds(8, 13, 380, 610);

        pnlCentral.add(pnlMenu, "Menu");

        pnlPermissao1.setBackground(new java.awt.Color(44, 47, 51));
        pnlPermissao1.setMaximumSize(new java.awt.Dimension(390, 620));
        pnlPermissao1.setMinimumSize(new java.awt.Dimension(390, 620));
        pnlPermissao1.setPreferredSize(new java.awt.Dimension(390, 620));
        pnlPermissao1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar1.setBackground(new java.awt.Color(217, 81, 51));
        btnVoltar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar1.setText("Voltar");
        btnVoltar1.setBorderPainted(false);
        btnVoltar1.setFocusPainted(false);
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        pnlPermissao1.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 130, 40));

        spnPermissao1.setForeground(new java.awt.Color(255, 255, 255));

        txtPermissao1.setEditable(false);
        txtPermissao1.setColumns(20);
        txtPermissao1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtPermissao1.setForeground(new java.awt.Color(255, 255, 255));
        txtPermissao1.setLineWrap(true);
        txtPermissao1.setRows(5);
        txtPermissao1.setText("Você tem acesso a essas informações:\nSite: https://www.infraestruturameioambiente.sp.gov.br/\nNúmero: ");
        txtPermissao1.setOpaque(false);
        spnPermissao1.setViewportView(txtPermissao1);

        pnlPermissao1.add(spnPermissao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 370, 540));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-meio-ambiente-semfundo.png"))); // NOI18N
        pnlPermissao1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 540));

        pnlCentral.add(pnlPermissao1, "permissao1");

        pnlPermissao2.setBackground(new java.awt.Color(44, 47, 51));
        pnlPermissao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPermissao2.setMaximumSize(new java.awt.Dimension(390, 620));
        pnlPermissao2.setMinimumSize(new java.awt.Dimension(390, 620));
        pnlPermissao2.setLayout(null);

        btnVoltar2.setBackground(new java.awt.Color(217, 81, 51));
        btnVoltar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar2.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar2.setText("Voltar");
        btnVoltar2.setBorderPainted(false);
        btnVoltar2.setFocusPainted(false);
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });
        pnlPermissao2.add(btnVoltar2);
        btnVoltar2.setBounds(140, 570, 130, 40);

        txtPermissao2.setEditable(false);
        txtPermissao2.setColumns(20);
        txtPermissao2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtPermissao2.setForeground(new java.awt.Color(255, 255, 255));
        txtPermissao2.setLineWrap(true);
        txtPermissao2.setRows(5);
        txtPermissao2.setText("Você tem acesso a essas informações:\n\nInvestigadores:\n\nGabriel Alegra RA: D45GBJ-3\nGuilherme Moda RA: D38GGE-0\nPaulo Honório RA: D2638H-8\nVinicius Aparecido RA: D364JF-3\n\n");
        txtPermissao2.setOpaque(false);
        spnPermissao2.setViewportView(txtPermissao2);

        pnlPermissao2.add(spnPermissao2);
        spnPermissao2.setBounds(15, 16, 370, 540);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-meio-ambiente-semfundo.png"))); // NOI18N
        pnlPermissao2.add(jLabel2);
        jLabel2.setBounds(18, 20, 370, 540);

        pnlCentral.add(pnlPermissao2, "permissao2");

        pnlPermissao3.setBackground(new java.awt.Color(44, 47, 51));
        pnlPermissao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPermissao3.setMaximumSize(new java.awt.Dimension(390, 620));
        pnlPermissao3.setMinimumSize(new java.awt.Dimension(390, 620));
        pnlPermissao3.setLayout(null);

        btnVoltar3.setBackground(new java.awt.Color(217, 81, 51));
        btnVoltar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar3.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar3.setText("Voltar");
        btnVoltar3.setBorderPainted(false);
        btnVoltar3.setFocusPainted(false);
        btnVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar3ActionPerformed(evt);
            }
        });
        pnlPermissao3.add(btnVoltar3);
        btnVoltar3.setBounds(130, 570, 130, 40);

        txtPermissao3.setEditable(false);
        txtPermissao3.setColumns(20);
        txtPermissao3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtPermissao3.setForeground(new java.awt.Color(255, 255, 255));
        txtPermissao3.setLineWrap(true);
        txtPermissao3.setRows(5);
        txtPermissao3.setText("Você tem acesso a essas informações:\nInvestigados:\n\n* Fazenda Nova Piratininga: uso de agrotóxicos proibidos;\n\n* Fazenda Conforto: uso excessivo de agrotóxicos;\n\n* Fazenda São Marcelo: descarte ilegal de agrotóxicos.");
        txtPermissao3.setOpaque(false);
        spnPermissao3.setViewportView(txtPermissao3);

        pnlPermissao3.add(spnPermissao3);
        spnPermissao3.setBounds(10, 10, 370, 540);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-meio-ambiente-semfundo.png"))); // NOI18N
        pnlPermissao3.add(jLabel3);
        jLabel3.setBounds(20, 10, 360, 550);

        pnlCentral.add(pnlPermissao3, "permissao3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telainicial = new TelaInicial();
        telainicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPermissao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermissao1ActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "permissao1");
    }//GEN-LAST:event_btnPermissao1ActionPerformed

    private void btnPermissao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermissao2ActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "permissao2");
    }//GEN-LAST:event_btnPermissao2ActionPerformed

    private void btnPermissao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermissao3ActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "permissao3");
    }//GEN-LAST:event_btnPermissao3ActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "Menu");
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "Menu");
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar3ActionPerformed
        CardLayout c1 = (CardLayout) pnlCentral.getLayout();
        c1.show(pnlCentral, "Menu");
    }//GEN-LAST:event_btnVoltar3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPermissao1;
    private javax.swing.JButton btnPermissao2;
    private javax.swing.JButton btnPermissao3;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JButton btnVoltar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPermissao1;
    private javax.swing.JPanel pnlPermissao2;
    private javax.swing.JPanel pnlPermissao3;
    private javax.swing.JScrollPane spnPermissao1;
    private javax.swing.JScrollPane spnPermissao2;
    private javax.swing.JScrollPane spnPermissao3;
    private javax.swing.JTextArea txtPermissao1;
    private javax.swing.JTextArea txtPermissao2;
    private javax.swing.JTextArea txtPermissao3;
    // End of variables declaration//GEN-END:variables
}
