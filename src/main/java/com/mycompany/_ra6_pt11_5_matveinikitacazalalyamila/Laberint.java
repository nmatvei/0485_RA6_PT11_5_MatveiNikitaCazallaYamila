package com.mycompany._ra6_pt11_5_matveinikitacazalalyamila;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nikita i Yamila
 */
public class Laberint {

    /*Declaració de variables i atributs*/
    private int altura;
    private int amplada;
    private int numeroMulti;
    private String[][] posicioJugador;
    ArrayList<Integer> taulaMulti;
    private String[][] laberint;
    ArrayList<Integer> cami;
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
     * @param numeroMulti
     */
    public Laberint(int altura, int amplada, int numeroMulti) {
        this.altura = altura;
        this.amplada = amplada;
        this.laberint = new String[altura][amplada];
        this.numeroMulti = numeroMulti;
    }

    public void generarTaulaMult() {

        taulaMulti = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            taulaMulti.add(i + 1);
        }

    }

    public void generarCami() {

        cami = new ArrayList<>();

        final int AVALL = 0, DRETA = 1, FI = 2;
        int i = 0, j = 0;
        int direccioAleatoria;
        boolean camiGenerat = false;

        while (!camiGenerat) {

            if (i == 0 && j == 0) {
                laberint[i][j] = "I";
            }

            if (i == (laberint.length - 1) && j == (laberint[i].length - 1)) {
                direccioAleatoria = FI;
            } else if (i == (laberint.length - 1)) {
                direccioAleatoria = DRETA;
            } else if (j == (laberint[i].length - 1)) {
                direccioAleatoria = AVALL;
            } else {
                // Número aleatori que només dona 0 i/o 1
                direccioAleatoria = (int) (Math.random() * 2);
            }

            int numMult;
            switch (direccioAleatoria) {
                case AVALL:
                    i++;
                    numMult = (int) (Math.random() * 10);
                    laberint[i][j] = Integer.toString(taulaMulti.get(numMult) * numeroMulti);
                    cami.add(direccioAleatoria);
                    break;
                case DRETA:
                    j++;
                    numMult = (int) (Math.random() * 10);
                    laberint[i][j] = Integer.toString(taulaMulti.get(numMult) * numeroMulti);
                    cami.add(direccioAleatoria);
                    break;
                case FI:
                    laberint[i][j] = "F";
                    camiGenerat = true;
                    break;
            }
            System.out.println(cami);
        }
    }

    public void omplirLaberint() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < amplada; j++) {
                if (!(i == 0 && j == 0)) {
                    laberint[i][j] = Integer.toString((int) (Math.random() * 101));
                }
            }
        }
    }

    public void posicioJugador() {

        int iPosicioJ = 0, jPosicioJ = 0;
        String respostaM;
        int incrementadorCami = 0;

        while (!(iPosicioJ == (laberint.length - 1) &&
                jPosicioJ == (laberint[iPosicioJ].length - 1))) {
            
            Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < laberint.length; i++) {
                System.out.print("|");
                for (int j = 0; j < laberint[i].length; j++) {
                    if (i == iPosicioJ && j == jPosicioJ) {
                        System.out.print("X");
                        System.out.print("|");
                    } else {
                        System.out.print(laberint[i][j]);
                        System.out.print("|");
                    }
                }
                System.out.print("\n");
            }
            
            System.out.print("On vols anar:"
                    + "\n\t- Dreta (D)"
                    + "\n\t- Avall (A)"
                    + "\nResposta: ");
            respostaM = sc.nextLine();
            
            if (respostaM.equalsIgnoreCase("D")) {
                
                if (comprovarCami(incrementadorCami, 1)) {
                    jPosicioJ++;
                } else {
                    System.out.println("La direcció és incorrecte, torna a intentar-ho.");
                }
                
            } else if (respostaM.equalsIgnoreCase("A")) {
                
                if (comprovarCami(incrementadorCami, 0)) {
                    iPosicioJ++;
                } else {
                    System.out.println("La direcció és incorrecte, torna a intentar-ho.");
                }
                
            } else {
                System.out.println("Resposta incorrecte.");
            }
            incrementadorCami++;
        }

    }
    
    private boolean comprovarCami(int posCami, int direccio) {
        
        boolean camiCorrecte = false;
        
        int camiD = cami.get(posCami);
        
        if (camiD == direccio) {
            camiCorrecte = true;
        }
        
        return camiCorrecte;
    }

    /**
     * Mètode mostrarLaberint per mostrar el laberint amb un format de caselles
     */
    public void mostrarLaberint() {
        for (int i = 0; i < laberint.length; i++) {
            System.out.print("|");
            for (int j = 0; j < laberint[i].length; j++) {
                System.out.print(laberint[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }
}
