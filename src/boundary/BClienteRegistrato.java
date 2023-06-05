package boundary;

import entity.Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BClienteRegistrato {
    private static BClienteRegistrato bC = null;
    private String username;

    static public BClienteRegistrato getInstance(){
        if(bC == null){
            bC = new BClienteRegistrato();
        }
        return  bC;
    }
    public void login(Cliente c){
        String user;
        String pass;

        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("username: ");
            user = bufferRead.readLine();
            System.out.println("password: ");
            pass = bufferRead.readLine();
            if(user.equals(c.getUsername())) {
                setUsername(user);
                System.out.println(" Connesso come " + user );
            }else{
                System.out.println("ERRORE");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
