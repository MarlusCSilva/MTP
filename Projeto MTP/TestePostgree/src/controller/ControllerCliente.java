package controller;
import conexao.Conexao;
import dao.DaoCliente;
import java.sql.Connection;
import model.CadastroCliente;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class ControllerCliente {
    Connection conexao = new Conexao().getConexao();
    DaoCliente dao = new DaoCliente(conexao);
    List <CadastroCliente> lista = new ArrayList();
    
    public void cadastrarCliente(CadastroCliente cadCliente, int idAdmin){
        if(!cadCliente.nome_cliente.equals("") && !cadCliente.cpf.equals("") && !cadCliente.rg.equals("") && cadCliente.salario != 0 && cadCliente.despesa != 0 && cadCliente.credito != 0){
            dao.cadastrarCliente(cadCliente, idAdmin);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!");
        }
    }
    
    public boolean cpfCadastrado(String cpf){
        boolean validar;
        validar = dao.cpfCadastrado(cpf);
        return validar;
    }
    
    public boolean rgCadastrado(String rg){
        boolean validar;
        validar = dao.rgCadastrado(rg);
        return validar;
    }
    
    public List <CadastroCliente> getCliente(String info, String escolha){
        lista.clear();
        lista = dao.getCliente(info, escolha);
        return lista;
    }
    
    public void alterarCliente(CadastroCliente cadCliente){
        if(!cadCliente.nome_cliente.equals("") && !cadCliente.cpf.equals("") && !cadCliente.rg.equals("") && cadCliente.salario != 0 && cadCliente.despesa != 0){
            dao.alterarCliente(cadCliente);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!");
        }
    }
    
    public void deletarCliente(String cpf, String rg){
        int selecionado = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o cadastro","Certeza?",JOptionPane.YES_NO_OPTION);
        if(selecionado == 0){
            dao.deletarCliente(cpf, rg);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
            
        }
    }
    
    public List <CadastroCliente> getClienteNegativo(){
        lista.clear();
        lista = dao.getClienteNegativo();
        return lista;
    }
    
    public List <CadastroCliente> getClienteAlterar(String rg, String cpf){
        lista.clear();
        lista = dao.getClienteAlterar(rg, cpf);
        return lista;
    }
    
    public List <CadastroCliente> getTodos(){
        lista.clear();
        lista = dao.getTodos();
        return lista;
    }  
    
    public int idCliente(String cpf, String rg){
        int idCliente = dao.idCliente(cpf, rg);
        return idCliente;
    }
    
}
