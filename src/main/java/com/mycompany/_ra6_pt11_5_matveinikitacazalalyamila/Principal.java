package com.mycompany._ra6_pt11_5_matveinikitacazalalyamila;

import java.util.Scanner;

/**
 * Script on es prova la clàsse Laberint, que ens retorna un petit laberint
 * matemàtic de la taula que escollim.
 *
 * @author Nikita i Yamila
 */
public class Principal {

    public static void main(String[] args) {
        /*Declaració de variables*/
        Scanner sc = new Scanner(System.in);
        Laberint laberint;
        boolean demanarDades = false;
        int taulaMult, files, columnes;

        System.out.println("DEMOSTRACIÓ DE LA CLASSE LABERINT");

        System.out.print("Taula de multiplicar (per defecte 5): ");
        taulaMult = sc.nextInt();
        
        /*
        boolean dimensionsCorrectes = false;

        do {

            int suma;

            System.out.print("Dimensions de la matriu (per defecte 8x5):"
                    + "\n\t- Files: ");
            files = sc.nextInt();
            System.out.print("\n\t- Columnes: ");
            columnes = sc.nextInt();

            suma = files + columnes;

            if ((files == 12) || (columnes == 12)) {

                if (suma == 12) {
                    dimensionsCorrectes = true;
                } else {
                    System.out.println("Dimensions incorrectes.");
                }

            } else {

                if (suma == 13) {
                    dimensionsCorrectes = true;
                } else {
                    System.out.println("Dimensions incorrectes.");
                }

            }
        } while (!dimensionsCorrectes);
        */
        System.out.println("5");
        laberint = new Laberint();
        System.out.println("gyh");
        laberint.generarTaulaMult(taulaMult);
        System.out.println("rtf");
        laberint.omplirLaberint();
        laberint.mostrarLaberint();
        

    }

}
