package com.fileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\golu\\OneDrive\\Desktop\\html files\\sam.txt");
        if (myFile.exists()){
            if (!myFile.canRead())
                myFile.setReadable(true);
        }

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
