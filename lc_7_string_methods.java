package com.company;

import java.util.Locale;

public class lc_7_string_methods {
    public static void main(String[] args) {
        String str="Saqib";
        System.out.println(str);
        System.out.println("The Length Of String IS "+str.length());
        System.out.println("LowerCase "+str.toLowerCase());
        System.out.println("UpperCase "+str.toUpperCase());
        System.out.println("Substring "+str.substring(1));
        System.out.println("Substring "+str.substring(1,4));
        System.out.println("Replace "+str.replace('q','k'));
        System.out.println("StarsWith "+str.startsWith("Sa"));
        System.out.println("EndsWith "+str.endsWith("b"));
        System.out.println("CharAt "+str.charAt(4));
        System.out.println("IndexOf "+str.indexOf("i"));
        System.out.println("LastIndexOf "+str.lastIndexOf("ib"));
        System.out.println("LastIndexOf "+str.lastIndexOf("ib",5));

        String str1="    saqib    ";

        System.out.println(" Trim " +str1.trim());
        String str2="saqib";
        System.out.println("Equals "+str2.equals(str));
        System.out.println("EqualsIgnoreCase "+str2.equalsIgnoreCase(str));
    }
}
