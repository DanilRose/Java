public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString (){
        return "{" + " " + x + " " + "}" + " " + "{" + " " + y + " " + "}";
    }
    public static void test1 (){
        Point point1 = new Point(12, 1);
        System.out.println(point1);
    }
}
