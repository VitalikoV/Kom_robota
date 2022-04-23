package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileParser {
    public static CustomLinkedList readNumbersToProcess(String fileName) {
        CustomLinkedList list = new CustomLinkedList();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            list.addAll(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return list;
    }

    public static void generateCSVFile(CustomLinkedList numbersToProcess, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        StringBuilder line = new StringBuilder();

        CustomNode tCustomNode = numbersToProcess.getHead();
        while (tCustomNode != null){
            line.append(tCustomNode.getData()).append(" ");
            tCustomNode = tCustomNode.getNext();
        }

        bw.write(line.toString());

        bw.flush();
        bw.close();
    }
}
