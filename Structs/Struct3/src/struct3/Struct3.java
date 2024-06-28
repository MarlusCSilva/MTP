package struct3;
import java.util.Scanner;

class Data {
    int dia;
    int mes;
    int ano;
}

class Endereco {
    int numero;
    String rua;
    String cidade;
    String estado;
    String cep;
}

class Pessoa {
    float peso;
    String nome;
    char sexo;
    Data nascimento;
    Endereco endereco;
}


public class Struct3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("--- Ficha ---");
        System.out.print("Informe o nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.print("Informe o sexo (M/F): ");
        pessoa.sexo = scanner.next().charAt(0);

        System.out.print("Informe o peso: ");
        pessoa.peso = scanner.nextFloat();

        System.out.print("Informe a data de nascimento (DD MM AAAA): ");
        pessoa.nascimento = new Data();
        pessoa.nascimento.dia = scanner.nextInt();
        pessoa.nascimento.mes = scanner.nextInt();
        pessoa.nascimento.ano = scanner.nextInt();

        System.out.println("--- Endereço ---");
        pessoa.endereco = new Endereco();
        scanner.nextLine(); 
        System.out.print("Informe o nome da rua: ");
        pessoa.endereco.rua = scanner.nextLine();

        System.out.print("Informe o número: ");
        pessoa.endereco.numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Informe a cidade: ");
        pessoa.endereco.cidade = scanner.nextLine();

        System.out.print("Informe o estado: ");
        pessoa.endereco.estado = scanner.nextLine();

        System.out.print("Informe o CEP: ");
        pessoa.endereco.cep = scanner.nextLine();

        System.out.println("\n--- Resultados ---\n");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Sexo: " + pessoa.sexo);
        System.out.printf("Peso: %.2f%n", pessoa.peso);
        System.out.printf(
            "Data de Nascimento: %02d/%02d/%04d%n",
            pessoa.nascimento.dia,
            pessoa.nascimento.mes,
            pessoa.nascimento.ano
        );
        System.out.println("Rua: " + pessoa.endereco.rua);
        System.out.println("Número: " + pessoa.endereco.numero);
        System.out.println("Cidade: " + pessoa.endereco.cidade);
        System.out.println("Estado: " + pessoa.endereco.estado);
        System.out.println("CEP: " + pessoa.endereco.cep);

        scanner.close();
    }
    
}
