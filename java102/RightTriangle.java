package java102;

public class RightTriangle implements Shape {
    public final Point corner;
    public final double leg1;
    public final double leg2;

    public RightTriangle(Point corner, double leg1, double leg2) {
        this.corner = corner;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double area() {
        return (leg1*leg2)/2;
    }
    
    public double perimeter() {
        Point p1 = corner.translateX(leg1);
        Point p2 = corner.translateY(leg2);
        double hyp = Point.distance(p1, p2);
        return leg1+leg2+hyp;
    }

    public boolean isInside(Point p) {
        Point p1 = corner.translateX(leg1);
        Point p2 = corner.translateY(leg2);
        boolean isInside = false;
        double slope = (p1.y-p2.y)/(p1.x-p2.x);

        if (p.x > corner.x && p.y > corner.y && p.x < p1.x && p.y < p2.y) {
            isInside = p.y < slope*p.x + p2.y;
        } else if (p.x < corner.x && p.y > corner.y && p.x > p1.x && p.y > p2.y) {
            isInside = p.y < slope*p.x + p2.y;
        } else if (p.x > corner.x && p.y < corner.y && p.x < p1.x && p.y > p2.y) {
            isInside = p.y > slope*p.x + p2.y;
        } else if (p.x <  corner.x && p.y < corner.y && p.x > p1.x && p.y > p2.y) {
            isInside = p.y > slope*p.x + p2.y;
        } else {
            return isInside;
        }
        return isInside;
    }

    public boolean isOn(Point p) {
        Point p1 = corner.translateX(leg1);
        Point p2 = corner.translateY(leg2);
        boolean isOn = false;
        double slope = (p1.y-p2.y)/(p1.x-p2.x);

        if ((p.x == corner.y && p.y == corner.y) || (p.x == p1.x && p.y == p1.y) || (p.x == p2.x && p.y == p2.y)) {
            isOn = true;
        } else if(p.y == corner.y) {
            if (corner.x > p1.x) {
                isOn = p1.x < p.x && p.x < corner.x;
            } else {
                isOn = corner.x < p.x && p.x < p1.x;
            }
        } else if(p.x == corner.x) {
            if (corner.y > p2.y) {
                isOn = p2.y < p.y && p.y < corner.y;
            } else {
                isOn = corner.y < p.y && p.y < p2.y;
            }
        } else {
            isOn = p.y == slope*p.x + p2.y;
        }
        return isOn;
    }

    public RightTriangle translate(double x, double y) {
        return new RightTriangle(corner.translateX(x).translateY(y), leg1, leg2);
    }

    public RightTriangle scale(double k) {
        return new RightTriangle(corner, leg1*k, leg2*k);
    }

    public static boolean similar(RightTriangle a, RightTriangle b){
        Point ap1 = a.corner.translateX(a.leg1);
        Point ap2 = a.corner.translateY(a.leg2);
        Point bp1 = b.corner.translateX(b.leg1);
        Point bp2 = b.corner.translateY(b.leg2);

        double hypA = Point.distance(ap1, ap2);
        double hypB = Point.distance(bp1, bp2);

        return Math.asin(a.leg2/hypA) == Math.asin(b.leg2/hypB);
    }

    @Override
	public String toString() {
		return "(corner: " + corner + "; leg1: " + leg1 + "; leg2: " + leg2 + ")";
    }
}

