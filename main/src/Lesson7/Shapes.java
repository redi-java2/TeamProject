package Lesson6;

import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        System.out.println("Welcome to creating some shapes!");
        List<Shape> shapes = List.of(new Rectangle(10, 20), new Circle(4));
        for (Shape shape:shapes){
            double area = shape.area();
            double circumference = shape.circumference();
            System.out.println(shape);
            System.out.println("Area is: " + area);
            System.out.println("Circumference is: " + circumference);

        }
    }

    interface Shape {
        double area ();
        double circumference ();
    }

    static class Circle implements Shape{
        private double radius;
        Circle ( double radius){
            this.radius = radius;
        }
        @Override
        public double area(){
            return Math.PI * radius * radius;
        }

        @Override
        public double circumference(){
            return 2 * Math.PI * radius;
        }

        public String toString(){
            return "Circle";
        }

    }

    static class Rectangle implements Shape {
        private double length;
        private double width;
        Rectangle ( double length, double width){
            this.length = length;
            this.width = width;
        }
        @Override
        public double area(){
            return length * width;
        }

        @Override
        public double circumference(){
            return 2*(length + width);
        }

        public String toString(){
            return "Rectangle";
        }
    }


}
