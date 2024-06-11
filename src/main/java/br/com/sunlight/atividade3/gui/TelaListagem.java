package br.com.sunlight.atividade3.gui;
import br.com.sunlight.atividade3.persistence.Listagem;
import br.com.sunlight.atividade3.persistence.ListagemDAO;
import br.com.sunlight.atividade3.persistence.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela interface gráfica de cadastro de TelaListagem.
 */
public class TelaListagem extends javax.swing.JFrame 
{
    private Usuario usuarioAtual = new Usuario();
    public TelaListagem() 
    {
        initComponents();
    }
    
    /**
    * Construtor da classe TelaListagem.Inicializa os componentes da interface gráfica.
    * Habilita ou desabilita a função de 'Excluir', de acordo com o Tipo de Usuário.
    * @param u usuário atual.
    */  
    public TelaListagem(Usuario u) 
    {
        this.usuarioAtual = u;
        initComponents();
            if(u.getTipo().equalsIgnoreCase("Administrador"))
            {
                btnExcluir.setEnabled(true);
            }
            else if(u.getTipo().equalsIgnoreCase("Operador"))
            {
                btnExcluir.setEnabled(false);
            }
            else
            {
                btnExcluir.setEnabled(false);
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInformativo = new javax.swing.JPanel();
        jCenaFlix = new javax.swing.JLabel();
        jListagem = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jFormulario = new javax.swing.JPanel();
        jPesquisarPodcast = new javax.swing.JLabel();
        txPesquisa = new javax.swing.JTextField();
        CatalogoPodcast = new javax.swing.JScrollPane();
        ScrollDaTabela = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInformativo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jCenaFlix.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jCenaFlix.setForeground(new java.awt.Color(255, 51, 51));
        jCenaFlix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCenaFlix.setText("CENAFLIX");

        jListagem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jListagem.setText("Listagem");

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Pressione para voltar à Tela de Cadastro.");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInformativoLayout = new javax.swing.GroupLayout(jInformativo);
        jInformativo.setLayout(jInformativoLayout);
        jInformativoLayout.setHorizontalGroup(
            jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInformativoLayout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInformativoLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jInformativoLayout.setVerticalGroup(
            jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInformativoLayout.createSequentialGroup()
                .addGroup(jInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCenaFlix, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInformativoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jListagem)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jPesquisarPodcast.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPesquisarPodcast.setText("Pesquisar podcast por Produtor:");

        txPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txPesquisa.setToolTipText("Preencha o nome do Produtor.");
        txPesquisa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ScrollDaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        CatalogoPodcast.setViewportView(ScrollDaTabela);

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setText("Listar");
        btnPesquisar.setToolTipText("Pressione para pesquisar o Podcast.");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Pressione para excluir o Podcast.");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFormularioLayout = new javax.swing.GroupLayout(jFormulario);
        jFormulario.setLayout(jFormularioLayout);
        jFormularioLayout.setHorizontalGroup(
            jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFormularioLayout.createSequentialGroup()
                            .addComponent(jPesquisarPodcast, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CatalogoPodcast, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );
        jFormularioLayout.setVerticalGroup(
            jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormularioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPesquisarPodcast)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(CatalogoPodcast, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jFormulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInformativo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try
        {
            ListagemDAO listaDao = new ListagemDAO();
            List<Listagem> lista = listaDao.listar(txPesquisa.getText());
            preencheTabela(lista);  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro(usuarioAtual);
        telaCadastro.setVisible(true);
        dispose(); // Volta pra tela de cadastro e fecha a de listagem
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try
        {
            if(ScrollDaTabela.getSelectedRow() >= 0)
            { 
                //Vrifica se há algo selecionado na tabela
                //Obtém o valor da coluna id da linha selecionada
                String id = (String)ScrollDaTabela.getValueAt(ScrollDaTabela.getSelectedRow(), 0);
                //Janela de confirmação
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o registro " + id + "?");
                if(resposta == 0)//0- yes, 1- no, 2- cancel
                {   
                    //Realizando a exclusão
                    ListagemDAO listaDao = new ListagemDAO();            
                    listaDao.excluir(Integer.parseInt(id));
                    JOptionPane. showMessageDialog(this, "Registro excluído com sucesso");
                    //refazendo a pesquisa para atualizar a tabela na tela
                    btnPesquisarActionPerformed(evt);
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
    * Classe principal para registrar os dados da Lista.
    *
    * @param args Os argumentos da linha de comando.
    */ 
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaListagem().setVisible(true);
            }
        });
    }
    
    /**
    * Método que preenche a tabela com os dados fornecidos na lista.
    *
    * @param lista Uma lista contendo os dados a serem preenchidos na tabela.
    */
    public void preencheTabela(List<Listagem> lista)
    {      
        String columns[] = {"Id", "Produtor", "Nome do Episódio", "Número do Episódio", "Duração", "URL Repo"};
        String dados[][] = new String[lista.size()][columns.length];
        int i=0;
        for(Listagem l: lista)
        {
            dados[i] = new String[]
            { 
                String.valueOf(l.getId()), 
                l.getProdutor(), 
                l.getNomeEpisodio(),
                String.valueOf(l.getNºEpisodio()),
                l.getDuracao(),
                l.getURL_Repo(),
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, columns);
        ScrollDaTabela.setModel(model);
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CatalogoPodcast;
    private javax.swing.JTable ScrollDaTabela;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jCenaFlix;
    private javax.swing.JPanel jFormulario;
    private javax.swing.JPanel jInformativo;
    private javax.swing.JLabel jListagem;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel jPesquisarPodcast;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables
}
