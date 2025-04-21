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
        
        Laberint laberint = new Laberint(8, 4, 10);
        System.out.println("Un " + laberint.getDimensio() + " de la taula del 10");
        
        laberint.mostrarLaberint();
        System.out.println();
    }
}