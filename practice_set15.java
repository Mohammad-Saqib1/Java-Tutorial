package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class PrAnnotation{
    @Deprecated
    public void deprecated(int a ,int b){
        System.out.println("The Result :"+(a+b));
        System.out.println("This Method is Deprecated");
    }
}
interface MyInstance{
    void meth1();
}
public class practice_set15 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        System.out.println("Practice-Set 15");
        // 1 create a class and method with deprecated annotation
        PrAnnotation pa=new PrAnnotation();
        pa.deprecated(10,20);

        // 2 Suppress warning generated in number (1)

        // 3 Create an interface and generate an instance from it
        MyInstance mi=()-> System.out.println("This is Method 1");
        mi.meth1();

       // Write a program multiplication table of a given number and write it to a file
        // Create File
        File createFile=new File("table.txt");
        try {
            createFile.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
        // Write File
        FileWriter writeFile=new FileWriter("table.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number for Multiplication Table");
        int table=sc.nextInt();
        try {
            for (int i=1;i<=10;i++){
                writeFile.write(table+" x "+i+" = "+table*i+"\n");
            }
            writeFile.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        // Read File
        File readFile=new File("table.txt");
        Scanner sc1=new Scanner(readFile);
       int read=sc1.nextInt();
       for (int i=1;i<=10;i++){
           System.out.println(read+" x "+i+" = "+read*i);
       }


    }
}
