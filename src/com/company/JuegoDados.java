package com.company;
import java.util.Random;
//Classe JocDaus: atributs(3 daus), mètodes(constructor, jugar)

    class JuegoDados {

    private Dado d1;
    private Dado d2;
    private Dado d3;

    private int ganadas=0;

    public int getGanadas() {
        return ganadas;
    }

    public JuegoDados() {
        d1 = new Dado();
        d2 = new Dado();
        d3 = new Dado();
    }

    void jugada(){

        Random random = new Random();

        d1.setValor(random.nextInt(6)+1);
        d2.setValor(random.nextInt(6)+1);
        d3.setValor(random.nextInt(6)+1);

        System.out.println("Dado 1: "+d1.getValor());
        System.out.println("Dado 2: "+d2.getValor());
        System.out.println("Dado 3: "+d3.getValor());


        if ((d1.getValor() == d2.getValor()) && (d1.getValor() == d3.getValor())){
            System.out.println("¡Ganaste la partida!");
            ganadas++;
        }
        else{
            System.out.println("¡Has perdido!");
        }
    }



}
