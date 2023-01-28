package javacore.set.classes;

// Dada as informaçções sobre as series favoritas, crie um conjunto e ordene esse conjunto exibindo:
//(Nome - Genero - Tempo do episodio )

import java.util.HashSet;
import java.util.Set;

// Serie 1 : Nome: Got, Genero : Fantasia, TempoEpisodio: 60.
// Serie 2 : Nome: Dark, Genero : Drama, TempoEpisodio: 60.
// Serie 3 : Nome: That's 70 Show, Genero : comédia, TempoEpisodio: 25.
public class ExemploOrdenacaoSet {
    Set<Serie> minhasSeries = new HashSet<>() {
        {
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That's 70 Show", "Comédia", 25));
        }
    }; // Iniciando o Set e setando os valores.

    public void imprimirSet() {
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );

        }
        System.out.println("ordem aleatoria" + minhasSeries);
    }


}


