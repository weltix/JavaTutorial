package com.weltix.java.tutorial.packages.mygame.server;

import java.io.*;
import java.net.*;

import com.weltix.java.tutorial.packages.mygame.client.Client;
import com.weltix.java.tutorial.packages.mygame.shared.Utilities;

/**
 * Created by ASUS on 26.07.14.
 */
public class Server {

    public static void main(String args[]) {
        ServerSocket serverSocket = null;

        Utilities.printMsg("creating server socket");

        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Unable to create server socket, " + e);
            System.exit(1);
        }

        Utilities.printMsg("accepting client connections");

        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                new Client(clientSocket).start();
            } catch (IOException e) {
                System.err.println("Unable to accept socket connection, " + e);
                System.exit(1);
            }
        }
    }
}