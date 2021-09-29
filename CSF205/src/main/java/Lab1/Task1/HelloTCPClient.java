package Lab1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class HelloTCPClient {

    public static void main(String[] args) {

        try {
            Socket clientSocket = new Socket("127.0.0.1",3939);
            InputStream in = clientSocket.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String rand = br.readLine();
            System.out.println(rand);
            clientSocket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

