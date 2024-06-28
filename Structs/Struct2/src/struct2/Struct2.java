package struct2;
import java.util.Scanner;


class Endereco{
    int numero;
    String rua;
    String cidade;
    String estado;
    String cep;
}

public class Struct2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Endereco endereco = new Endereco();

        System.out.print("Informe o nome da rua: ");
        endereco.rua = scanner.nextLine();

        System.out.print("Informe o número: ");
        endereco.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a cidade: ");
        endereco.cidade = scanner.nextLine();

        System.out.print("Informe o estado: ");
        endereco.estado = scanner.nextLine();

        System.out.print("Informe o CEP: ");
        endereco.cep = scanner.nextLine();

        System.out.println("\nResultado!");
        System.out.println("Rua: " + endereco.rua);
        System.out.println("Número: " + endereco.numero);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("Estado: " + endereco.estado);
        System.out.println("CEP: " + endereco.cep);

        scanner.close();
    }
    
}
