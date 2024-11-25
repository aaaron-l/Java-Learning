package java102;

public class Point {
    public final double x;
	public final double y;

    public Point(double x, double y) {
		this.x = x;
		this.y = y;
    }

    public Point translateX(double t) {
		return new Point(x + t, y);
    }

    public Point translateY(double t) {
		return new Point(x, y + t);
    }

    @Override
	public String toString() {
	return "(" + x + ", " + y + ")";
    }   

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    
    }

    public static Point centerOfMass(Point[] points) {
        double sumx = 0;
        double sumy = 0;
        int i = 0;

        for (i = 0; i < points.length; i++) {
            sumx += points[i].x;
            sumy += points[i].y;
        }

        double avgX = sumx/points.length;
        double avgY = sumy/points.length;

        return new Point(avgX, avgY); 
    }   

    public double angle() {
      double angleValue = 0;
      Point point = new Point(x, y);
      Point origin = new Point(0, 0);
      Point xAxis = new Point(x, 0);
      double disPointOrigin = Point.distance(point, origin);
      double disPointxAxis = Point.distance(point, xAxis);
      double sinePointxAxis = disPointxAxis/disPointOrigin;
      double radDegreesSin = Math.asin(sinePointxAxis);
      if (point.x >= 0 && point.y == 0) {
        angleValue = 0;
      } else if (point.x == 0 && point.y > 0) {
        angleValue = 90;
      } else if (point.x > 0 && point.y > 0) {
        angleValue = Math.toDegrees(radDegreesSin); 
      } else if (point.x < 0 && point.y > 0) {
        angleValue = 180 - Math.toDegrees(radDegreesSin);
      } else if (point.x < 0 && point.y == 0) {
        angleValue = 180;
      } else if (point.x < 0 && point.y < 0) {
        angleValue = 270 - Math.toDegrees(radDegreesSin);
      } else if (point.x == 0 && point.y < 0) {
        angleValue = 270;
      } else if (point.x > 0 && point.y < 0) {
        angleValue = 360 - Math.toDegrees(radDegreesSin);
      }
      return angleValue;  
    }
}
    




