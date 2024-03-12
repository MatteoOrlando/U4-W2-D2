package es2;

import java.util.*;

public class List_functions {
    private List<Integer> randomIntegers;

    public List_functions(int n) {
        randomIntegers = List_arrayList_es2.getRandomList(n);
    }

    public void run() {
        System.out.println("Funzione 1: lista ordinata ordine crescente di numeri casuali.");
        List_arrayList_es2.printList(randomIntegers);
        System.out.println("Funzione 2: lista che mostra i numeri casuali precedentemente stampati e li ristampa nuovamente ma in ordine inverso");
        List<Integer> mirrored = List_arrayList_es2.mirrorList(randomIntegers);
        List_arrayList_es2.printList(mirrored);
        System.out.println("Funzione 3: in base al valore booleano; la console stamperá i numeri in posizione (i) pari se TRUE, altrimenti dispari se FALSE");
        List_arrayList_es2.printOddEven(mirrored, false);
        List_arrayList_es2.printOddEven(mirrored, true);
    }
}

