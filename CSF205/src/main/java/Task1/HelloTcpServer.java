package Task1;

/**
 * A Simple Java TCP Client Server Program
 * These are used for illustrating how the client server works for CSF205
 * Certain inputs are hardcoded for ease of use.
 * You can modify them as you wish.
 * This program is purposefully done without threads to
 * illustrate the fact that it can be done so too.
 * If you want you can extend this by creating a thread for the server
 * actions.
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This is the TCP Server code that accepts a language in which
 * the client want the word "hello" in and sends the appropriate
 * response. Doesn't do anything else.
 * @author rama_swuni
 *
 */
public class HelloTcpServer {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(3939);
            System.out.println("Waiting for a client request...");

            Socket clientSocket = serverSocket.accept();

            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

