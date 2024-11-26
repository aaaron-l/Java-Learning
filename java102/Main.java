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

    }
}