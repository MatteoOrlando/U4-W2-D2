package es2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Inserisci il numero di elementi seguito dal tasto Invio");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List_functions listManager = new List_functions(n);
        listManager.run();
        scanner.close();
    }
}

