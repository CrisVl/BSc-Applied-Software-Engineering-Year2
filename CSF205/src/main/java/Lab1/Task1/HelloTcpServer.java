package Lab1.Task1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class HelloTcpServer {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(50);

        try {

            ServerSocket serverSocket = new ServerSocket(3939);
            System.out.println("Waiting for client connection...");

            Socket clientSocket = serverSocket.accept();

            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            writer.println(n);
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

}

