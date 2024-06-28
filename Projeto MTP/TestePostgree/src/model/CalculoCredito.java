package model;

//Calculo do credito dos clientes
public class CalculoCredito {
    public double credito (double salario, double despesa){
        double credito;
        
        credito = salario - despesa;
        
        return credito;
    }
}
