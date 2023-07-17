package org.java.lessons.javapalindrome;

import java.util.Arrays;
import java.util.Scanner;

//Snack8
//Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.
public class SnackEight {
    public static void main(String[] args) {
        //Inizializzamo il nostro scanner
        Scanner scanNumber = new Scanner(System.in);

        //Inizializzamo una variabile per la somma dei numeri
        int somma = 0;

        //Chidiamo all'utente un numero di 4 cifre
        System.out.println("Inserisci un numero di 4 cifre:");
        String userNumber = scanNumber.nextLine();

        //Convertiamo il nostro numero in un array
        String[] numbers = userNumber.split("");
        System.out.println(Arrays.toString(numbers));

        //Usiamo un ciclo for
        for (int i = 0; i < userNumber.length(); i++) {
            somma = somma + Integer.parseInt(numbers[i]);
        }
        System.out.println(somma);
    }
}
