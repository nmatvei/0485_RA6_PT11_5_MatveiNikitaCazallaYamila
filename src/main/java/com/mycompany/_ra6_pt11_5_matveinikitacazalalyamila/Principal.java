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
        
        System.out.println("-- Generació de laberint --");
        Laberint l = new Laberint(4,6,3);
        l.generarTaulaMult();
        l.omplirLaberint();
        l.generarCami();
        l.mostrarLaberint();
        
        System.out.println("-- Inici joc --");
        System.out.println("Et trobes en aquesta posició: ");
        l.posicioJugador();
        
        
        

    }

}
