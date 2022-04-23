package com.company.V8;

import com.company.V8.CustomStackV8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileParser {
    public static CustomStackV8 getCharsFromFile(String fileName) {
        CustomStackV8 stack = new CustomStackV8();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(" ");
                for (String word : attributes) {
                    stack.push(word.charAt(0));
                }
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return stack;
    }


    public static void generateCSVFile(ArrayList<String> data, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        for(String sentence : data){
            bw.write(sentence);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
