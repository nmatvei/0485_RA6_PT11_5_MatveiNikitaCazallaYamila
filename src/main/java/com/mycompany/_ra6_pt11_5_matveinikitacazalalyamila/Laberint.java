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
     * Constructor parametritzat per donar la dimensió desitjada al laberint i
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
    
    /**
     * Mètode GET per saber la dimensió del laberint
     * @return 
     */
    public String getDimensio(){
        return amplada + " x " + altura;
    }
    
    private void generarCami(){
        
    }
    
    private void omplirLaberint(){
        
    }
    
    /**
     * Mètode per mostrar el laberint amb un format de caselles
     */
    public void mostrarLaberint(){
        for (int i = 0; i < laberint.length; i++) {
            System.out.print("|");
            for (int j = 0; j < laberint.length; j++) {
                System.out.print(laberint[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }
}
