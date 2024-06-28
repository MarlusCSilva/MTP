package view;
import model.CadastroCliente;
import controller.ControllerCliente;
import controller.ControllerClienteConsultado;
import javax.swing.*;
import model.CalculoCredito;

public class FrmAlterar extends javax.swing.JFrame {
    ControllerCliente controlCliente = new ControllerCliente();
    ControllerClienteConsultado controlConsultado = new ControllerClienteConsultado();
    
    int idCliente;
    
    public FrmAlterar() {
        initComponents();
        setLocationRelativeTo(null);
        //Bloqueia a inserção de algum dado nos campos da tela 
        campoNome.setEnabled(false);
        campoCpf.setEnabled(false);
        campoRg.setEnabled(false);
        campoSalario.setEnabled(false);
        campoDespesa.setEnabled(false);
        campoCredito.setEnabled(false);
        campoId.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxEscolha = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Credito = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoRg = new javax.swing.JTextField();
        campoSalario = new javax.swing.JTextField();
        campoDespesa = new javax.swing.JTextField();
        campoCredito = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        campoCpf = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(698, 498));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alterar dados do Cliente");

        cbxEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Alterar pelo --", "RG", "CPF" }));
        cbxEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEscolhaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RG");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salário");

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Despesa");

        Credito.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        Credito.setForeground(new java.awt.Color(255, 255, 255));
        Credito.setText("Crédito");

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

        btnAlterar.setBackground(new java.awt.Color(0, 158, 186));
        btnAlterar.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(236, 236, 236)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(campoCpf)
                                        .addComponent(campoRg)
                                        .addComponent(campoId))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Credito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(cbxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(campoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Credito)
                    .addComponent(campoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscolhaActionPerformed
        //Seleciona os campo do bombo box
        Object selecionado = cbxEscolha.getSelectedItem();
        String format, escolha;
        
        //Compara a palavra com a do combo box e seleciona o atributo escolhido
        try{
            if(selecionado.equals("CPF")){
                format = JOptionPane.showInputDialog(this, "Insira o CPF abaixo", "Preencha", JOptionPane.INFORMATION_MESSAGE);
                escolha = format.substring(0, 3) + "." + format.substring(3, 6) + "." + format.substring(6, 9) + "-" + format.substring(9);
                
                campoCpf.setText("" + escolha);
                
                campoNome.setEnabled(true);
                campoRg.setEnabled(true);
                campoSalario.setEnabled(true);
                campoDespesa.setEnabled(true);
                
            }else if(selecionado.equals("RG")){
                escolha = JOptionPane.showInputDialog(this, "Insira o RG abaixo", "Preencha", JOptionPane.INFORMATION_MESSAGE);
                
                campoRg.setText("" + escolha);
                
                campoNome.setEnabled(true);
                campoCpf.setEnabled(true);
                campoSalario.setEnabled(true);
                campoDespesa.setEnabled(true);
              
            }else{
                
            }
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Documento inválido. Insira o documento corretamente!" + e, "Erro", JOptionPane.ERROR_MESSAGE);
        
        }catch(NumberFormatException er){
            JOptionPane.showMessageDialog(null, "Erro!" + er);

        }      
    }//GEN-LAST:event_cbxEscolhaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Caso a pessoa queira continuar limpa os campos da tela, senão ficha a tela
        Object[] opcoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja alterar outro cadastro?", "Selecione", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if(resp == 0){
            campoNome.setText("");
            campoCpf.setText("");
            campoRg.setText("");
            campoSalario.setText("");
            campoDespesa.setText("");
            campoCredito.setText("");
        }else{
            new FrmPrincipal().show();
            this.dispose();

        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //Recebe a conexão com o banco de dados e os dados dos campos
        //e chama a função para o calculo do credito
        //apos isso altera o que a pessoa desejar
        
        try{
            
            CadastroCliente cadCliente = new CadastroCliente();
            CalculoCredito calculo = new CalculoCredito();
            cadCliente.nome_cliente = campoNome.getText();
            cadCliente.cpf = campoCpf.getText();
            cadCliente.rg = campoRg.getText();
            cadCliente.salario = Double.parseDouble(campoSalario.getText());
            cadCliente.despesa = Double.parseDouble(campoDespesa.getText());
            


            cadCliente.credito = calculo.credito(cadCliente.salario, cadCliente.despesa);
            
            controlCliente.alterarCliente(cadCliente);
            
            String cpf = campoCpf.getText();
            String rg = campoRg.getText();
            
            
            //mostrar();
            
            idCliente = controlCliente.idCliente(cpf, rg);            
            
            controlConsultado.alterarCredito(idCliente, cadCliente.credito);        
            
            
            Object[] opcoes = {"Sim", "Não"};
            int resp = JOptionPane.showOptionDialog(this, "Deseja realizar outra alteração?", "Selecione", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if(resp == 0){
                campoNome.setText("");
                campoCpf.setText("");
                campoRg.setText("");
                campoSalario.setText("");
                campoDespesa.setText("");
                campoCredito.setText("");
                campoId.setText("" + idCliente);
                
            }else{
                new FrmPrincipal().show();
                this.dispose();
            }
            
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Documento inválido. Insira o documento corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        
        }catch(NumberFormatException er){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos vazios!");

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Credito;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoCredito;
    private javax.swing.JTextField campoDespesa;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRg;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JComboBox<String> cbxEscolha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
