import java.util.Scanner;

interface Shape {
    void draw();
    void Area();
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void Area() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

class Rectangle implements Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void Area() {
        System.out.println("Area: " + (width * height));
    }
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
}

class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void Area() {
        System.out.println("Area: " + (0.5 * base * height));
    }
    public void draw() {
        System.out.println("Drawing Triangle...");
    }
}

public class week6_q4 {
    public static void main(String[] args) {
        Shape s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        s1 = new Circle(r);
        s1.Area();
        s1.draw();
        System.out.println("Enter width: ");
        double w = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        s1 = new Rectangle(w, h);
        s1.Area();
        s1.draw();
        System.out.println("Enter base: ");
        double b = sc.nextDouble();
        System.out.println("Enter height: ");
        double ht = sc.nextDouble();
        s1 = new Triangle(b, ht);
        s1.Area();
        s1.draw();
    }
}
