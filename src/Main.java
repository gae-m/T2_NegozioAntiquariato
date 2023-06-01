import entity.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> carta = new HashMap<>();
        carta.put(CartaDiCredito.NOME_INTESTATARIO,"Biagio");
        carta.put(CartaDiCredito.NUM_CARTA,"0000000000000001");
        carta.put(CartaDiCredito.COGNOME_INTESTATARIO,"Salzillo");
        carta.put(CartaDiCredito.DATA_SCADENZA,"05/31/2024");

        Cliente c = new Cliente("bise","password1","3335624180",carta);
        Proposta p = new Proposta(0001, 20);
        Scultura s = new Scultura(001,"David","molto bella", 100, 20);
        System.out.println(s);
    }
}