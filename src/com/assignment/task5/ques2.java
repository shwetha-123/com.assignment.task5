package com.assignment.task5;
import java.util.Scanner;
public class ques2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("input:"+str);
        String revStr=inPlaceReverse(str);
        System.out.println("output:"+revStr);


    }
    public static String inPlaceReverse(final String input){
        final StringBuilder sb=new StringBuilder(input);
        int length=sb.length();
        for(int i=0;i<length/2;i++){
            final char current=sb.charAt(i);
            final int otherEnd=length-i-1;
            sb.setCharAt(i,sb.charAt(otherEnd));
            sb.setCharAt(otherEnd,current);

        }
        return sb.toString();
    }
}
