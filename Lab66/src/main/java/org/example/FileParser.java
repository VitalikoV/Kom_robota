package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileParser {
    public static CustomQueue readCSVFile(String fileName) {
        CustomQueue queue = new CustomQueue();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            for(String val : br.readLine().split(" ")){
                queue.push(Integer.parseInt(val));
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return queue;
    }

    public static void generateCSVFile(int[] numbersToProcess, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        StringBuilder line = new StringBuilder();

        for(int number : numbersToProcess){
            line.append(number).append(" ");
        }

        bw.write(line.toString());

        bw.flush();
        bw.close();
    }
}
