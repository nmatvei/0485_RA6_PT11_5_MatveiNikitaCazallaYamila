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
        System.out.println("DEMOSTRACIÓ DE LA CLASSE LABERINT");
        System.out.println("La classe Laberint ens permet crear laberints matemàtics"
                + " on el camí que hem d'endivinar és composat per valors d'una taula de "
                + "multiplicar.");

        System.out.println("\nSi creem un laberint sense passar cap paràmetre al "
                + "constrcutor...");
        Laberint laberintPerDefecte = new Laberint();
        System.out.print("Crearem un laberint de " + laberintPerDefecte.getDimensio()
                + " de la taula del " + laberintPerDefecte.getTaulaMultiplicacio() + "!");
        System.out.println("\n");
        laberintPerDefecte.mostrarLaberint();
        System.out.println("\nPerò, també podem escollir la dimensió i l'amplada "
                + "de la taula.");
        
        /*Declaració de variables per fer el laberint parametritzat*/
        boolean demanarDades = false;
        Scanner sc = new Scanner(System.in);
        Laberint laberintParametritzat;
        int altura = 0, amplada = 0, taulaMultiplicar = 0;
        
        /*Estructura WHILE per anar demanar les dades si es que les que s'introdueixen 
        són erroneas*/
        while (!demanarDades) {
            /*Estructura TRY-CATCH per captar qualsevol excepció que es pugi produïr*/
            try {
                System.out.print("\nIntrodueix el valor de l'altura de la taula: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    throw new Exception("ERROR: S'ha introduït una altura menor o igual a 0");
                }
                System.out.print("Introdueix el valor de l'amplada de la taula: ");
                amplada = sc.nextInt();
                if (amplada <= 0) {
                    throw new Exception("ERROR: S'ha introduït una amplada menor o igual a 0");
                }

                System.out.print("Introdueix el valor de la taula de multiplicar del camí: ");
                taulaMultiplicar = sc.nextInt();
                if (taulaMultiplicar <= 0 || taulaMultiplicar > 10) {
                    throw new Exception("ERROR: S'ha introduït una taula de multiplicar "
                            + "menor o igual a 0 o superior a 10");
                }
                demanarDades = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                sc.nextLine();
            }
        }
        
        /*Intànciem l'objecte laberintParametritzat i mostrem les seves dades i contingut*/
        laberintParametritzat = new Laberint(altura, amplada, taulaMultiplicar);
        System.out.println("\nSegons les dades que has introduït el teu laberint"
                + " és un " + laberintParametritzat.getDimensio() + " de la taula"
                + " del " + laberintParametritzat.getTaulaMultiplicacio());
        System.out.println("");
        laberintParametritzat.mostrarLaberint();
    }
}