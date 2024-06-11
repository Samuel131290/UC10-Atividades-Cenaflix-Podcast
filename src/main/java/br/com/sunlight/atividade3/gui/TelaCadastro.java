package br.com.sunlight.atividade3.gui;
import br.com.sunlight.atividade3.persistence.Listagem;
import br.com.sunlight.atividade3.persistence.ListagemDAO;
import br.com.sunlight.atividade3.persistence.Usuario;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela interface gráfica de cadastro de TelaCadastro.
 */
public class TelaCadastro extends javax.swing.JFrame 
{
    private Usuario usuarioAtual = new Usuario();
    
    /**
    * Classe responsável por iniciar componentes graficos da TelaCadastro.
    */
    public TelaCadastro() 
    {
        initComponents();
    }
    
    /**
    * Construtor da classe CadastroFilmes. Inicializa os componentes da interface gráfica.
    * Habilita ou desabilita a função de 'Cadastro', de acordo com o Tipo de Usuário.
     * @param u usuário atual.
    */  
    public TelaCadastro(Usuario u) 
    {
        this.usuarioAtual = u;
        initComponents();
            if(u.getTipo().equalsIgnoreCase("Administrador"))
            {
                btnCadastrar.setEnabled(true);
            }
            else if(u.getTipo().equalsIgnoreCase("Operador"))
            {
                btnCadastrar.setEnabled(true);
            }
            else
            {
                btnCadastrar.setEnabled(false);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInformativo = new javax.swing.JPanel();
        jCadastrarPodcast = new javax.swing.JLabel();
        jCenaFlix = new javax.swing.JLabel();
        jFormulario = new javax.swing.JPanel();
        jProdutor = new javax.swing.JLabel();
        txProdutor = new javax.swing.JTextField();
        jNomeEpisodio = new javax.swing.JLabel();
        txNomeEpisodio = new javax.swing.JTextField();
        jNdoEpisodio = new javax.swing.JLabel();
        txNEpisodio = new javax.swing.JTextField();
        jDuracao = new javax.swing.JLabel();
        txDuracao = new javax.swing.JTextField();
        jURLRepertorio = new javax.swing.JLabel();
        txURL = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInformativo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jCadastrarPodcast.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCadastrarPodcast.setText("Cadastrar Podcast");

        jCenaFlix.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jCenaFlix.setForeground(new java.awt.Color(255, 51, 51));
        jCenaFlix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCenaFlix.setText("CENAFLIX");

        javax.swing.GroupLayout jInformativoLayout = new javax.swing.GroupLayout(jInformativo);
        jInformativo.setLayout(jInformativoLayout);
        jInformativoLayout.setHorizontalGroup(
            jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInformativoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(jInformativoLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jCadastrarPodcast, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInformativoLayout.setVerticalGroup(
            jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInformativoLayout.createSequentialGroup()
                .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jCadastrarPodcast)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jProdutor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jProdutor.setText("Produtor");

        txProdutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txProdutor.setToolTipText("Preencha o nome do Produtor.");
        txProdutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jNomeEpisodio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNomeEpisodio.setText("Nome do Episódio");

        txNomeEpisodio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNomeEpisodio.setToolTipText("Preencha o Nome do Episódio.");
        txNomeEpisodio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txNomeEpisodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeEpisodioActionPerformed(evt);
            }
        });

        jNdoEpisodio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNdoEpisodio.setText("Nº do Episódio");

        txNEpisodio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNEpisodio.setToolTipText("Preencha o Número do Episódio.");
        txNEpisodio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txNEpisodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNEpisodioActionPerformed(evt);
            }
        });

        jDuracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDuracao.setText("Duração");

        txDuracao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txDuracao.setToolTipText("Preencha a Duração do Episódio.");
        txDuracao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jURLRepertorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jURLRepertorio.setText("URL do Repertório");

        txURL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txURL.setToolTipText("Preencha a URL do Repertório.");
        txURL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Pressione para Cadastrar o Podcast.");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListagem.setText("Listagem");
        btnListagem.setToolTipText("Pressione para abrir a Lista de Podcast.");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFormularioLayout = new javax.swing.GroupLayout(jFormulario);
        jFormulario.setLayout(jFormularioLayout);
        jFormularioLayout.setHorizontalGroup(
            jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jNdoEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txNEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(txDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jURLRepertorio))
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(txURL, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFormularioLayout.setVerticalGroup(
            jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jProdutor)
                .addGap(5, 5, 5)
                .addComponent(txProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jNomeEpisodio)
                .addGap(5, 5, 5)
                .addComponent(txNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFormularioLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jNdoEpisodio))
                    .addComponent(txNEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jDuracao)
                .addGap(5, 5, 5)
                .addComponent(txDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jURLRepertorio)
                .addGap(5, 5, 5)
                .addComponent(txURL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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
                    .addComponent(jInformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        TelaListagem telaListagem = new TelaListagem(usuarioAtual);
        // Torna a tela visível
        telaListagem.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!validFields())
        {
            try
            {   
                Listagem novaLista = new Listagem ();
            
                novaLista.setProdutor(txProdutor.getText());
                novaLista.setNomeEpisodio(txNomeEpisodio.getText());
                novaLista.setNºEpisodio(Integer.parseInt(txNEpisodio.getText()));
                novaLista.setDuracao(txDuracao.getText());
                novaLista.setURL_Repo(txURL.getText());

                if (ListagemDAO.cadastrar(novaLista))  
                {
                    // Exibe uma mensagem de sucesso caso o cadastro seja realizado com sucesso.
                    JOptionPane.showMessageDialog(null, "PODCAST CADASTRADO COM SUCESSO!\n\n"
                                                      + "Produtor: " + txProdutor.getText() 
                                                      + "\nNome do Episódio: " + txNomeEpisodio.getText() 
                                                      + "\nNúmero do Episodio: " + txNEpisodio.getText()
                                                      + "\nDuração: " + txDuracao.getText()
                                                      + "\nURL: " + txURL.getText());
                    txProdutor.setText("");
                    txNomeEpisodio.setText("");
                    txNEpisodio.setText("");
                    txDuracao.setText("");
                    txURL.setText("");
                }
                ListagemDAO listaDao = new ListagemDAO();
                listaDao.cadastrar(novaLista);
            }
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txNEpisodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNEpisodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNEpisodioActionPerformed

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

    private void txNomeEpisodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeEpisodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeEpisodioActionPerformed
    /**
    * Classe principal para registrar os dados do Podcast.
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new TelaCadastro().setVisible(true);
            }
        }
        );}
    
    /**
    * Método que valida os campos de cadastro.
    *
    * @return true se os campos do cadastro forem válidos, caso contrário, false.
    */
    public boolean validFields()
    {
        boolean empty = true; 
        
        
        if (txProdutor.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Produtor'.");
        } 
        else if (txNomeEpisodio.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Nome do Episódio'.");
        }
        else if (txNEpisodio.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Nº do Episodio'.");
        } 
        else if (txDuracao.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'Duração'.");
        }
        else if (txURL.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha o campo de 'URL do Repertório'.");
        } 
        else
        {
            empty = false;
        }
        return empty;
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JLabel jCadastrarPodcast;
    private javax.swing.JLabel jCenaFlix;
    private javax.swing.JLabel jDuracao;
    private javax.swing.JPanel jFormulario;
    private javax.swing.JPanel jInformativo;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel jNdoEpisodio;
    private javax.swing.JLabel jNomeEpisodio;
    private javax.swing.JLabel jProdutor;
    private javax.swing.JLabel jURLRepertorio;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JTextField txDuracao;
    private javax.swing.JTextField txNEpisodio;
    private javax.swing.JTextField txNomeEpisodio;
    private javax.swing.JTextField txProdutor;
    private javax.swing.JTextField txURL;
    // End of variables declaration//GEN-END:variables
}
