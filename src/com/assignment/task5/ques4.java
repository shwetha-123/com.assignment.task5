package com.assignment.task5;
import java.util.*;
public class ques4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd String");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        //check if length is same
        if(str1.length()==str2.length()){
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();
            //sort the array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result=Arrays.equals(charArray1,charArray2);
            if(result){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not anagram");
            }
        }
    }

}
