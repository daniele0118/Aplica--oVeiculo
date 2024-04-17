
package Interface;

import aplicaçãoveiculo.Informacoes;
import aplicaçãoveiculo.Veiculo;
import javax.swing.table.DefaultTableModel;

public class Listar extends javax.swing.JDialog {

     
    private Informacoes informacoes;
    public Listar(java.awt.Frame parent, boolean modal,Informacoes informacoes) {
        super(parent, modal);
        this.informacoes = informacoes;
        initComponents();
        pop();
        setLocationRelativeTo(null);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar"));

        jTListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Modelo", "Cor", "Ano", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTListar);
        if (jTListar.getColumnModel().getColumnCount() > 0) {
            jTListar.getColumnModel().getColumn(0).setResizable(false);
            jTListar.getColumnModel().getColumn(1).setResizable(false);
            jTListar.getColumnModel().getColumn(2).setResizable(false);
            jTListar.getColumnModel().getColumn(3).setResizable(false);
            jTListar.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pop(){
        Veiculo[] veiculos = informacoes.listar();
        DefaultTableModel model = new DefaultTableModel(new Object [][] {

            },
            new String [] {
                "Placa", "Modelo", "Cor", "Ano", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        Object[] linhas = new Object[5];
        jTListar.setModel(model);
        
        for(int i = 0 ; i< veiculos.length ; i++){
            if(veiculos[i] != null){
                linhas[0] = veiculos[i].getPlaca();
                linhas[1] = veiculos[i].getModelo();
                linhas[2] = veiculos[i].getCor();
                linhas[3] = veiculos[i].getAno();
                linhas[4] = veiculos[i].getMarca();  
                model.addRow(linhas);   
            }
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListar;
    // End of variables declaration//GEN-END:variables

}
