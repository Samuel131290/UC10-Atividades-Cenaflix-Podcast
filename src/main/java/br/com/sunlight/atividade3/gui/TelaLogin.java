package br.com.sunlight.atividade3.gui;
import br.com.sunlight.atividade3.persistence.Usuario;
import br.com.sunlight.atividade3.persistence.UsuarioBD;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela interface gráfica de Login.
 */
public class TelaLogin extends javax.swing.JFrame 
{
    public TelaLogin() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCenaFlix = new javax.swing.JLabel();
        jLogin = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        jSenha = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCenaFlix.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jCenaFlix.setForeground(new java.awt.Color(255, 51, 51));
        jCenaFlix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCenaFlix.setText("CENAFLIX");

        jLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLogin.setText("Login:");

        txLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txLogin.setToolTipText("Preencha seu login.");
        txLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSenha.setText("Senha:");

        txSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txSenha.setToolTipText("Preencha sua senha.");
        txSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("Pressione para efetuar o Login.");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnNovoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovoUsuario.setText("NOVO USUÁRIO");
        btnNovoUsuario.setToolTipText("Pressione para efetuar o Login.");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                        .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Usuario usuarioAtual = new Usuario();
        usuarioAtual.setLogin(txLogin.getText());
        usuarioAtual.setSenha(txSenha.getText());
        usuarioAtual = UsuarioBD.validarUsuarioSeguro(usuarioAtual);
         
        if (usuarioAtual != null) 
        {            
            String nomeDoUsuario = usuarioAtual.getNome();
            String tipoUsuario = usuarioAtual.getTipo();

            if (usuarioAtual.getTipo().equalsIgnoreCase("Administrador")) 
            {
                JOptionPane.showMessageDialog(null, "Olá, " + nomeDoUsuario + " sua permissão é de " + tipoUsuario + ".\nPermissões atribuidas: Cadastrar, Excluir e Listar. \nSeja bem-vindo!");
            } 
            else if (usuarioAtual.getTipo().equalsIgnoreCase("Operador")) 
            {
                JOptionPane.showMessageDialog(null, "Olá, " + nomeDoUsuario + " sua permissão é de " + tipoUsuario + ".\nPermissões atribuidas: Cadastrar e Listar. \nSeja bem-vindo!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Olá, " + nomeDoUsuario + " sua permissão é de " + tipoUsuario + ".\nPermissões atribuidas: Listar. \nSeja bem-vindo!");
            }
            TelaCadastro tela = new TelaCadastro(usuarioAtual);
            tela.setVisible(true);
            dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Erro de autenticação! Verifique se os dados estão corretos.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        NovoUsuario telaNovoUsuario = new NovoUsuario();
        // Torna a tela visível
        telaNovoUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed
    /**
    * Classe principal para efetuar o Login do usuário.
    *
    * @param args Os argumentos da linha de comando.
    */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JLabel jCenaFlix;
    private javax.swing.JLabel jLogin;
    private javax.swing.JLabel jSenha;
    private javax.swing.JTextField txLogin;
    private javax.swing.JPasswordField txSenha;
    // End of variables declaration//GEN-END:variables
}
