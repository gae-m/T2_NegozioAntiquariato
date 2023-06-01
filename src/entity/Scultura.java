package entity;

public class Scultura extends Prodotto {

    private float peso;
    private float alezza;
    public Scultura(long codice, String nome, String descrizione, float peso, float altezza) {
        super(codice, nome, descrizione);
        this.peso = peso;
        this.alezza = altezza;
    }

    @Override
    public String toString() {
        return "Scultura{" +"codice=" + super.getCodice() +
                ", nome='" + super.getNome() + '\'' +
                ", descrizione='" + super.getDescrizione() + '\'' +", "+
                "peso=" + peso + " KG" +
                ", alezza=" + alezza + " cm " +
                '}';
    }

    public float getPeso() {
        return peso;
    }

    public float getAlezza() {
        return alezza;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAlezza(float alezza) {
        this.alezza = alezza;
    }
}
