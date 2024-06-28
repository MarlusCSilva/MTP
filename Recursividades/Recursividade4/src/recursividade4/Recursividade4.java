package recursividade4;

public class Recursividade4 {

    public static void main(String[] args) {
        int base = 2;
        int expoente = 3;
        int resultado = calcularExponenciacao(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
     public static int calcularExponenciacao(int base, int expoente) {
        if (expoente == 0) 
        {
            return 1;
        }
        else 
        {
            return base * calcularExponenciacao(base, expoente - 1);
        }
    }
}
