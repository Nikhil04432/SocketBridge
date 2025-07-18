import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() throws IOException {
        int port = 8020;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);

        while(true){
            System.out.println("Server is Listening on port no :"+ port);
            Socket client = socket.accept();
            System.out.println("Connection accepted from client "+ client.getRemoteSocketAddress());

            PrintWriter toClient = new PrintWriter(client.getOutputStream());
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())) ;

            toClient.println("Hello from Server ");

            toClient.close();
            fromClient.close();
            client.close();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();

        try {
            server.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
