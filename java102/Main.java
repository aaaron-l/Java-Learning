package java102;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);  
        Point a = new Point(2, 1);
        Point b = new Point(5, 10);

        System.out.println(point.x);

        System.out.println(Point.distance(a, b));

        Point[] pointArray = {
            new Point(1, 2),
            new Point(3, 6),
            new Point(6, 8),
            new Point(10, 0),
            new Point(0, 0),
        };

        System.out.println(Point.centerOfMass(pointArray));

        Point angleTest1 = new Point(3, 4);
        double angle = angleTest1.angle();
        System.out.println(angle);
        Point angleTest2 = new Point(-5, 10);
        angle = angleTest2.angle();
        System.out.println(angle);
        Point angleTest3 = new Point(-3, -7);
        angle = angleTest3.angle();
        System.out.println(angle);
        Point angleTest4 = new Point(3, -4);
        angle = angleTest4.angle();
        System.out.println(angle);
        Point angleTest5 = new Point(0, 0);
        angle = angleTest5.angle();
        System.out.println(angle); 

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);

        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
	        intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));

        Grid<Integer> grid = new Grid<>(5, 1);
        grid.set(2, 2, 4);
        System.out.println(grid);

        String[] arr2 = {"e", "f", "g", "h"};
        System.out.println(Grid.arrayToString(arr2));

        System.out.println(grid.diagonal());

        Grid<Integer> grid1 = new Grid<>(6, 3);
        System.out.println(Grid.maxSideLength());

        Point corner = new Point(0, 0);
        Square square = new Square(corner, 10);
        Point p = new Point(0, 5);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(2,2);

        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square.isOn(p));
        System.out.println(square.isOn(p2));
        System.out.println(square.isInside(p3));
        System.out.println(square.translate(3.5, 2.5));
        String str = "{";
        for (int i = 0; i < 4; i++) {
            str += square.corners()[i];
            str += ", ";
        }
        System.out.println(str);

        Shape[] shapes = {
            new Circle(new Point(1.8, -20), 2), 
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));
        Shape[] scaled = Main.scaleAll(shapes, 2);
        str = "{";
        for (int i = 0; i < scaled.length; i++) {
            str += scaled[i];
            str += ", ";
        }
        System.out.println(str);

        Point point1 = new Point(0, 0);
        Point point2 = new Point(4, 0);
        Point point3 = new Point(0, 3);

        System.out.println(Circle.fromPoints(point1, point2, point3));

        point2 = point2.translateX(-10).translateY(0.5);

        RightTriangle t1 = new RightTriangle(point1, 2, 4);
        System.out.println(t1.isInside(point2));

    }

    static double sumArea(Shape[] shapes) {
        double sum = 0; 
        for (Shape shape : shapes){ 
            sum += shape.area();
        }
        return sum;
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }
}