package Calculadora;

public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora() {
    }
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public int suma(){
        return numero1 + numero2;
    }
    public int rest(){
        return numero1 - numero2;
    }
    public int multiplicacion(){
        return numero1 * numero2;
    }
    public int division(){
        return numero1 / numero2;
    }


}
