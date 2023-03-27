import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length:");
        double length = scanner.nextDouble();
        System.out.print("enter breadth:");
        double breadth = scanner.nextDouble();
        System.out.println("length:"+length );
        System.out.println("breadth:"+breadth );
        double area = length * breadth;
        double perimeter = 2*(length + breadth);
        System.out.println("Area is:"+area);
        System.out.println("Perimeter is:"+perimeter);


    }
}


