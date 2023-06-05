package control;

public class GestioneNegozio {

    private static GestioneNegozio gN = null;

    public GestioneNegozio() {
    }

    public static GestioneNegozio getInstance(){
        if(gN == null){
            gN = new GestioneNegozio();
        }

        return gN;
    }

    public void inserisciProposta(String username){

    }
}
