package javacore.heranca.test;

import javacore.heranca.classes.Faxineiro;
import javacore.heranca.classes.Funcionario;
import javacore.heranca.classes.Gerente;
import javacore.heranca.classes.Vendedor;

public class Main {
    public static void main(String[] args) {

//        Funcionario funcionario = new Funcionario();

        // 3 Upcasts
//        Funcionario vendedor = new Vendedor();
//        Funcionario gerente = new Gerente();
//        Funcionario faxieiro = new Faxineiro();
        // 2 Dowcasts
        // Gerente gerente01 = new Funcioario();
        // Vendedor vendedor01 = (Vendedor) new Funcionario();
        // error pois as informações que esta em Funcionario nao esta em vendedor

        Funcionario funcionarios[] = new Funcionario[]{new Faxineiro(), new Vendedor(), new Gerente(), new Funcionario()};


        for (Funcionario funcionario : funcionarios) {
            funcionario.metodo1(); // chamando todos os metodos 1 das classes do array contendo polimorfismo
        }
        System.out.println(" ");

        for (Funcionario funcionario : funcionarios) {
            funcionario.metodo2(); // chamando todos os metodos 2 das classes do array contendo polimorfismo
        }
        System.out.println(" ");



    }
}
