package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        JuegoDados juegoDados = new JuegoDados();
        int partidas = 0;

        //menu
        int option;
        int option2;
        do {
            System.out.println("1. Dados");
            System.out.println("2. Parchis");
            System.out.println("3. Tic Tac Toe");
            System.out.println("4. Salir");
            System.out.print("Inserte la opción deseada: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    do {
                        System.out.println("1. Lanzar dados");
                        System.out.println("2. Salir");
                        System.out.print("Inserte la opción deseada: ");
                        option2 = input.nextInt();
                        switch (option2) {
                            case 1:
                                juegoDados.jugada();
                                partidas++;
                                break;
                            case 2:
                                // Tiene que aparecer las partidas jugadas y ganadas/perdidas
                                System.out.println("Has jugado "+partidas+" partidas.");
                                System.out.println("Has ganado "+juegoDados.getGanadas()+" partidas.");
                                break;
                            default:
                                System.out.println("Elija una opción correcta.");
                        }
                    }while(option2 != 2);
                    break;
                case 2:
                    System.out.println("Parchis está en mantenimiento.");
                    break;
                case 3:
                    System.out.println("Tic Tac Toe está en mantenimiento.");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Elija una opción correcta.");
            }
        }while (option != 4);
    }
}
