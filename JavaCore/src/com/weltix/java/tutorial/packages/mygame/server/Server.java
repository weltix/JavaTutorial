/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.packages.mygame.server;

import com.weltix.java.tutorial.packages.mygame.client.Client;
import com.weltix.java.tutorial.packages.mygame.shared.Utilities;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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