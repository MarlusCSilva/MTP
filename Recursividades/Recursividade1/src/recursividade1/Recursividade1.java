
package recursividade1;


public class Recursividade1 {
    public static int calcularFatorial(int n) {
       if (n == 0) {
           return 1;
        }  else 
        {
           return n * calcularFatorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int numero = 6; // Substitua pelo número para o qual você deseja calcular o fatorial.
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
    
}
