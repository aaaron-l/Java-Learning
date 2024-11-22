package java102;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);  
        Point a = new Point(2, 1);
        Point b = new Point(5, 10);

        System.out.println("x: " + point.x + "y: " + point.y);

        Point xTranslation = point.translateX(3);
        Point yTranslation = point.translateY(-7); 
        Point xyTranslation = point.translateX(-4).translateY(-3); 

        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);

        System.out.println("point: " + point);

        System.out.println(Point.distance(a, b));

        Point[] pointArray = {
            new Point(1, 2),
            new Point(3, 6),
            new Point(6, 8),
            new Point(10, 0),
            new Point(0, 0),
        };

        System.out.println(Point.centerOfMass(pointArray));
    }
}
