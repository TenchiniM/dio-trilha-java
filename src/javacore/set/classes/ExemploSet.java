package javacore.set.classes;

import java.util.*;

public class ExemploSet {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

    // Set notas = new HashSet(); metodo simples de iniciar um set

    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // outra maneira de iniciar o Set

    public void criando() {
        System.out.println("Crie um conjunto e adicione as notas: ");
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5 ");
        System.out.println("Impossivel, metodo set é em ordem aleatória");
        System.out.println("Adicione na Lista a nota 8.0 na posição 4");
        System.out.println("Impossivel no Set");
        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        System.out.println("impossivel no Set");
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("Impossivel no Set");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas" + (soma / notas.size()));
        System.out.println("Remova a nota 0: " + notas.remove(0d));
        System.out.println("Remova a nota na posição 0: ");
        System.out.println("Impossivel");
        System.out.println("Remova as notas menores que 7 e exiba a Lista: ");

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println(notas);
        System.out.println("Exiba todas nas notas na ordem que foram informados: ");

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("Exiba todas as notas na ordem crescente: ");

        Set<Double> notas3 = new TreeSet<>(notas2); // utilizando o TreeSet para ordem crescente
        System.out.println(notas3);
        System.out.println("Apague todo o conjunto: ");
        notas2.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());



    }
}
