package com.mycompany._ra6_pt11_5_matveinikitacazalalyamila;

import java.util.HashSet;

/**
 * Classe Laberint per crear un laberint amb un camí que sigui amb valora d'una 
 * taula de multiplicar i la resta del laberint sigui amb valors aleatoris que 
 * siguin del camí
 * 
 * @author Nikita i Yamila
 */
public class Laberint {
    
    /*Declaració de variables i atributs*/
    private int taulaMultiplicacio;
    private String[][] laberint;
    private final static int ALTURA_DEFAULT = 5, AMPLADA_DEFAULT = 8, 
            TAULA_MULTIPLICACIO_DEFAULT = 5;
    
    /**
     * Constructor per defecte que truca al parametritzat
     */
    public Laberint(){
        this(ALTURA_DEFAULT, AMPLADA_DEFAULT, TAULA_MULTIPLICACIO_DEFAULT);
    }
    
    /**
     * Constructor parametritzat per donar la dimensió desitjada al laberint i
     * determinar de quina taula de multiplicar es farà.
     * 
     * @param altura
     * @param amplada
     * @param taulaMultiplicacio 
     */
    public Laberint(int altura, int amplada, int taulaMultiplicacio) {
        this.laberint = new String[altura][amplada];
        this.taulaMultiplicacio = taulaMultiplicacio;
        this.generarCami();
        this.omplirLaberint();
    }
    
    /**
     * Mètode GET per saber la dimensió del laberint
     * @return la dimensió del laberint
     */
    public String getDimensio(){
        return laberint.length + " x " + laberint[0].length;
    }
    
    /**
     * Mètode per saber quina taula de multiplicar en la que es basa el camí
     * @return la taula de multiplicar del camí
     */
    public int getTaulaMultiplicacio() {
        return taulaMultiplicacio;
    }
    
    /**
     * Métode per generar un cami aleatori en el laberint amb els valors de
     * la taula de multiplicar escollida. En el camí es generat pensant que el 
     * moviment només pot ser cap a la dreta o cap avall.
     */
    private void generarCami(){
        /*Declaració de variables*/
        int direccio, multiplicant;
        boolean generacioCami = false;
        int i = 0, j = 0;
        final int AVALL = 0, DRETA = 1;
        
        /*Estructura WHILE per anar generant el camí*/
        while(!generacioCami){
            /*Si és la primera posició, indiquem el inici del camí amb una I*/
            if (i == 0 && j == 0) {
                laberint[i][j] = "I";
            }
            
            /*Comprovem si estem al final (part inferior dreta)*/
            if (i == (laberint.length - 1) && j == (laberint[0].length - 1)){
                this.laberint[i][j] = "F";
                generacioCami = true;
            }
            /*Si no estem ni al inici ni el final, determinem les condicions per
            generar el camí*/
            else{
                
                /*Si estem a la part inferior del laberint, només podem moure a 
                la dreta*/
                if (i == (laberint.length - 1)) {
                    direccio = DRETA;
                } 
                
                /*Si estem a la part dreta, només podem moure avall*/
                else if (j == (laberint[i].length - 1)) {
                    direccio = AVALL;
                }
                
                /*Si estem en qualsevol altra part, es decideix aleatòriament 
                (entre dreta o avall)*/
                else {
                    direccio = (int) (Math.random() * 2);
                }

                /*Estructura SWITCH para determinar en base  a la direcció decidida,
                on possem un nombre pel cami*/
                multiplicant = (int) (Math.floor(Math.random() * 10));
                switch (direccio){
                    case AVALL -> i++;
                    case DRETA -> j++;
                }
                this.laberint[i][j] = Integer.toString(multiplicant * taulaMultiplicacio);
            }
        }
    }
    
    /**
     * Métode per omplir el laberint sense modificar el camí amb valors que no 
     * siguin d'aquest.
     */
    private void omplirLaberint(){
        /*Declaració de variables*/
        HashSet<String> valorsDelCami = new HashSet<>();
        String valor;
        
        /*Estructura FOR per tal de tindre una llista dels nombres de la taula de
        multiplicar que escollim*/
        for (int i = 0; i <= 10; i++) {
            valorsDelCami.add(Integer.toString(i * taulaMultiplicacio));
        }
        
        /*Doble estructura FOR per anar omplint les caselles que no siguin del 
        cami amb valors que no siguin del llistat de valors que s'ha creat 
        anteriorment*/
        for (int i = 0; i < laberint.length; i++) {
            for (int j = 0; j < laberint[i].length; j++) {
                if (laberint[i][j] == null){
                    do{
                        valor = Integer.toString((int)Math.floor((Math.random()*10) * (Math.random())*10));
                    } while(valorsDelCami.contains(valor));
                    laberint[i][j] = valor;
                }
            }
        }
    }
    
    /**
     * Mètode per mostrar el laberint amb un format de caselles
     */
    public void mostrarLaberint(){
        for (int i = 0; i < laberint.length; i++) {
            System.out.print("|");
            for (int j = 0; j < laberint[i].length; j++) {
                /*Utilitzem printf per donar el format que volguem*/
                System.out.printf(" %3s |", laberint[i][j]);
            }
            System.out.print("\n");
        }
    }
}
