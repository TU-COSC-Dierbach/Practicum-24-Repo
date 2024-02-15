import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double radius;
    Circle cir;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter radius: ");
    radius = input.nextDouble();
    cir = new Circle(radius);

    System.out.printf("Area of circle with radius " +
                        radius + " is %.1f", cir.area());
  }
}