package com.assignment.task5;
import java.util.Scanner;

public class ques6 {
    public static void main(String[]args){
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter a text");
        String substr=sc.nextLine();
        int result=str.indexOf(substr);
        if(result==-1){
            System.out.println("No substring");
        }
        else{
            System.out.println("Substring");
        }

    }

}
