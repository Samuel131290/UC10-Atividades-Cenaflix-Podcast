package br.com.sunlight.atividade3.gui;
import br.com.sunlight.atividade3.persistence.Usuario;
import br.com.sunlight.atividade3.persistence.UsuarioBD;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela interface gráfica de cadastro de Usuários.
 */
public class NovoUsuario extends javax.swing.JFrame 
{
    /**
    * Construtor da classe NovoUsuario.
    * Inicializa os componentes da interface gráfica.
    * Inicializa os componentes do Combox txTipo, com os tipos de usuário.
    */
    public NovoUsuario() 
    {
        initComponents();
        
        String[] tiposUsuario = {"Administrador", "Operador", "Usuário"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(tiposUsuario);
        txTipo.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInformativo = new javax.swing.JPanel();
        jCenaFlix = new javax.swing.JLabel();
        jNovoUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jFormulario = new javax.swing.JPanel();
        jNome = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        jLogin = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        jSenha = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();
        jConfirmeSenha = new javax.swing.JLabel();
        txConfirmarSenha = new javax.swing.JPasswordField();
        jTipoUsuario = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txTipo = new javax.swing.JComboBox<>();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInformativo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jCenaFlix.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jCenaFlix.setForeground(new java.awt.Color(255, 51, 51));
        jCenaFlix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCenaFlix.setText("CENAFLIX");

        jNovoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jNovoUsuario.setText("  Novo Usuário");
        jNovoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInformativoLayout = new javax.swing.GroupLayout(jInformativo);
        jInformativo.setLayout(jInformativoLayout);
        jInformativoLayout.setHorizontalGroup(
            jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInformativoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCenaFlix, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jNovoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jInformativoLayout.setVerticalGroup(
            jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInformativoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNovoUsuario)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNome.setText("Nome");

        txNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeActionPerformed(evt);
            }
        });

        jLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLogin.setText("Login");

        txLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSenha.setText("Senha");

        txSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jConfirmeSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jConfirmeSenha.setText("Confirmar Senha");

        txConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txConfirmarSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTipoUsuario.setText("Tipo de Usuário");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("A senha deve conter no mínimo 8 digitos, com letras minusculas e maiusculas alem de caracteres especias.");

        txTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFormularioLayout = new javax.swing.GroupLayout(jFormulario);
        jFormulario.setLayout(jFormularioLayout);
        jFormularioLayout.setHorizontalGroup(
            jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFormularioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jFormularioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTipoUsuario)
                                    .addComponent(jConfirmeSenha)
                                    .addComponent(jSenha)
                                    .addComponent(jLogin)
                                    .addComponent(jNome)
                                    .addComponent(txTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jFormularioLayout.setVerticalGroup(
            jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jNome)
                .addGap(5, 5, 5)
                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLogin)
                .addGap(5, 5, 5)
                .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSenha)
                .addGap(5, 5, 5)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jConfirmeSenha)
                .addGap(5, 5, 5)
                .addComponent(txConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTipoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jMenu.setText("File");

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu.add(mnSair);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!validFields())
        {  

            Usuario novoUsuario = new Usuario ();
            try
            {  
                novoUsuario.setNome(txNome.getText());
                novoUsuario.setLogin(txLogin.getText());
                novoUsuario.setSenha(txSenha.getText());
                novoUsuario.setConfirmeSenha(txConfirmarSenha.getText());
                String tipoSelecionado = (String) txTipo.getSelectedItem();
                novoUsuario.setTipo(tipoSelecionado);

                if (UsuarioBD.loginJaExiste(txLogin.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Login " + txLogin.getText() + " já existe. Por favor, escolha outro login.");
                    return; // Interrompe o método se o login já existe
                }
                else if (UsuarioBD.cadastrarUsuario(novoUsuario)) 
                {
                    // Exibe uma mensagem de sucesso caso o cadastro seja realizado com sucesso.
                    JOptionPane.showMessageDialog(null, "USUÁRIO CADASTRADO COM SUCESSO!\n\n"
                                                      + "Nome: " + txNome.getText() 
                                                      + "\nLogin: " + txLogin.getText() 
                                                      + "\nTipo de Usuário: " + novoUsuario.getTipo());
                    txNome.setText("");
                    txLogin.setText("");
                    txSenha.setText("");
                    txConfirmarSenha.setText("");
                    txTipo.setSelectedIndex(0);
                }   
                UsuarioBD usuarioBD = new UsuarioBD();
                usuarioBD.cadastrarUsuario(novoUsuario);
                
                TelaLogin telaLogin = new TelaLogin();
                // Torna a tela visível
                telaLogin.setVisible(true);
                dispose();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        // Torna a tela visível
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeActionPerformed

    private void txTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTipoActionPerformed

    }//GEN-LAST:event_txTipoActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair do programa?");
        if(resposta == 0)//0- yes, 1- no, 2- cancel
        {   
            TelaLogin telaLogin = new TelaLogin();
            // Torna a tela visível
            telaLogin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnSairActionPerformed
    /**
    * Classe principal para registrar os dados do Usuário.
    *
    * @param args Os argumentos da linha de comando.
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
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoUsuario().setVisible(true);
            }
        });
    }
    
    
    /**
    * Método que valida os campos do usuário.
    *
    * @return true se os campos do usuário forem válidos, caso contrário, false.
    */
    private boolean validFields()
    {
        boolean empty = true; 
        
        
        if (txNome.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Nome'.");
        } 
        else if (txLogin.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Login'.");
        }
        else if (txSenha.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Senha'.");
        } 
        else if (!isValidSenha(txSenha.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "A senha deve conter caracteres especiais, letras minúsculas e maiúsculas");
        }
        else if (txConfirmarSenha.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Confirmar Senha'.");
        } 
        else if (!confirmeSenha()) 
        { 
            empty = true;
        }
        else
        {
            empty = false;
        }
        return empty;
    }
    
    /**
    * Método que valida a senha do usuário.
    *
    * @return true se a senha for válida, caso contrário, false.
    */
    private boolean isValidSenha(String senha) 
    {
        // Verifica se a senha tem ao menos um caracter especial
        boolean hasSpecialChar = senha.matches(".*[!@#$%^&*()-_=+{};:,<.>/?\\[\\]\\\\].*");

        // Verifica se a senha tem ao menos uma letra minúscula
        boolean hasLowercase = senha.matches(".*[a-z].*");

        // Verifica se a senha tem ao menos uma letra maiúscula
        boolean hasUppercase = senha.matches(".*[A-Z].*");

        // Retorna verdadeiro, se todas as condições forem aceitas
        return hasSpecialChar && hasLowercase && hasUppercase;
    }
    
    /**
    * Verifica se o que o usuário digitar é identico ao metódo isValidSenha().
    *
    * @return true se for válido, caso contrário, false.
    */
    private boolean confirmeSenha() 
    {
        String senha = txSenha.getText();
        String confirmeSenha = txConfirmarSenha.getText();

        if (!senha.equals(confirmeSenha)) // Verifica se os campos 'Senha' e 'Confirme sua Senha' são iguais
        {
            JOptionPane.showMessageDialog(rootPane, "Os campos 'Senha' e 'Confirme sua Senha' devem ser iguais.");
            return false;
        }
        return true;
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCenaFlix;
    private javax.swing.JLabel jConfirmeSenha;
    private javax.swing.JPanel jFormulario;
    private javax.swing.JPanel jInformativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLogin;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNovoUsuario;
    private javax.swing.JLabel jSenha;
    private javax.swing.JLabel jTipoUsuario;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JPasswordField txConfirmarSenha;
    private javax.swing.JTextField txLogin;
    private javax.swing.JTextField txNome;
    private javax.swing.JPasswordField txSenha;
    public javax.swing.JComboBox<String> txTipo;
    // End of variables declaration//GEN-END:variables
}
