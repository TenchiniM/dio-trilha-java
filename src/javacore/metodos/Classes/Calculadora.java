package javacore.metodos.Classes;

import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);
    // Como declarar um metodo:
    // <?visibilidade> <?tipo> <?modificador> retorno nome (<?parametros>) <?exceções>
    // {
    // corpo
    // }

    float num1, num2, resultado;
    String operac;

    public void saberQualOperacao() {
        System.out.println("Qual operacao você deseja realizar ? (Somar, Dividir, Multiplicar, Subtrair)");
        operac = scanner.next();
        if (operac.equals("somar")) {
            somarNumero();
        }
        if (operac.equals("dividir")) {
            subtrairNumero();
        }
        if (operac.equals("multiplicar")) {
            multiplicarNumero();
        }
        if (operac.equals("subtrair")) {
            subtrairNumero();
        }
    }


    public float somarNumero() {
        System.out.println("Digite os numeros que você deseja somar");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        resultado = num1 + num2;
        System.out.println(resultado);
        return resultado;
    }

    public float multiplicarNumero() {
        System.out.println("Insira os dois numeros que você deseja multiplicar:");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        resultado = num1 * num2;
        System.out.println(resultado);
        return resultado;
    }

    public float dividirNumero() {
        System.out.println("Insira os dois numeros que você deseja Dividir:");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        resultado = num1 / num2;
        System.out.println(resultado);
        return resultado;

    }

    public float subtrairNumero() {
        System.out.println("Insira os dois numeros que você deseja Subtrair:");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        resultado = num1 - num2;
        System.out.println(resultado);
        return resultado;
    }

}
