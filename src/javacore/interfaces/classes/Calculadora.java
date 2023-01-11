package javacore.interfaces.classes;

public class Calculadora implements OperacaoMatematica {

    // sobrescrita do metoddo da interface
    @Override
    public void divisao(double opera1, double opera2) {
        System.out.println("Divisão: " + opera1 / opera2);
    }

    @Override
    public void multiplicacao(double opera1, double opera2) {
        System.out.println("Multiplicação: " + opera1 * opera2);
    }

    @Override
    public void soma(double opera1, double opera2) {
        System.out.println("Soma: " + opera1 + opera2);
    }

    @Override
    public void subtracao(double opera1, double opera2) {
        System.out.println("Subtração: " + (opera1 - opera2));
    }
}
