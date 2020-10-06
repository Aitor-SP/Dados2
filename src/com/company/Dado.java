package com.company;
import java.util.Random;
// Classe Dau: atributs(valor), mètodes(getters, setters, toString i tirar)

public class Dado {

    Random random = new Random();
    private int valor;


    public int tirar(){
        valor = (random.nextInt(6)+1);
        return valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado {valor=" + this.valor + '}';
    }
}