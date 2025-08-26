import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create a length variable
        System.out.print("Enter your Length: ");
        double length = input.nextDouble();

        // create a width variable
        System.out.print("Enter your Width: ");
        double width = input.nextDouble();

        // create a area variable for storing  the value
        double area = length * width;

        // create a print system for showing the result 
        System.out.println("The area of the Rectangle is: " + area);
        input.close();

    }
}
