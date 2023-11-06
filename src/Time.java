public class Time {
    int hours;
    int minutes;
    int second;
    public Time( int second){
        this.hours = second / 3600;
        this.minutes = (second % 3600) / 60;
        this.second = second % 60;

        if (hours > 24){
            hours = hours % 24;
        }
    }
    public String toString (){
        return "{" + hours + ":" + minutes + ":" + second + "}";
    }

    public static void test1_4(){
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
