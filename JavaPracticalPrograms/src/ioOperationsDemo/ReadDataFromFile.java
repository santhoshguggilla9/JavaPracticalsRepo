package ioOperationsDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromFile {
    public static void main(String[] args) {
        String str;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter filename: ");
            str = br.readLine();

            File file = new File(str);
            if (file.exists()) {
                String dname = file.getParent();
                System.out.println("Directory name: " + dname);

                String fname = file.getName();
                System.out.println("File name: " + fname);

                String abspath = file.getAbsolutePath();
                System.out.println("Full Name: " + abspath);

                long size = file.length();
                System.out.println("Size: " + size);

                // Read and print the content of the file
                readAndPrintFileContent(file);
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void readAndPrintFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("\nFile Content:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file content: " + e.getMessage());
        }
    }
}
