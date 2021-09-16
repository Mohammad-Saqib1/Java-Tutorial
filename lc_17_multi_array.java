package com.company;

public class lc_17_Multi_arrays {
    public static void main(String[] args) {
        System.out.println("Multi Dimensional Array");
        int[][] floar=new int[3][4];
        floar[0][0]=101;
        floar[0][1]=102;
        floar[0][2]=103;
        floar[0][3]=104;
        floar[1][0]=201;
        floar[1][1]=202;
        floar[1][2]=203;
        floar[1][3]=204;
        floar[2][0]=301;
        floar[2][1]=302;
        floar[2][2]=303;
        floar[2][3]=304;
        for (int i = 0; i < floar.length ; i++) {
            for (int j = 0; j <floar[i].length ; j++) {
                System.out.println("The Floar Number is "+i+" "+"The Room Is Corresponding to Floar "+floar[i][j]);
                System.out.println(" ");

            }
            System.out.println(" ");

        }
    }
}
