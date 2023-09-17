//Applicazione che legge un file di testo e conta parole, spazi e caratteri

import java.io.*;

public class FileAnalyzer {
    public static void main(String[] args) throws Exception {
        int wordcounter = 0;
        int spacecounter = 0;
        int charactercounter = 0;
        String riga;
        BufferedReader br = new BufferedReader(new FileReader("filetoread.txt"));
        while ((riga = br.readLine()) != null) {
            wordcounter += riga.split(" ").length;
            spacecounter += riga.length() - riga.replace(" ", "").length();
            charactercounter += riga.length();
        }
        br.close();
        System.out.println("Number of words: " + wordcounter);
        System.out.println("Number of spaces: " + spacecounter);
        System.out.println("Number of characters: " + charactercounter);
    }
}