package recursidade7;

public class Recursidade7 {
        // Função recursiva para calcular o MDC usando o algoritmo de Euclides
    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a; // O MDC é o valor não nulo restante em 'a'
        } else {
            // Chamada recursiva com 'b' e 'a % b'
            return calcularMDC(b, a % b);
        }
    }
   
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 12;

        int mdc = calcularMDC(num1, num2);

        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);
    }   
}
