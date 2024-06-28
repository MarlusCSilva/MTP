package conexao;
import javax.swing.JOptionPane;
import java.sql.*;

//Conecta ao banco de dados PostgresSql
public class Conexao {
    Connection conexao;
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/testebanco";
    private final String user = "postgres";
    private final String password = "postgres";
    
    public Connection getConexao(){
            
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            
        }catch(SQLException fonte){
            JOptionPane.showMessageDialog(null, "Fonte do banco de dados não encontrado!");
        }catch(ClassNotFoundException drive){
            JOptionPane.showMessageDialog(null, "Driver não encontrado");
        }
        return conexao;
    }
    
}
