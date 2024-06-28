package controller;
import model.CadastroAdmin;
import conexao.Conexao;
import dao.DaoAdmin;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import model.CadastroAdmin;

public class ControllerAdmin {
    Connection conexao = new Conexao().getConexao();
    DaoAdmin dao = new DaoAdmin(conexao);
    List <CadastroAdmin> lista = new ArrayList();
    
    
    public List <CadastroAdmin> getAdmin(){
        lista.clear();
        lista = dao.getAdmin();
        return lista;
    }
    
    public void cadastrarAdmin(CadastroAdmin cadAdmin){
        if(!cadAdmin.nome.equals("") && !cadAdmin.usuario.equals("") && !cadAdmin.email.equals("") && !cadAdmin.senha.equals("")){
            dao.cadastrarAdmin(cadAdmin);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            
        }
    }
    
    public void alterarAdmin(String usuario, String email, String senha){
        if(!usuario.equals("") && !email.equals("") && !senha.equals("")){
            dao.alterarAdmin(usuario, email, senha);
            JOptionPane.showMessageDialog(null,"Cadastro salvo com sucesso!!!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            
        }
    }
    
    public void deletarAdmin(String usuario, String senha){
        int selecionado = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o cadastro","Certeza?",JOptionPane.YES_NO_OPTION);
        if(selecionado == 0){
            dao.deletarAdmin(usuario, senha);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
            
        }
    }
    
    public boolean verificarAdmin(String usuario, String senha){
        boolean valido = dao.verificarAdmin(usuario, senha); 
        return valido;
    }
    
    public boolean adminCadastrado(String usuario){
        boolean valido = dao.adminCadastrado(usuario);
        return valido;
    }
    
    public int idAdmin(String usuario, String senha){
        int idAdmin = dao.idAdmin(usuario, senha);
        return idAdmin;
    }
}
