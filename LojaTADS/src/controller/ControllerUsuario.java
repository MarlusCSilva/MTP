package controller;
import java.util.List;
import java.util.ArrayList;
import model.Usuario;
import dao.DaoUsuario;
import javax.swing.*;

public class ControllerUsuario {
    DaoUsuario dao = new DaoUsuario();
    List <Usuario> lista = new ArrayList();
    
    public List <Usuario> getUsuario(){
        lista.clear();
        lista = dao.getUsuarios();
        JOptionPane.showMessageDialog(null, "Usuario coletado com sucesso!");
        return lista;
    }
    
    public boolean validarLogin (String n, String s){
        boolean valido = dao.validarLogin(n, s);
        return valido;
    }
}
