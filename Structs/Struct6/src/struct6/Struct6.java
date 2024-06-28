package struct6;
import java.util.Scanner;

public class Struct6 {

    public static class Cadastro {
        int idade;
        float salario;
        String nome;
        char sexo;
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Cadastro[] cadastros = new Cadastro[2];
        int idademax = 0;
        float idademax2 = 0;
        String identidade = "";

        for (int i = 0; i < 2; i++) {
            cadastros[i] = new Cadastro();

            System.out.println("Cadastro " + (i + 1));
            System.out.print("Nome: ");
            cadastros[i].nome = scanner.next();
            System.out.print("Idade: ");
            cadastros[i].idade = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            cadastros[i].sexo = scanner.next().charAt(0);
            System.out.print("Salario: ");
            cadastros[i].salario = scanner.nextFloat();
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            if (cadastros[i].idade > idademax2) {
                idademax2 = cadastros[i].idade;
                idademax = i;
            }
        }
        System.out.println("Pessoa com maior idade:");
        System.out.println("Nome: " + cadastros[idademax].nome);
        System.out.println("Idade: " + cadastros[idademax].idade);
        System.out.println("Sexo: " + cadastros[idademax].sexo);
        System.out.printf("Salario: %.2f\n", cadastros[idademax].salario);
        System.out.println();

        System.out.println("Pessoas do sexo masculino:");
        for (int i = 0; i < 2; i++) {
            if (cadastros[i].sexo == 'M') {
                System.out.println("Nome: " + cadastros[i].nome);
                System.out.println("Idade: " + cadastros[i].idade);
                System.out.printf("Salario: %.2f\n", cadastros[i].salario);
                System.out.println();
            }
        }

        System.out.println("Pessoas com salario maior que 1000:");
        for (int i = 0; i < 2; i++) {
            if (cadastros[i].salario > 1000) {
                System.out.println("Nome: " + cadastros[i].nome);
                System.out.println("Idade: " + cadastros[i].idade);
                System.out.println("Sexo: " + cadastros[i].sexo);
                System.out.println();
            }
        }
        System.out.print("Digite o nome da pessoa para imprimir seus dados: ");
        identidade = scanner.next();
        for (int i = 0; i < 2; i++) {
            if (cadastros[i].nome.equals(identidade)) {
                System.out.println("Dados da pessoa com identidade igual a " + identidade + ":");
                System.out.println("Idade: " + cadastros[i].idade);
                System.out.println("Sexo: " + cadastros[i].sexo);
                System.out.printf("Salario: %.2f\n", cadastros[i].salario);
                System.out.println();
                break;
            }
        }

        scanner.close();
    }
    
}
