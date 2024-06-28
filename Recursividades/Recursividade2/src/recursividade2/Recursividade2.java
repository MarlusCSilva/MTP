
package recursividade2;


public class Recursividade2 {

    public static void main(String[] args) {
        int numero = 5; 
        int resultado = calcularSomatorio(numero);
        System.out.println("O somatório de " + numero + " até zero é: " + resultado);
    }
     public static int calcularSomatorio(int numero) {
        if (numero == 0) {
            return 0; 
        } else {
            return numero + calcularSomatorio(numero - 1); 
        }
    }
}
