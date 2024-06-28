package recursividade5;

public class Recursividade5 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sequência de Fibonacci (Recursivo) para n = " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
