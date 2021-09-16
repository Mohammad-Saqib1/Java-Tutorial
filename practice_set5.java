package com.company;

public class practice_set5 {
    public static void main(String[] args) {

        // 1 create an array of 5 floats and their sum
        float[] std={45.5f,70.3f,79.8f,85.7f,95.6f};
        float sum=0;
        for (float v : std) {
            sum = sum + v;

        }
        System.out.println("The Sum Of All Float Array Is "+sum);



        // 2 Calculate the avg marks in array by forEach loop
        float avg=0;
        for (float v:std) {
             avg=v+avg;
        }
        System.out.println("The Avg Of Array Is "+avg/std.length);


        // 3 check a integer is present or not in array

        float [] check={45.6f,34,67.5f,90.7f};
        boolean isArray=false;
        int num=34;
        for (float v : check) {
            if (num == v) {
                isArray = true;
                break;
            }

        }
        if(isArray){
            System.out.println("Int");
        }
        else{
            System.out.println("Not Int");
        }
        // 4 Addition of Two Matrix
        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{7,8,9},{10,11,12}};
        int [][] res={{0,0,0},{0,0,0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        // 5 Printing The Array
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                res[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }




        // 6 Check Sorted or Not
        boolean isSorted=true;
        int [] arr={1,2,3,4,5,8,9};
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array Is Sorted");
        }
        else{
            System.out.println("Array Is UnSorted");
        }
    }
}
