package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileParser {
    public static int[] readCSVFile(String fileName) {
        int[] numbers = new int[0];
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return numbers;
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
