
package Interface;

import aplicaçãoveiculo.Informacoes;


public class Painel extends javax.swing.JFrame {
    
    private Informacoes informacao;
    
    public Painel() {
        initComponents();
        informacao = new Informacoes();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(241, 124, 26));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastrar = new javax.swing.JMenu();
        jMIVeiculo = new javax.swing.JMenuItem();
        jMVisualizar = new javax.swing.JMenu();
        jMIVisualizar = new javax.swing.JMenuItem();
        jMPesquisar = new javax.swing.JMenu();
        jMIPesquisar = new javax.swing.JMenuItem();
        jMListar = new javax.swing.JMenu();
        jMIListar = new javax.swing.JMenuItem();
        jMExcluir = new javax.swing.JMenu();
        jMIExcluir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JMSobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Veículos v15.0");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/carro.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMCadastrar.setText("Cadastrar");

        jMIVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMIVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/lapis.png"))); // NOI18N
        jMIVeiculo.setText("Veículo");
        jMIVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVeiculoActionPerformed(evt);
            }
        });
        jMCadastrar.add(jMIVeiculo);

        jMenuBar1.add(jMCadastrar);

        jMVisualizar.setText("Visualizar");

        jMIVisualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMIVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/tela.png"))); // NOI18N
        jMIVisualizar.setText("Veículo");
        jMIVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarActionPerformed(evt);
            }
        });
        jMVisualizar.add(jMIVisualizar);

        jMenuBar1.add(jMVisualizar);

        jMPesquisar.setText("Pesquisar");

        jMIPesquisar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMIPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/lupa.png"))); // NOI18N
        jMIPesquisar.setText("Pesquisar");
        jMIPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarActionPerformed(evt);
            }
        });
        jMPesquisar.add(jMIPesquisar);

        jMenuBar1.add(jMPesquisar);

        jMListar.setText("Listar");

        jMIListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMIListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/lista.png"))); // NOI18N
        jMIListar.setText("Listar");
        jMIListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListarActionPerformed(evt);
            }
        });
        jMListar.add(jMIListar);

        jMenuBar1.add(jMListar);

        jMExcluir.setText("Excluir");

        jMIExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMIExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/lixo.png"))); // NOI18N
        jMIExcluir.setText("Excluir");
        jMIExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExcluirActionPerformed(evt);
            }
        });
        jMExcluir.add(jMIExcluir);

        jMenuBar1.add(jMExcluir);

        jMenu1.setText("Opções");

        JMSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        JMSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/info.png"))); // NOI18N
        JMSobre.setText("Sobre");
        JMSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMSobreActionPerformed(evt);
            }
        });
        jMenu1.add(JMSobre);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVeiculoActionPerformed
        CadastroVeiculo cadastro = new CadastroVeiculo(this,true,informacao);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMIVeiculoActionPerformed

    private void jMIVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarActionPerformed
        Visualizar visualizar = new Visualizar(this,true,informacao);
        visualizar.setVisible(true);
    }//GEN-LAST:event_jMIVisualizarActionPerformed

    private void jMIExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExcluirActionPerformed
        Excluir excluir = new Excluir(this,true,informacao);
        excluir.setVisible(true);
    }//GEN-LAST:event_jMIExcluirActionPerformed
        
    private void jMIPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarActionPerformed
        Pesquisar pesquisar= new Pesquisar(this,true,informacao);
        pesquisar.setVisible(true);
    }//GEN-LAST:event_jMIPesquisarActionPerformed

    private void jMIListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListarActionPerformed
        Listar listar = new Listar(this,true,informacao);
        listar.setVisible(true);
    }//GEN-LAST:event_jMIListarActionPerformed

    private void JMSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMSobreActionPerformed
        Sobre sobre = new Sobre(this,true,informacao);
        sobre.setVisible(true);
    }//GEN-LAST:event_JMSobreActionPerformed

    private void validaCampo(java.awt.event.KeyEvent evt) {                             
       char tecla=evt.getKeyChar();
       if (!Character.isDigit(tecla)){
           evt.consume();
       }
    }
    
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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMCadastrar;
    private javax.swing.JMenu jMExcluir;
    private javax.swing.JMenuItem jMIExcluir;
    private javax.swing.JMenuItem jMIListar;
    private javax.swing.JMenuItem jMIPesquisar;
    private javax.swing.JMenuItem jMIVeiculo;
    private javax.swing.JMenuItem jMIVisualizar;
    private javax.swing.JMenu jMListar;
    private javax.swing.JMenu jMPesquisar;
    private javax.swing.JMenu jMVisualizar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    // End of variables declaration//GEN-END:variables
}