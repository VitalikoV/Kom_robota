import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataParser {

    public static void generateByteData(String data) {

        try (FileOutputStream fos = new FileOutputStream(new File("universities.dat"))) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);
            bufferedOutputStream.write(data.getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            System.out.println("The data was successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generateByteData(ArrayList<University> universities) {
        try (FileOutputStream fos = new FileOutputStream(new File("universities.ser"))) {
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(universities);
            out.flush();
            out.close();
            System.out.println("The data was successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<University> readStudentsData(){
        ArrayList<University> universities = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File("universities.ser"))) {
            ObjectInputStream oit = new ObjectInputStream(fis);
            universities = (ArrayList<University>)oit.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return universities;
    }

    public static void printStudentsData(){
        try (FileInputStream fis = new FileInputStream(new File("universities.ser"))) {
            ObjectInputStream oit = new ObjectInputStream(fis);
            ArrayList<University> universities = (ArrayList<University>)oit.readObject();
            for (University university : universities){
                System.out.println(university.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getDataFromBinaryFile() {
        try (FileInputStream fis = new FileInputStream(new File("universities.dat"))) {
            DataInputStream data_in = new DataInputStream(new BufferedInputStream(fis));
            String s = new String(fis.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        String raw = Arrays.stream(input.split(" "))
//                .map(binary -> Integer.parseInt(binary, 2))
//                .map(Character::toString)
//                .collect(Collectors.joining()); // cut the space
//
//        System.out.println(raw);
        return null;
    }

    public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", " ")                         // zero pads
            );
        }
        return result.toString();

    }

    public static String prettyBinary(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

        return result.stream().collect(Collectors.joining(separator));
    }
}

