import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentParser {
    public static ArrayList<Student> createUsersFromCSVFile(String fileName){
        ArrayList<Student> students = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String headLine = br.readLine();

            String[] headLineValuesArray = headLine.split(",");
            ArrayList<String> headLineValues = new ArrayList<>();

            Collections.addAll(headLineValues, headLineValuesArray);
            //removes the number
            headLineValues.remove(0);
            //removes the firstname
            headLineValues.remove(0);
            //removes the lastname
            headLineValues.remove(0);
            //removes course
            headLineValues.remove(0);

            ArrayList<Subject> subjects = new ArrayList<>();
            for (String val : headLineValues){
                Subject subject = new Subject(val, 5);
                subjects.add(subject);
            }
            //Student stud = new Student();
            Map<Subject, Mark> subjectToMark = new HashMap<>();
            String line = br.readLine();
            while (line != null) {
                ArrayList<String> attributes = new ArrayList<>();
                Collections.addAll(attributes, line.split(","));
                subjectToMark = new HashMap<>();
                Student stud = new Student();
                stud.setNumber(Integer.parseInt(attributes.get(0)));
                stud.setFirstName(attributes.get(1));
                stud.setLastName(attributes.get(2));
                stud.setCourse(attributes.get(3));
                for(int i = 4; i < subjects.size()+4; i++){
                    subjectToMark.put(subjects.get(i-4) , new Mark(Integer.parseInt(attributes.get(i))));
                }
                stud.setSubjectList(subjects);
                stud.setSubjectToMark(subjectToMark);
                students.add(stud);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("The file was not found.");
            ioe.printStackTrace();
        }

        return students;
    }

    public static void generateCSVFile(ArrayList<Student> students, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".csv"), "UTF-8"));
        StringBuffer data = new StringBuffer();
        data.append("Number,FirstName,LastName,Couse");

        for(Subject subj : students.get(0).getSubjectList()){
            data.append(",").append(subj.getName());
        }

        bw.write(data.toString());
        bw.newLine();

        for(Student stud : students){
            data = new StringBuffer();

            data.append(stud.getNumber()).append(",").append(stud.getFirstName()).append(",").append(stud.getLastName()).append(",").append(stud.getCourse());

            for(Subject subj : stud.getSubjectToMark().keySet()){
                data.append(",").append(stud.getSubjectToMark().get(subj).getDefinedMark());
            }
            bw.write(data.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
