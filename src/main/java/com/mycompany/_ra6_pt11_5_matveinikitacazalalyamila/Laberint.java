package com.mycompany._ra6_pt11_5_matveinikitacazalalyamila;

import java.util.ArrayList;

/**
 *
 * @author Nikita i Yamila
 */
public class Laberint {

    /*Declaració de variables i atributs*/
    private int altura;
    private int amplada;
    private int taulaMultiplicacio;
    ArrayList<Integer> taulaMulti;
    private int[][] laberint;
    private final static int ALTURA_DEFAULT = 5;
    private final static int AMPLADA_DEFAULT = 8;
    private final static int TAULA_MULTIPLICACIO_DEFAULT = 5;

    /**
     * Constructor per defecte que truca al parametritzat
     */
    public Laberint() {
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
        this.laberint = new int[altura][amplada];
        this.taulaMultiplicacio = taulaMultiplicacio;
    }

    public void generarTaulaMult(int num) {

        taulaMulti = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            taulaMulti.add(i + 1);
            System.out.println(i + 1);
        }

    }

    public void generarCami(int fila, int columna) {

        boolean camiGenerat = false;

        if (fila > 0 && columna > 0) {

            while (!camiGenerat) {

                int numAleatoriF = (int) (Math.random() * (fila));
                int numAleatoriC = (int) (Math.random() * (columna));
                int i = 0, j = 0;

            }

        } else if (fila > 0) {

            for (int i = 0; i < fila; i++) {

            }

        } else if (columna > 0) {

        }

    }

    public void omplirLaberint() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < amplada; j++) {
                if (!(i == 0 && j == 0)) {
                    laberint[i][j] = (int) (Math.random() * 101);
                }
            }
        }
    }

    /**
     * Mètode mostrarLaberint per mostrar el laberint amb un format de caselles
     */
    public void mostrarLaberint() {
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
