package struct1;
import java.util.Scanner;

public class Struct1 {
    static class Hora {
        int hora;
        int minuto;
        int segundo;
    }
    
    public static void main(String[] args) {
        Hora temp = new Hora();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        temp.hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        temp.minuto = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        temp.segundo = scanner.nextInt();

        System.out.println("\nValores digitados:");
        System.out.println("Hora: " + temp.hora);
        System.out.println("Minutos: " + temp.minuto);
        System.out.println("Segundos: " + temp.segundo);

        scanner.close();
    }
    
}
