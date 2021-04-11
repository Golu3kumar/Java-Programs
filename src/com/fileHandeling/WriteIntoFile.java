package com.fileHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\golu\\OneDrive\\Desktop\\html files\\sam.txt");
        if (myFile.exists()){
            if (!myFile.canWrite())
                myFile.setWritable(true);
        }
        try {
            FileWriter fWriter = new FileWriter("C:\\Users\\golu\\OneDrive\\Desktop\\html files\\sam.txt");
            fWriter.write("I am learning Java for whole day");
            fWriter.append("\nContinue Learning....");
            fWriter.close();
            System.out.println("writing is successfully.");
        } catch (IOException e) {
            System.out.println("File can't be writable");
            e.printStackTrace();
        }

    }
}
