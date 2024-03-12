package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_HashSet_es1 {
    public static void run() {

        Scanner scanner = new Scanner(System.in);

        //chiedo all'utente di inserire il numero di parole
        System.out.print("inserisci il numero di parole: ");
        //trasformo la stringa in int
        int N = Integer.parseInt(scanner.nextLine());

        //utilizzo l'Hashset per memorizzare, ed in seguito, stampare le parole distinte e quelle duplicate
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleDistinte = new HashSet<>();

        System.out.println("Inserisci le parole: ");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();

            if (!paroleDistinte.add(parola)){
                paroleDuplicate.add(parola);
            }
        }


        System.out.println("Parole duplicate:");
        //se il numero di parole duplicate é = 0
        if(paroleDuplicate.isEmpty()) {
            System.out.println("Nessuna parola duplicata trovata!");
        } else
        //stampo il numero totale di parole distinte
        {
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }
        }


        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        System.out.println("lista delle parole distinte:");
        //se il numero di parole distinte é = 0
        //(caso impossibile, a meno che l'utente inserisca volontariamente il valore di 0)
        if(paroleDistinte.isEmpty()) {
            System.out.println("Nessuna parola distinta trovata!");
        } else {

            for (String parola : paroleDistinte) {
                System.out.println(parola);
            }
        }

        scanner.close();
    }
}