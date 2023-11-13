
public class Line {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }
    public String toString() {
        return "Линия с началом" + " " + start + " и с концом"  + " " + end;
    }

    public static void test2_1(){
        Point point1 = new Point(1, 3);
        Point point2 = new Point(23, 8);
        Point point3 = new Point(5, 10);
        Point point4 = new Point(25, 10);

        point1.x = 1;
        point1.y = 54;
        point4.x = 26;
        point4.y = 11;

        point2.x = 12;
        point2.y = 12;

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(point1, point4);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}
