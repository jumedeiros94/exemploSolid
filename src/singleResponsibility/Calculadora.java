package singleResponsibility;

public class Calculadora  {
    public static void main(String[] args) {
         double a = 10, b = 20;

        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();

        System.out.println(soma.calcular(a, b) + "\n");
        System.out.println(sub.calcular(a, b) + "\n");
        System.out.println(mult.calcular(a, b) + "\n");
    }
}
