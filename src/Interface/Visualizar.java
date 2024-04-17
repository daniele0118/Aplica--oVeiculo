
package Interface;


import aplicaçãoveiculo.Informacoes;
import aplicaçãoveiculo.Veiculo;
import javax.swing.JOptionPane;

public class Visualizar extends javax.swing.JDialog {

    private Informacoes informacoes;

    public Visualizar(java.awt.Frame parent, boolean modal, Informacoes informacoes) {
        super(parent, modal);
        initComponents();
        this.informacoes = informacoes;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTFMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFCor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBVisualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBProximo = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFMarca1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFModelo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFAno1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFPlaca1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFCor1 = new javax.swing.JTextField();

        jLabel2.setText("Marca");

        jTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMarcaActionPerformed(evt);
            }
        });

        jLabel1.setText("Modelo");

        jTFModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFModeloActionPerformed(evt);
            }
        });

        jLabel4.setText("Ano");

        jTFAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnoActionPerformed(evt);
            }
        });
        jTFAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAnovalidaCampos(evt);
            }
        });

        jLabel3.setText("Placa");

        jTFPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cor");

        jTFCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualização"));

        jBVisualizar.setText("Visualizar");
        jBVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarActionPerformed(evt);
            }
        });

        jBProximo.setText("Próximo");
        jBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProximoActionPerformed(evt);
            }
        });

        jBAnterior.setText("Anterior");
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        jLabel6.setText("Marca");

        jTFMarca1.setEditable(false);
        jTFMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMarca1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Modelo");

        jTFModelo1.setEditable(false);
        jTFModelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFModelo1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Ano");

        jTFAno1.setEditable(false);
        jTFAno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAno1ActionPerformed(evt);
            }
        });
        jTFAno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAno1validaCampos(evt);
            }
        });

        jLabel9.setText("Placa");

        jTFPlaca1.setEditable(false);
        jTFPlaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlaca1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Cor");

        jTFCor1.setEditable(false);
        jTFCor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jTFModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jTFMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFPlaca1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFAno1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFCor1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBProximo)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBVisualizar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAnterior)
                            .addComponent(jBProximo))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarActionPerformed
        Veiculo veiculo = informacoes.visualizar();
        if(veiculo == null){
            String message = "Não existe nenhum veículo cadastrado";
            JOptionPane.showMessageDialog(null, message, "Erro",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTFMarca1.setText(veiculo.getMarca());
        jTFModelo1.setText(veiculo.getModelo());
        String ano = null;
        ano = ""+veiculo.getAno();
        jTFAno1.setText(ano);
        jTFPlaca1.setText(veiculo.getPlaca());
        jTFCor1.setText(veiculo.getCor());
    }//GEN-LAST:event_jBVisualizarActionPerformed

    private void jTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMarcaActionPerformed

    private void jTFModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFModeloActionPerformed

    private void jTFAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAnoActionPerformed

    private void jTFAnovalidaCampos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAnovalidaCampos

        char tecla=evt.getKeyChar();
        if (!Character.isDigit(tecla)){
            evt.consume();
        }
    }//GEN-LAST:event_jTFAnovalidaCampos

    private void jTFPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlacaActionPerformed

    private void jTFCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorActionPerformed

    private void jTFMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMarca1ActionPerformed
        
    }//GEN-LAST:event_jTFMarca1ActionPerformed

    private void jTFModelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFModelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFModelo1ActionPerformed

    private void jTFAno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAno1ActionPerformed

    private void jTFAno1validaCampos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAno1validaCampos

        char tecla=evt.getKeyChar();
        if (!Character.isDigit(tecla)){
            evt.consume();
        }
    }//GEN-LAST:event_jTFAno1validaCampos

    private void jTFPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlaca1ActionPerformed

    private void jTFCor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCor1ActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
        if(jTFMarca1.getText().equals("")){
            String message = "Clique em visualizar primeiro";
            JOptionPane.showMessageDialog(null, message, "Erro",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        Veiculo veiculo = informacoes.proximo();
        if(veiculo == null){
            String message = "Não existe outro veiculo";
            JOptionPane.showMessageDialog(null, message, "Erro",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTFMarca1.setText(veiculo.getMarca());
        jTFModelo1.setText(veiculo.getModelo());
        String ano = null;
        ano = ""+veiculo.getAno();
        jTFAno1.setText(ano);
        jTFPlaca1.setText(veiculo.getPlaca());
        jTFCor1.setText(veiculo.getCor());
    }//GEN-LAST:event_jBProximoActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        if(jTFMarca1.getText().equals("")){
            String message = "Clique em visualizar primeiro";
            JOptionPane.showMessageDialog(null, message, "Erro",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        Veiculo veiculo = informacoes.anterior();
        if(veiculo == null){
            String message = "Não existe outro veiculo";
            JOptionPane.showMessageDialog(null, message, "Erro",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTFMarca1.setText(veiculo.getMarca());
        jTFModelo1.setText(veiculo.getModelo());
        String ano = null;
        ano = ""+veiculo.getAno();
        jTFAno1.setText(ano);
        jTFPlaca1.setText(veiculo.getPlaca());
        jTFCor1.setText(veiculo.getCor());
    }//GEN-LAST:event_jBAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFAno1;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFCor1;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMarca1;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTextField jTFModelo1;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTextField jTFPlaca1;
    // End of variables declaration//GEN-END:variables
}
