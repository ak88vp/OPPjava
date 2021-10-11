package Rectangle;

import Rectangle.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        int width = scanner.nextInt();
        System.out.print("Enter the height:");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle.Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle.Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle.Rectangle: "+ rectangle.getArea());
    }
}