package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Inserisci nome prodotto");
        String nome = inputScanner.nextLine();

        System.out.println("Inserisci la descrizione");
        String descrizione = inputScanner.nextLine();

        System.out.println("Inserisci il prezzo");
        float prezzo = inputScanner.nextFloat();

        System.out.println("Inserisci l'iva");
        int iva = inputScanner.nextInt();

        Prodotto prodotto = new Prodotto(nome, descrizione, prezzo, iva);
        //System.out.println(prodotto.codice + " " + prodotto.nome + " " + prodotto.descrizione + " " + prodotto.prezzo + " " + prodotto.iva);

        prodotto.StampaPrezzoBase();
        prodotto.StampaPrezzoConIva();
        prodotto.StampaNomeECodice();
    }
}
