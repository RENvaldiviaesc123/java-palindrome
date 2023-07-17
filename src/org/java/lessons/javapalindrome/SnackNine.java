package org.java.lessons.javapalindrome;
//Snack9
//Calcola la somma e la media dei primi 10 numeri.
public class SnackNine {
    public static void main(String[] args) {
    //Inizializziamo una variabile vuota per la somma
        double somma=0 ;
        double media ;

        //usiamo un ciclo for per calcolare la somma dei primi 10 numeri
            for (int i = 1; i < 11; i++) {
            somma += i;
            }

            //Stampiamo il risultato della somma dei primi 10 numeri
            System.out.println("La somma dei primi dieci numeri è: " + somma);

            //Calcoliamo e stampiamo la media dei nostri primi numeri con la somma che abbiamo già calcolato
            media = somma / 10;
            System.out.println("La media dei nostri primi 10 numeri è: " + media);

    }
}
