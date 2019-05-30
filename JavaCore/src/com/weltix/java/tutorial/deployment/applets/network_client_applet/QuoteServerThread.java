/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.deployment.applets.network_client_applet;

/**
 * Java(TM) SE 6 version.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

class QuoteServerThread extends Thread {
    private DatagramSocket socket = null;
    BufferedReader qfs = null;
    private boolean moreQuotes = true;
    private int bufLength = 256;

    QuoteServerThread() {
        super("QuoteServer");
        try {
            socket = new DatagramSocket();
            System.out.println("QuoteServer listening on port: " + socket.getLocalPort());
        } catch (java.io.IOException e) {
            System.err.println("Could not create datagram socket.");
        }
        this.openInputFile();
    }

    public void run() {
        if (socket == null)
            return;

        while (moreQuotes) {
            try {
                byte[] buf = new byte[bufLength];
                DatagramPacket packet;
                InetAddress address;
                int port;
                String dString = null;

                // receive request
                packet = new DatagramPacket(buf, bufLength);
                socket.receive(packet);
                address = packet.getAddress();
                port = packet.getPort();

                // send response
                if (qfs == null)
                    dString = new Date().toString();
                else
                    dString = getNextQuote();
                buf = dString.getBytes();
                packet = new DatagramPacket(buf, buf.length, address, port);
                socket.send(packet);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
                moreQuotes = false;
                e.printStackTrace();
            }
        }
        socket.close();
    }

    private void openInputFile() {
        try {
            qfs = new BufferedReader(new FileReader("one-liners.txt"));
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Could not open quote file. Serving time instead.");
        }
    }
    private String getNextQuote() {
        String returnValue = null;
        try {
            if ((returnValue = qfs.readLine()) == null) {
                qfs.close();
                moreQuotes = false;
                returnValue = "No more quotes. Goodbye.";

            }
        } catch (IOException e) {
            returnValue = "IOException occurred in server.";
        }
        return returnValue;
    }

}