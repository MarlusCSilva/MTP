package struct4;
import java.util.Scanner;

public class Struct4 {
    
    static class Computador {
        int anoDeFabricacao;
        float peso;
        String marca;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computador[] computadores = new Computador[3];

        for (int i = 0; i < 3; i++) {
            computadores[i] = new Computador();
            System.out.print("Digite a marca do computador " + (i + 1) + ": ");
            computadores[i].marca = scanner.next();
            System.out.print("Digite o ano de fabricacao do computador " + (i + 1) + ": ");
            computadores[i].anoDeFabricacao = scanner.nextInt();
            System.out.print("Digite o peso do computador " + (i + 1) + ": ");
            computadores[i].peso = scanner.nextFloat();
            System.out.println();
        }

        System.out.println("Informações dos computadores:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Computador " + (i + 1) + ":");
            System.out.println("Marca: " + computadores[i].marca);
            System.out.println("Ano de fabricacao: " + computadores[i].anoDeFabricacao);
            System.out.println("Peso: " + String.format("%.2f", computadores[i].peso));
            System.out.println();
        }
    }
}
