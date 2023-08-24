package com.example.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class codeOpt {

    public static String Scanner(String input) throws IOException {

        File inputText = new File("C:\\Users\\boysh_5y1i3f1\\Text.txt");
        Path fileInputPath = Path.of("C:\\Users\\boysh_5y1i3f1\\Text.txt");
        Files.writeString(fileInputPath, input); // Writing into the file
        //---------------------------------------------------------------------------------------------------------
        //Create new outputfile
        Path fileNameOutput = Path.of("C:\\Users\\boysh_5y1i3f1\\Output.txt");

        //Select Text.txt to read duplicates from it
        String in = null;
        //Instantiating the Scanner class
        Scanner duplicateScanner = new Scanner(fileInputPath);
        //Instantiating the FileWriter class
        FileWriter writer = new FileWriter("C:\\Users\\boysh_5y1i3f1\\Output.txt");
        //Instantiating the Set class
        Set set = new HashSet();
        while (duplicateScanner.hasNextLine()) {
            in = duplicateScanner.nextLine();
            if (set.add(in)) {
                writer.append(in + "  \n");
                Files.writeString(fileNameOutput, in); // Writing into the file

            }
        }
        writer.flush();

        String file_content_output = Files.readString(fileNameOutput);
        return file_content_output;
    }
}



























