package org.java.lessons.javapalindrome;

import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args) {
        //Inizializzamo il nostro scanner
        Scanner scanWord = new Scanner(System.in);

        //Variabile per inizializzare il riverso della parola

        String rev="";

        //Chiediamo qui all'utente di inserire la sua parola palindroma
        System.out.println("Inserisci la tua parola palindroma:");
        String wordUser = scanWord.nextLine();

        //Verifichiamo se la parola dell'utente è o non è palindroma
            //trasformiamo la parola in un array di char



            //Inizializzamo una variabile booleana

            boolean isPal = false;

            //usiamo un ciclo for per ragionare sulla parola inserita

            for (int i = wordUser.length() - 1; i>= 0; i--) {

                rev = rev + wordUser.charAt(i);
            }

            if (wordUser.equals(rev)){
                isPal=true;
                System.out.println("La parola si è palindroma");
            } else {
                System.out.println("La parola non è palindroma");
            }






    }
}
