package dao;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.CadastroCliente;

public class DaoCliente {
    Connection conexao = null;
    PreparedStatement pstm = null;
    
    public DaoCliente(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void cadastrarCliente(CadastroCliente cad, int idAdmin) {
        try {
            String comandoCadastro = "INSERT INTO cliente(id_admin ,nome_cliente, cpf_cliente, rg_cliente, salario_cliente, despesa_cliente) VALUES('"+idAdmin+"' ,'"+cad.nome_cliente+"', '"+cad.cpf+"', '"+cad.rg+"', '"+cad.salario+"', '"+cad.despesa+"')";
            pstm = conexao.prepareStatement(comandoCadastro);
            pstm.executeUpdate();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!");
        }
    }
    
    public boolean cpfCadastrado(String cpf){
        try{
            String comandoBusca = "SELECT * FROM cliente WHERE cpf_cliente = '"+cpf+"'";
            PreparedStatement statement = conexao.prepareStatement(comandoBusca);

            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao ecnontrar os dados!");

            return false; 
        }
    }
    
    public boolean rgCadastrado(String rg){
        try{
            String comandoBusca = "SELECT * FROM cliente WHERE rg_cliente = '"+rg+"'";
            PreparedStatement statement = conexao.prepareStatement(comandoBusca);

            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao ecnontrar os dados!");

            return false; 
        }
    }
    
    public List <CadastroCliente> getCliente(String info, String escolha){
        ArrayList <CadastroCliente> lista = new ArrayList();
        ResultSet result = null;

        conexao = new Conexao().getConexao();

        try{
            String comandoBusca = "SELECT cliente.*, cliente_consultado.credito_cliente FROM cliente LEFT JOIN cliente_consultado ON cliente.id_cliente = cliente_consultado.id_cliente WHERE "+info+" = '"+escolha+"';";
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
                    cadastro.credito = Double.parseDouble(result.getString("credito"));

                    lista.add(cadastro);
                }while(result.next());
            }
            pstm.close();
        }catch(StringIndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog(null, "Documento inválido! Insira o número corretamente.");

        }catch(SQLException er){
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
    
    public void alterarCliente(CadastroCliente cad){
        try{
            String comandoAlterar = "UPDATE cliente SET nome_cliente = '"+cad.nome_cliente+"', cpf_cliente = '"+cad.cpf+"', rg_cliente = '"+cad.rg+"', salario_cliente = "+cad.salario+", despesa_cliente = "+cad.despesa+" WHERE cpf_cliente = '"+cad.cpf+"' OR rg_cliente = '"+cad.rg+"'";
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
    
    public void deletarCliente(String cpf, String rg){
        conexao = new Conexao().getConexao();    
        try{
            String comandoDelete = "DELETE FROM cliente WHERE cpf_cliente = '"+cpf+"' OR rg_cliente = '"+rg+"'";
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
    
    public List <CadastroCliente> getClienteNegativo(){
        ArrayList <CadastroCliente> lista = new ArrayList();
        ResultSet result;

        conexao = new Conexao().getConexao();

        try{
            String comandoBusca = "SELECT cliente.*, cliente_consultado.credito_cliente AS credito FROM cliente INNER JOIN cliente_consultado ON cliente.id_cliente = cliente_consultado.id_cliente WHERE cliente_consultado.credito_cliente < 0";
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
                    cadastro.credito = Double.parseDouble(result.getString("credito"));
                    cadastro.id_cliente = Integer.parseInt(result.getString("id_cliente"));

                    lista.add(cadastro);
                }while(result.next());
            }
            pstm.close();
        }catch(StringIndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog(null, "Documento inválido! Insira o número corretamente.");

        }catch(SQLException er){
             JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + er);

        }finally{
            try{
                conexao.close();
            }catch(SQLException Erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!");
            }
        }
        return lista;
    }
    
    public List <CadastroCliente> getTodos(){
        ArrayList <CadastroCliente> lista = new ArrayList();
        ResultSet result;

        conexao = new Conexao().getConexao();

        try{
            String comandoBusca = "SELECT cliente.*, cliente_consultado.credito_cliente AS credito FROM cliente INNER JOIN cliente_consultado ON cliente.id_cliente = cliente_consultado.id_cliente";
            pstm = conexao.prepareStatement(comandoBusca, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            result = this.pstm.executeQuery();
            if(result.first()){
                do{
                    CadastroCliente cadastro = new CadastroCliente();
                    
                    cadastro.id_cliente = Integer.parseInt(result.getString("id_cliente"));
                    cadastro.nome_cliente = result.getString("nome_cliente");
                    cadastro.cpf = result.getString("cpf_cliente");
                    cadastro.rg = result.getString("rg_cliente");
                    cadastro.salario = Double.parseDouble(result.getString("salario_cliente"));
                    cadastro.despesa = Double.parseDouble(result.getString("despesa_cliente"));
                    cadastro.credito = Double.parseDouble(result.getString("credito"));

                    lista.add(cadastro);
                }while(result.next());
            }
            pstm.close();
        }catch(StringIndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog(null, "Documento inválido! Insira o número corretamente.");

        }catch(SQLException er){
             JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + er);
             
        }catch(UnsupportedOperationException un){
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!" + un);
            
        }finally{
            try{
                conexao.close();
            }catch(SQLException Erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!");
            }
        }
        return lista;
    }
    
    public List <CadastroCliente> getClienteAlterar(String rg, String cpf){
        ArrayList <CadastroCliente> lista = new ArrayList();
        ResultSet result;

        conexao = new Conexao().getConexao();

        try{
            String comandoBusca = "SELECT cliente.nome_cliente, cliente.cpf_cliente, cliente.rg_cliente, cliente.salario_cliente, cliente.despesa_cliente, cliente_consultado.credito_cliente FROM cliente LEFT JOIN cliente_consultado ON cliente.id_cliente = cliente_consultado.id_cliente WHERE cpf_cliente = '"+cpf+"' OR rg_cliente = '"+rg+"'";
            pstm = conexao.prepareStatement(comandoBusca, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            result = this.pstm.executeQuery();
            if(result.first()){
                do{
                    CadastroCliente cadastro = new CadastroCliente();
                    
                    cadastro.id_cliente = Integer.parseInt(result.getString("id_cliente"));
                    cadastro.nome_cliente = result.getString("nome_cliente");
                    cadastro.cpf = result.getString("cpf_cliente");
                    cadastro.rg = result.getString("rg_cliente");
                    cadastro.salario = Double.parseDouble(result.getString("salario_cliente"));
                    cadastro.despesa = Double.parseDouble(result.getString("despesa_cliente"));
                    cadastro.credito = Double.parseDouble(result.getString("credito_cliente"));

                    lista.add(cadastro);
                }while(result.next());
            }
            pstm.close();
        }catch(StringIndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog(null, "Documento inválido! Insira o número corretamente.");

        }catch(SQLException er){
             JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + er);
             
        }catch(UnsupportedOperationException un){
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!" + un);
            
        }finally{
            try{
                conexao.close();
            }catch(SQLException Erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!");
            }
        }
        return lista;
    }
    
    public int idCliente(String cpf, String rg){
        int idCliente = -1;
        try{
            String comandoBusca = "SELECT id_cliente FROM cliente WHERE cpf_cliente = '"+cpf+"' OR rg_cliente = '"+rg+"'";
            PreparedStatement statement = conexao.prepareStatement(comandoBusca);
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
            idCliente = resultSet.getInt("id_cliente");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar os dados!");
        }
        return idCliente;
    }
}
