package com.assignment.task5;
import java.util.Scanner;
public class ques1 {
    public static void main(String[]args){
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder revStr=new StringBuilder(str);
        revStr.reverse();
        String result=revStr.toString();
        System.out.println(result);

    }
}
