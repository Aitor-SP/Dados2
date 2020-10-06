package com.company;
import java.util.Random;

//Classe JocDaus: atributs(3 daus), mètodes(constructor, jugar)
public class JuegoDados {

    // Declaramos los dados
    private Dado d1;
    private Dado d2;
    private Dado d3;

    // Creamos el contador de partidas ganadas
    private int ganadas = 0;

    public JuegoDados() {

        // Creamos los dados
        d1 = new Dado();
        d2 = new Dado();
        d3 = new Dado();
    }

    public void jugada() {

        Random random = new Random();

        // Las tiradas son randoms
        d1.setValor(random.nextInt(6)+1);
        d2.setValor(random.nextInt(6)+1);
        d3.setValor(random.nextInt(6)+1);

        System.out.println("Dado 1: "+d1.getValor());
        System.out.println("Dado 2: "+d2.getValor());
        System.out.println("Dado 3: "+d3.getValor());

    }


}
