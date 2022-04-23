package com.company;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileParser {
    public static String getFormulaFromFile(String fileName) {
        String line = "";
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            line = br.readLine();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return line;
    }


    public static void generateCSVFile(String data, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        bw.write(data);

        bw.flush();
        bw.close();
    }
}
