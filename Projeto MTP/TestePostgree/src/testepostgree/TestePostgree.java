package testepostgree;
import conexao.Conexao;
import view.FrmLogin;

public class TestePostgree {

    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        Conexao conexao = new Conexao();
        conexao.getConexao();
    }
    
}
