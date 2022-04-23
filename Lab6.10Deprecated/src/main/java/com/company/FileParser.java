package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FileParser {
    public static ArrayList<File> readFiles(String fileName) {
        ArrayList<File> files = new ArrayList<File>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                File file = createFile(attributes);
                files.add(file);
                line = br.readLine();
            }
        } catch (IOException | ParseException ioe) {
            ioe.printStackTrace();
        }

        return files;
    }

    public static File createFile(String[] metadata) throws ParseException {
        String name = metadata[0];
        Date createdDate = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[1]);
        return new File(name, createdDate);
    }

    public static void generateCSVFile(int[] numbersToProcess, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        StringBuilder line = new StringBuilder();

        for (int number : numbersToProcess) {
            line.append(number).append(" ");
        }

        bw.write(line.toString());
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
