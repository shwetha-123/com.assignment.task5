package com.assignment.task5;
import java.util.Scanner;
public class ques5 {
    public static void main(String[]args){
        int vow=0,cons=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vow++;
            }
            else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                cons++;
            }
        }
        System.out.println(vow++);
        System.out.println(cons++);

    }
}
