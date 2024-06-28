import java.util.Scanner;

public class Recursividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número grande: ");
        long numero = scanner.nextLong();
        
        System.out.print("Digite a unidade que deseja contar: ");
        int unidade = scanner.nextInt();
        
        int quantidade = contarUnidade(numero, unidade);
        
        System.out.println("A unidade " + unidade + " aparece " + quantidade + " vezes no número " + numero + ".");
    }
        public static int contarUnidade(long numero, int unidade) {
        // Caso base: quando o número se torna zero
        if (numero == 0) {
            return 0;
        }
        
        // Verifica a última unidade do número e compara com a unidade desejada
        int ultimaUnidade = (int) (numero % 10);
        if (ultimaUnidade == unidade) {
            // Se for igual, incrementa a contagem em 1
            return 1 + contarUnidade(numero / 10, unidade);
        } else {
            // Se for diferente, apenas chama a função recursiva com o número sem a última unidade
            return contarUnidade(numero / 10, unidade);
        }
    }
}
