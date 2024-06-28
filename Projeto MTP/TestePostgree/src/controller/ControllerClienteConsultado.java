package controller;
import conexao.Conexao;
import dao.DaoClienteConsultado;
import java.sql.Connection;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import model.CadastroCliente;

public class ControllerClienteConsultado {
    Connection conexao = new Conexao().getConexao();
    DaoClienteConsultado dao = new DaoClienteConsultado(conexao);
    List <CadastroCliente> lista = new ArrayList();

    
    public void cadastratClienteConsultado(int idCliente, int idAdmin, double credito){
        if(idCliente != 0 && idAdmin != 0 && credito != 0){
            dao.cadastrarClienteConsultado(idCliente, idAdmin, credito);
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
    
    public void alterarCredito(int id, double credito){
        if(id != 0 || credito != 0){
            dao.alterarCliente(id, credito);
            
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }
    
    public List <CadastroCliente> getCliente(String info, String escolha){
        lista.clear();
        lista = dao.getCliente(info, escolha);
        return lista;
    }
    
    public void deletarCLienteConsultado(int idCliente){
        dao.deletarClienteConsultado(idCliente);
    }
        
}
