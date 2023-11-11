
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
        return "Линия с началом" + " {" + start + "} " + "и с концом" + "{" + end + "}";
    }
    int a;
    public static void test2_1(){
        Point point1 = new Point(1, 3);
        Point point2 = new Point(23, 8);
        Line line1 = new Line(point1, point2);

        System.out.println(line1);
    }
}
