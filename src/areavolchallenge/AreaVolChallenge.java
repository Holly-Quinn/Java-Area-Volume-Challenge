package areavolchallenge;

import java.util.Scanner;

public class AreaVolChallenge {

    //main method - the entry point to the program
    public static void main(String[] args) {

        //calls runSquare and runCube
        runSquare();
        runCube();
        
    }

    public static int calcArea (int length, int width) {
        
        int area = length * width;     
        return area;
        
    }
    
    public static int calcVolume (int length, int width, int height) {
        
        int volume = length * width * height;     
        return volume;
        
    }
    
    public static int getLength () {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length?");
        int length = sc.nextInt();
        return length;
        
    }
    
    public static int getWidth () {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the width?");
        int width = sc.nextInt();
        return width;
        
    }
    
    public static int getHeight () {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the height?");
        int height = sc.nextInt();
        return height;
        
    }
    
    public static void runSquare () {
        
        System.out.println("The area of the rectangle is: " + calcArea(getLength(), getWidth()) + ".");
               
    }
    
    public static void runCube () {
        
        System.out.println("The volume of the cube is: " + calcVolume(getLength(), getWidth(),getHeight()) + ".");
               
    }
    
}
