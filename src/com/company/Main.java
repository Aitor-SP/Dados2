package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //menu
        int option;
        do {
            System.out.println("1. Dados");
            System.out.println("2. Parchis");
            System.out.println("3. Tic Tac Toe");
            System.out.println("4. Exit");
            System.out.print("Inserte la opción deseada: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    JuegoDados.jugada();
                    break;
                case 2:
                    System.out.println("Parchis está en mantenimiento.");
                    break;
                case 3:
                    System.out.println("Tic Tac Toe está en mantenimiento.");
                    break;
                case 4:
                    // Tiene que aparecer las partidas jugadas y ganadas/perdidas
                    System.exit(0);
                default:
                    System.out.println("Elija una opción correcta.");
            }
        }while (option != 4);
    }
}
