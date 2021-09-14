package com.company;

public class practice_set2 {
    public static void main(String[] args) {
        // 1 Convert a String into LowerCase
        String str="SAQIB";
        System.out.println("LowerCase "+str.toLowerCase());

        // 2 Replace Spaces with Underscore
        String str1="Md Saqib Ansari";
        System.out.println("Replace "+str1.replace(" ","_"));

        // 3 Letter Template
        String str2="Dear < |name| > ,Thanks a lot";
        System.out.println("Template "+str2.replace("< |name| >","Saqib"));

        // 4 Detect double and triple space
        String str4=" This is a  Java   Tutorial";
        System.out.println("Double Spaces "+str4.indexOf("  "));
        System.out.println("Triple Spaces "+str4.indexOf("   "));

        // 5 Escape Sequence
        System.out.println("Hello, Mr\tSaqib");
        System.out.println("Hello, Mr\nSaqib");
        System.out.println("Hello, Mr\\Saqib");
        System.out.println("Hello, Mr\\'Saqib");
    }
}
