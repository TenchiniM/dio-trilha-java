package javacore.collections.list.classes;

import javax.swing.*;
import java.util.*;

public class ExemploList {
    // List notas = new ArrayList(); //antes do java 5 se fazia assim.
    // List<Double> notas = new ArrayList<>(); (Generics JDK 5) (Diamont Operator JDK 7)
    // ArrayList<Double> notas = new ArrayList<>(); outra forma de fazer (não recomendado).
    // List<Double> notas = new ArrayList<>(Arrays.asList(7d,8d,9d,10d)); ja passa o parametro asList e coloca os elementos que você quer.
    //List<Double> notas = Arrays.asList(7d,9d,9d,10d,11d); outra forma porém nao vai poder acrescentar mais elementos nessa lista nem retirar.
    //List<Double> notas = List.of(7d, 9.0, 4d, 5d, 7d, 4.5); torna a Lista imutavel porem pode usar outros metodos na list.

    Scanner leitor = new Scanner(System.in);

    public void criandoList() {
        List<Double> notas = new ArrayList<>(); // metodo DIAMOND OPERATOR
        System.out.println("Crie uma List e adicione as 7 notas");
        for (int i = 0; i < 7; i++) {
            System.out.println("adicione os valores que deseja adicionar: (máximo de 7) ");
            notas.add(leitor.nextDouble());
            System.out.println(notas.toString()); // imprimindo a List

        }
        System.out.println("Exibindo a posição da nota 5.0 " + notas.indexOf(5d)); // imprime a poisção do 5
        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2)); // pega o terceiro elemento introduzido
        System.out.println("Adicionando na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0); // indice 4 e o elemento adicionado 8.0
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);// subtitui determinado elemento pelo elemento 6.0
        System.out.println(notas);
        System.out.println("Conferindo se a nota 1.0 está na lista: " + notas.contains(1d));
        System.out.println("Imprimindo os valores um abaixo do outro: ");
        for (double nota : notas) {
            System.out.println(nota);
        }
        // Uso de collections

        System.out.println("Exibinddo a MENOR nota: " + Collections.min(notas)); // usa uma collections para imprimir o menor termo
        System.out.println("Exibindo a MAIOR nota: " + Collections.max(notas));
        System.out.println("Exibindo a SOMA dos valores: ");
        Iterator<Double> iterator = notas.iterator(); // p/ fazer a soma chama o metodo iterator e vai inteirando dentro dessa lista
        Double soma = 0d;
        while (iterator.hasNext()) { // enquanto tiver um elemento dps vai dar true
            Double next = iterator.next(); // variavel next armazenando o proximo elemento
            soma += next; // soma com a variavel soma
        }
        System.out.println("Exibido a soma dos valores: " + soma);
        System.out.println("Exibindo a media das notas: " + (soma / notas.size())); // média
        System.out.println("Removendo a nota 0 " + notas.remove(0d)); // remove a nota 0
        System.out.println(notas);

        System.out.println("Removendo numeros menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator.hasNext()) { // enquanto tiver elementos ao lado vai verificando
            Double next = iterator1.next(); // armazena os elemetos que estiverem verificados
            if (next < 7) {
                iterator1.remove(); // remove os que sao menor q 7
            }
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista ");
        notas.clear();
        System.out.println("Conferindo lista vazia " + notas.isEmpty()); // verifica se a nota ta vazia




    }
}
