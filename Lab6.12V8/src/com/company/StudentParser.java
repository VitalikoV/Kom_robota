package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class StudentParser {
    public static ArrayList<Student> readCSVFile(String fileName){
        ArrayList<Student> students = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Student stud = createStudent(attributes);
                students.add(stud);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("The file was not found.");
            ioe.printStackTrace();
        }

        return students;
    }

    public static Student createStudent(String[] metadata){
        String lastName = metadata[0];
        Integer examMark1 = Integer.parseInt(metadata[1]);
        Integer examMark2 = Integer.parseInt(metadata[2]);
        Integer examMark3 = Integer.parseInt(metadata[3]);
        return new Student(lastName, examMark1, examMark2, examMark3);

    }

    public static void generateCSVFile(ArrayList<Student> students, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".csv"), "UTF-8"));

        for(Student stud : students){
            StringBuffer data = new StringBuffer();
            data.append(stud.getLastName()).append(",").append(stud.getEkzamMark1()).append(",").append(stud.getEkzamMark2()).append(",").append(stud.getEkzamMark3());
            bw.write(data.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
