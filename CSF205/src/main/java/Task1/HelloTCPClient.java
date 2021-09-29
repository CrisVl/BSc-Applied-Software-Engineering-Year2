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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

/**
 * This is the TCP Client code that sends a language in which
 * it wants the word "hello" in and waits for the appropriate
 * response. Doesn't do anything else.
 *
 * @author rama_swuni
 */
public class HelloTCPClient {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(50);

        try {
            Socket clientSocket = new Socket("127.0.0.1", 3939);

            System.out.println("Response from server: " + n);

            clientSocket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

