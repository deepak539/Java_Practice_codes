//Implementing abstract keyword --
// Abstract keyword with class and method--
//Constructor in abstract class--

package com.company;

import java.util.Scanner;

abstract class Shape {                                   //Abstract class
    Scanner s = new Scanner(System.in);
    int base, height;
    public Shape(){
        System.out.print("Enter radius:-");
        base = s.nextInt();
        System.out.print("Enter height:-");
        height = s.nextInt();
    }
    abstract public void area();
}

class Triangle extends Shape{
    @Override
    public void area(){
        System.out.printf("Area of the given triangle: %d\n",(base*height)/2);
    }
}

class Parallelogram extends Shape{
    @Override
    public void area(){
        System.out.printf("Area of the given parallelogram: %d\n",base*height);
    }
}

public class AbstractClassImplementation{                                                // Main class
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.area();
        Parallelogram para = new Parallelogram();
        para.area();
    }
}


