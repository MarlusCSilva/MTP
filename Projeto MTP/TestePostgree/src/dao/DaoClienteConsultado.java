package dao;

import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.CadastroCliente;

public class DaoClienteConsultado {
    Connection conexao = null;
    PreparedStatement pstm = null;
    
    public DaoClienteConsultado(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void cadastrarClienteConsultado(int idCliente, int idAdmin, double credito) {
        try {
            String comandoCadastro = "INSERT INTO cliente_consultado(id_cliente, id_admin, credito_cliente) VALUES('"+idCliente+"' ,'"+idAdmin+"', '"+credito+"')";
            pstm = conexao.prepareStatement(comandoCadastro);
            pstm.executeUpdate();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!");
        }
    }
    
    public void alterarCliente(int id, double credito){
        try{
            String comandoAlterar = "UPDATE cliente_consultado SET credito_cliente = "+credito+" WHERE id_cliente = "+id+"";
            PreparedStatement pstm = conexao.prepareStatement(comandoAlterar); 

            int linhaLida = pstm.executeUpdate();

            if (linhaLida > 0) {
                //JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");

            } else {
                //JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado. Verifique o usuário e o email.");
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do administrador: " + erro.getMessage());
        } 
    }
    
    public List <CadastroCliente> getCliente(String info, String escolha){
        ArrayList <CadastroCliente> lista = new ArrayList();
        ResultSet result = null;

        conexao = new Conexao().getConexao();

        try{
            String comandoBusca = "SELECT cliente.*, cliente_consultado.credito_cliente FROM cliente LEFT JOIN cliente_consultado ON cliente.id_cliente = cliente_consultado.id_cliente WHERE "+info+" = '"+escolha+"'";
            pstm = conexao.prepareStatement(comandoBusca, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            result = this.pstm.executeQuery();
            if(result.first()){
                do{
                    CadastroCliente cadastro = new CadastroCliente();

                    cadastro.nome_cliente = result.getString("nome_cliente");
                    cadastro.cpf = result.getString("cpf_cliente");
                    cadastro.rg = result.getString("rg_cliente");
                    cadastro.salario = Double.parseDouble(result.getString("salario_cliente"));
                    cadastro.despesa = Double.parseDouble(result.getString("despesa_cliente"));
                    cadastro.credito = Double.parseDouble(result.getString("credito_cliente"));
                    cadastro.id_cliente = Integer.parseInt(result.getString("id_cliente"));

                    lista.add(cadastro);
                }while(result.next());
            }
            pstm.close();
        }catch(StringIndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog(null, "Documento inválido! Insira o número corretamente.");

        }catch(SQLException er){
             JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + er);

        }catch(NullPointerException eer){
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados" + eer);

        }finally{
            try{
                conexao.close();
            }catch(SQLException Erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!");
            }
        }
        return lista;
    }
    
    public void deletarClienteConsultado(int idCliente){
        conexao = new Conexao().getConexao();    
        try{
            String comandoDelete = "DELETE FROM cliente_consultado WHERE id_cliente = "+idCliente+"";
            pstm = conexao.prepareStatement(comandoDelete);
            pstm.executeUpdate();
            conexao.close();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao deletar o usuário! " + erro);
            
        }finally{
            try{
                conexao.close();
            }
            catch(SQLException err)            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de exclusão "+err);
            }
        }   
    }
}
