package com.fileHandeling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDetails {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\golu\\OneDrive\\Desktop\\html files\\sam.txt");
        if (myFile.exists()){
            System.out.println("Printing File Details : ");
            System.out.println("File Name : "+myFile.getName());
            System.out.println("File absolute path : "+myFile.getAbsolutePath());
            System.out.println("File is writable? : "+myFile.canWrite());
            System.out.println("File is readable? : "+myFile.canRead());
            System.out.println("File size : "+myFile.length());
            long time = myFile.lastModified();
            Date date = new Date(time);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            String lastModifiedDate = simpleDateFormat.format(date);
            System.out.println("File last modified : "+lastModifiedDate);
        }else {
            System.out.println("File is not exist, so it's created!");
            try {
                if (myFile.createNewFile()){
                    System.out.println("File name : "+myFile.getName());
                    System.out.println(myFile.setWritable(false));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
