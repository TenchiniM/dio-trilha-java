package javacore.collections.list.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoList {
//    Dadas as seguintes informações sobre gatos, crie uma Lista
//     e ordene esta Lista exibindo:
//     (nome - idade - cor)
//    gato 1 = nome: Jon. idade: 18. cor: preto
//    gato 2 = nome: Simba. idade: 6. cor: tigrado
//    gato 3 = nome: Jon. idade: 12. cor: amarelo


    List<Gato> meusGatos = new ArrayList() {{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 12, "amarelo"));
    }};

    public void imprimirMeusGatos() {
        System.out.println(meusGatos);
        System.out.println("Ordem de inserção: ");
        System.out.println(meusGatos); // ordem normal
        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusGatos); // shuffle para aleatório
        System.out.println(meusGatos);
        System.out.println("Ordem natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem idade: ");
        //Collections.sort(meusGatos,new ComparatorIdade()); usando collection para fazer comparador de idadee
        meusGatos.sort(new ComparatorIdade()); // comparator idade
        System.out.println(meusGatos);
        System.out.println("Ordem cor: ");
        meusGatos.sort(new ComparatorCor()); // comparator idade
        System.out.println(meusGatos);
        System.out.println("Ordem cor/idade/nome ");
        meusGatos.sort(new ComparatorCorNomeIdade()); // comparator idade
        System.out.println(meusGatos);

    }


}
