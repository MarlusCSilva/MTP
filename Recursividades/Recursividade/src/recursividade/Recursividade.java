
package recursividade;

public class Recursividade {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int resultado = somaArrayRecursivo(array, 0);
        System.out.println("A soma dos elementos do array é: " + resultado);
    }
    public static int somaArrayRecursivo(int[] array, int indice) {
        if (indice == array.length) 
        {
            return 0;
        }
        int somaParcial = somaArrayRecursivo(array, indice + 1);
        
        return array[indice] + somaParcial;
    }
}
