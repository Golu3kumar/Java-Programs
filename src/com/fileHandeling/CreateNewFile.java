package com.fileHandeling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        File newFile = new File("C:\\Users\\golu\\OneDrive\\Desktop\\html files\\ golu.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("File is Created");
            } else {
                System.out.println("File is already exist in this directory");
            }
            System.out.println("File name is : " + newFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
