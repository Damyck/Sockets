/**
 * Created by Marc on 2/10/2016.
 */
import  java.io.*;

public class MainCliente {

    public static void main(String[] args) throws IOException{

        Cliente cliente = new Cliente();

        System.out.println("Client Starting...");
        cliente.startCliente("localhost", 4444);


    }
}
