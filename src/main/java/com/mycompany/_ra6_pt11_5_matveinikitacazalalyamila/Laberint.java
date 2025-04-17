package com.mycompany._ra6_pt11_5_matveinikitacazalalyamila;

/**
 *
 * @author Nikita i Yamila
 */
public class Laberint {
    
    /*Declaració de variables i atributs*/
    private int altura;
    private int amplada;
    private int taulaMultiplicacio;
    private int[][] laberint;
    private final static int ALTURA_DEFAULT = 5;
    private final static int AMPLADA_DEFAULT = 8;
    private final static int TAULA_MULTIPLICACIO_DEFAULT = 5;
    
    /**
     * Constructor per defecte que truca al parametritzat
     */
    public Laberint(){
        this(ALTURA_DEFAULT, AMPLADA_DEFAULT, TAULA_MULTIPLICACIO_DEFAULT);
    }
    
    /**
     * Constructor parametritzat per donar la dimennsió desitjada al laberint i
     * determinar de quina taula de multiplicar es farà.
     * 
     * @param altura
     * @param amplada
     * @param taulaMultiplicacio 
     */
    public Laberint(int altura, int amplada, int taulaMultiplicacio) {
        this.altura = altura;
        this.amplada = amplada;
        this.laberint = new int[amplada][altura];
        this.taulaMultiplicacio = taulaMultiplicacio;
    }
    
    private void generarCami(){
        
    }
    
    private void omplirLaberint(){
        
    }
}
