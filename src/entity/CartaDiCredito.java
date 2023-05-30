package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class CartaDiCredito {
    public final static String NUM_CARTA = "numeroCarta";
    public final static String NOME_INTESTATARIO = "nomeIntestatario";
    public final static String COGNOME_INTESTATARIO = "cognomeIntestatario";
    public final static String DATA_SCADENZA = "dataScadenza";
    private String numeroCarta;
    private String nomeIntestatario;
    private String cognomeIntestatario;
    private Date dataScadenza;

    public CartaDiCredito(String numeroCarta, String nomeIntestatario, String cognomeIntestatario, String dataScadenza){
        this.numeroCarta = numeroCarta;
        this.nomeIntestatario = nomeIntestatario;
        this.cognomeIntestatario = cognomeIntestatario;
        this.dataScadenza = new Date(dataScadenza);
    }

    public CartaDiCredito(HashMap<String,String> datiCarta){
        this.numeroCarta = datiCarta.get(NUM_CARTA);
        this.nomeIntestatario = datiCarta.get(NOME_INTESTATARIO);
        this.cognomeIntestatario = datiCarta.get(COGNOME_INTESTATARIO);
        this.dataScadenza = new Date(datiCarta.get(DATA_SCADENZA));
    }

    @Override
    public String toString() {
        String print = "Numero: "+numeroCarta+
                "\nNome Intestatario: "+nomeIntestatario+
                "\nCognome Intestatario: "+cognomeIntestatario+
                "\nData Scadenza: "+dataScadenza;
        return print;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getNomeIntestatario() {
        return nomeIntestatario;
    }

    public void setNomeIntestatario(String nomeIntestatario) {
        this.nomeIntestatario = nomeIntestatario;
    }

    public String getCognomeIntestatario() {
        return cognomeIntestatario;
    }

    public void setCognomeIntestatario(String cognomeIntestatario) {
        this.cognomeIntestatario = cognomeIntestatario;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
}
