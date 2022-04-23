package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileParser {
    public static int[] readNumbersToProcess(String fileName) {
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

    public static int readNumberToChange(String fileName) {

        int numberToChange = 0;
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            br.readLine();
            numberToChange = Integer.parseInt(br.readLine().split(" ")[0]);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return numberToChange;
    }

    public static int readChangeVal(String fileName) {

        int numberToChange = 0;
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            br.readLine();
            numberToChange = Integer.parseInt(br.readLine().split(" ")[1]);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return numberToChange;
    }


        public static void generateCSVFile(int[] numbersToProcess, int numberToChange, int changeVal, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        StringBuilder line = new StringBuilder();

        for(int number : numbersToProcess){
            line.append(number).append(" ");
        }

        bw.write(line.toString());
        bw.newLine();

        String lineWithSize = numberToChange + " " + changeVal;
        bw.write(lineWithSize);

        bw.flush();
        bw.close();
    }
}
