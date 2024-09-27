package com.mycompany.mario;

import java.util.Scanner;


public class Mario {

    public static void main(String[] args) {
         char tecla;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de tu heroe: "+"\n");
        String nombre = input.nextLine();
       
        Heroe personaje = new Heroe(nombre);
       
        System.out.println("Hola me llamo " + personaje.getNombre() +" Vamos a la acción\n");
       
        System.out.println("Usa 1 para moverte y 2 para saltar\n");
       
        do {
           
            if( personaje.getPosicion() % 10 == 0){
                System.out.println("Hay un enemigo");
                tecla = input.next().charAt(0);
                switch (Character.toString(tecla)) {
                    case "1":
                        personaje.setPosicion();
                        personaje.setVidas();
                        System.out.println("Que mal");
                        System.out.println(personaje.getNombre() + " te quedan "+ personaje.getVidas()+" vidas");
                        break;
                    case "2":
                        personaje.setSaltando();
                        System.out.println("Venciste al enemigo.");
                        break;
                    default:
                        throw new AssertionError();
                }
               
               
               
            }
           
           
        } while (personaje.getVidas()>0);
       
        System.out.println("\nGame Over");
       
    }
}