package javacore.collections.list.classes;

import java.util.Comparator;

public class ComparatorCorNomeIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome()); // se o nome for diferente, ordenar por nome
        if (nome != 0) {
            return nome;
        }
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor()); // se a cor for diferente, ordenar por cor
        if (cor !=0){
            return cor;
        }
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
