import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1 - Квадрат, 2 - Треугольник, 3 - Круг");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите длину стороны квадрата:");
            double side = scanner.nextDouble();
            Square square = new Square(side);
            System.out.println("Площадь квадрата: " + square.calculateArea());
            System.out.println("Периметр квадрата: " + square.calculatePerimeter());
        } else if (choice == 2) {
            System.out.println("Введите длины сторон треугольника:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Площадь треугольника: " + triangle.calculateArea());
            System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        } else if (choice == 3) {
            System.out.println("Введите радиус круга:");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Площадь круга: " + circle.calculateArea());
            System.out.println("Длина окружности: " + circle.calculatePerimeter());
        } else {
            System.out.println("Неправильный выбор");
        }
        scanner.close();
    }
}