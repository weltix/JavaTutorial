package com.weltix.java.tutorial.basicio.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ASUS on 25.08.14.
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("files/iostreams_xanadu.txt");
            outputStream = new FileWriter("files/iostreams_characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}