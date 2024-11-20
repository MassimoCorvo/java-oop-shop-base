package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;

    public Prodotto(String nome, String descrizione, float prezzo, int iva ){

        Random r = new Random();
        this.codice = r.nextInt(101);

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public void StampaPrezzoBase (){
        
        System.out.println("Il prezzo base è: " + this.prezzo + "E");

    }

    public void StampaPrezzoConIva(){

        float ivaDecimali = (float) this.iva / 100;
        float prezzoConIva = this.prezzo + this.prezzo * ivaDecimali;

        System.out.println("Il prezzo con iva è: " + prezzoConIva + "E");

    }

    public void StampaNomeECodice(){

        System.out.println( this.nome + "-" + this.codice );

    }
}
