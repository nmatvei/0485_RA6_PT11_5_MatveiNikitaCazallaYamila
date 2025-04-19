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
        
        System.out.println("DEMOSTRACIÓ DE LA CLASSE LABERINT");
        /*while(!demanarDades){
            try{
                
            } catch (Exception e) {System.err.println(e.getMessage());}
        }*/
        
        laberint = new Laberint();
        System.out.println(laberint.getDimensio());
    }
}
