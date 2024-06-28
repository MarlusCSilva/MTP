package dao;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import model.CadastroAdmin;

public class DaoAdmin {
    Connection conexao;
    PreparedStatement pstm;
    
    public DaoAdmin(Connection conexao) {
        this.conexao = conexao;
    }
   
    
    public List <CadastroAdmin> getAdmin(){
        List <CadastroAdmin> lista = new ArrayList();
        ResultSet result;
        
        conexao = new Conexao().getConexao();
        
        try{
            pstm = conexao.prepareStatement("SELECT * FROM administrador", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            result = this.pstm.executeQuery();
            if(result.first()){
                do{
                    CadastroAdmin cad = new CadastroAdmin();
                    cad.nome = result.getString("nome");
                    cad.usuario = result.getString("usuario");
                    cad.email = result.getString("email");
                    cad.senha = result.getString("senha");
                    
                    lista.add(cad);
                }while(result.next());
            }
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!");           
        }finally{
            try{
                conexao.close();
            }catch(SQLException Erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!");
            }
        }
        return lista;
    }
    
    public void cadastrarAdmin(CadastroAdmin cadAdmin) {
        try {
            String comandoCadastro = "INSERT INTO administrador(nome, usuario, email, senha) VALUES('"+cadAdmin.nome+"', '"+cadAdmin.usuario+"', '"+cadAdmin.email+"', '"+cadAdmin.senha+"')";
            pstm = conexao.prepareStatement(comandoCadastro);
            pstm.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!");
        }
    }
    
    public boolean verificarAdmin(String usuario, String senha) {
        try {
            String comandoBusca = "SELECT * FROM administrador WHERE usuario = '"+usuario+"' AND senha = '"+senha+"'";
            PreparedStatement statement = conexao.prepareStatement(comandoBusca);

            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ecnontrar os dados!");

            return false; 
        }
    }
    
    public int idAdmin(String usuario, String senha){
        int idAdmin = -1;
        try{
            String comandoBusca = "SELECT * FROM administrador id_admin WHERE usuario = '"+usuario+"' AND senha = '"+senha+"'";
            PreparedStatement statement = conexao.prepareStatement(comandoBusca);
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
            idAdmin = resultSet.getInt("id_admin");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar os dados!");
        }
        return idAdmin;
    }
    
    public void deletarAdmin(String usuario, String senha){
            
        try{
            String comandoDelete = "DELETE FROM administrador WHERE usuario = '"+usuario+"' AND senha = '"+senha+"'";
            pstm = conexao.prepareStatement(comandoDelete);
            pstm.executeUpdate();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao deletar o usuário!" + erro);
        }
    }
    
    public void alterarAdmin(String usuario, String email, String senha){
        try{
            String comandoAlterar = "UPDATE administrador SET senha = '"+senha+"' WHERE usuario = '"+usuario+"' AND email = '"+email+"'";
            PreparedStatement pstm = conexao.prepareStatement(comandoAlterar); 
            pstm.executeUpdate();       
        
            pstm.close();
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do administrador: " + erro.getMessage());
        }       
    }
    
    public boolean adminCadastrado(String usuario){
            try {
                String comandoBusca = "SELECT * FROM administrador WHERE usuario = '"+usuario+"'";
                PreparedStatement statement = conexao.prepareStatement(comandoBusca);

                ResultSet resultSet = statement.executeQuery();

                return resultSet.next();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao ecnontrar os dados!");
                
                return false; 
            }
        }
}
