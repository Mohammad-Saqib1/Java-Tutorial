package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lc_63_file_handling {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling");
        // Create a File
        //try and catch not compulsory but if you want to resolve exception then use it
        File creatFile=new File("abc.txt");
        try {
            creatFile.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to create this file");
        }

        // Write in a File
        try {
            FileWriter fileWriter=new FileWriter("abc.txt");
            fileWriter.write("Hello, This is Java File Handling Tutorial");
            fileWriter.close();
    }catch (IOException e){
            e.printStackTrace();
        }

        // Reading a File
        File readFile=new File("abc.txt");
        Scanner sc=new Scanner(readFile);
        String line=sc.nextLine();
        System.out.println(line);

        // Delete a File
       File deleteFile=new File("abc.txt");
        // 1 Method
//        System.out.println(deleteFile.delete());
//        System.out.println(deleteFile.getName());

        // 2 Method
        if(deleteFile.delete()){
            System.out.println("Successfully deleted "+deleteFile.getName());
        }else{
            System.out.println("Unable to delete");

        }


    }
}
