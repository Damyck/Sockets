/**
 * Created by Marc on 2/10/2016.
 */
import  java.io.*;

public class MainServer {

    public static void main(String[] args) throws IOException{

        Server server = new Server();

        System.out.println("Server Starting...");
        server.startServer(4444);


    }
}
