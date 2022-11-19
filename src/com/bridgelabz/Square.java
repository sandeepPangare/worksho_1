package com.bridgelabz;

import java.util.Scanner;

public class Square {
    public float area() {
        float side, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Side Length of Square: ");
        side = sc.nextFloat();
        area=side*side;
        System.out.println("Area = "+area);
        return area;
    }
    public int parameter(){
        int parameter,side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        side=sc.nextInt();
        parameter = 4 * side;
        System.out.println("Parameter = " + parameter);
        return parameter;
    }
    public static void main(String[] args) {
        Square sq = new Square();
        sq.area();
        sq.parameter();
    }
}
