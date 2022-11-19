package com.bridgelabz;

import java.util.Scanner;

public class DuplicateElementInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a lenth of Array");
        int length = scanner.nextInt();
        System.out.println("Enter a Array Element");
        int [] arr = new int[length];
        for (int i=0; i< length; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println();
        System.out.println("Duplicate Element in array");
        for (int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if (arr[i]==arr[j])
                    System.out.print(arr[j]+ " ");
            }
        }
        System.out.println();
        System.out.println("Reverse the Array");
        for (int i= length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
    }
    }
}
