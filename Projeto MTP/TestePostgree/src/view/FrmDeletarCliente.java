package view;
import javax.swing.*;
import controller.ControllerCliente;
import controller.ControllerClienteConsultado;

public class FrmDeletarCliente extends javax.swing.JFrame {
    ControllerCliente controlCliente = new ControllerCliente();
    ControllerClienteConsultado controlConsultado = new ControllerClienteConsultado();
    int indice = 0;
    
    public FrmDeletarCliente() {
        initComponents();
        setLocationRelativeTo(null);
        
        //campoNome.setEnabled(false);
        campoCpf.setEnabled(false);
        campoRg.setEnabled(false);
        //campoSalario.setEnabled(false);
        //campoDespesa.setEnabled(false);
        //campoCredito.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxEscolha = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        campoCpf = new javax.swing.JFormattedTextField();
        btnDeletar = new javax.swing.JButton();
        campoRg = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Deletar cadastro do Cliente");

        cbxEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Deletar pelo --", "RG", "CPF" }));
        cbxEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEscolhaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RG");

        btnCancelar.setBackground(new java.awt.Color(0, 158, 186));
        btnCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnDeletar.setBackground(new java.awt.Color(0, 158, 186));
        btnDeletar.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        try {
            campoRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscolhaActionPerformed
        
        
        Object selecionado = cbxEscolha.getSelectedItem();
        String format, escolha, info,cpf, rg;
        
        
        try{
            if(selecionado.equals("CPF")){
                format = JOptionPane.showInputDialog(this, "Insira o CPF abaixo", "Preencha", JOptionPane.INFORMATION_MESSAGE);
                if(format != null && format.length() == 11){
                    escolha = format.substring(0, 3) + "." + format.substring(3, 6) + "." + format.substring(6, 9) + "-" + format.substring(9);
                    info = "cpf_cliente";
                    cpf = escolha;
                    rg = "0";
                    
                    int idCliente = controlCliente.idCliente(cpf, rg);
                    
                    controlConsultado.deletarCLienteConsultado(idCliente);
                    
                    controlCliente.deletarCliente(cpf, rg);
                    
                    campoCpf.setText("" + escolha);
                                
                }else{
                     JOptionPane.showMessageDialog(this, "CPF inválido. Insira o CPF corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
            }else if(selecionado.equals("RG")){
                escolha = JOptionPane.showInputDialog(this, "Insira o RG abaixo", "Preencha", JOptionPane.INFORMATION_MESSAGE);
                info = "rg_cliente";
                cpf = "0";
                rg = escolha;
                
                int idCliente = controlCliente.idCliente(cpf, rg);
                
                controlConsultado.deletarCLienteConsultado(idCliente);
                
                controlCliente.deletarCliente(cpf, rg);
                
                campoRg.setText("" + escolha);
                
            }else{
                JOptionPane.showMessageDialog(this, "Selecione a opção desejada.");
            }
        }catch(IndexOutOfBoundsException e){
            //JOptionPane.showMessageDialog(null, "Documento inválido. Insira o documento corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        
        }catch(NumberFormatException er){
            JOptionPane.showMessageDialog(null, "Erro!" + er);
            
        }catch(NullPointerException ee){
            JOptionPane.showMessageDialog(null, "Erro" + ee);

        }  
    }//GEN-LAST:event_cbxEscolhaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        continuar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String rg, cpf;
        cpf = campoCpf.getText();
        rg = campoRg.getText();
        
        controlCliente.deletarCliente(cpf, rg);
        
        //campoNome.setText("");
        campoCpf.setText("");
        campoRg.setText("");
        //campoSalario.setText("");
        //campoDespesa.setText("");
        //campoCredito.setText("");
        
        continuar();
    }//GEN-LAST:event_btnDeletarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDeletarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoRg;
    private javax.swing.JComboBox<String> cbxEscolha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    public void continuar(){
        Object[] opcoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja deletar outro cadastro?", "Selecione", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if(resp == 0){
            //campoNome.setText("");
            campoCpf.setText("");
            campoRg.setText("");
            ///campoSalario.setText("");
            //campoDespesa.setText("");
            //campoCredito.setText("");
        }else{
            new FrmPrincipal().show();
            this.dispose();

        }
    }

}
