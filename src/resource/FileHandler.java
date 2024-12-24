package resource;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        String fileName = "name_surname.txt";
        String name = "John";
        String surname = "Doe";
        writeToFile(fileName, name, surname);
        readFromFile(fileName);
    }

    public static void writeToFile(String fileName, String name, String surname) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Name: " + name + "\n");
            writer.write("Surname: " + surname + "\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}