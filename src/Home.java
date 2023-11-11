public class Home {
    int floor;
    String ending = "";
    public Home(int floor){
        this.floor = floor;
        if(floor == 1){
            ending = "Этажом";
        }
        if (floor % 10 == 1 && floor % 100 != 11){
            ending = "Этажами";
        }
        if (floor > 1) {
            ending = "Этажами";
        }
    }

    public String toString(){
        return "Дом " + "с" + " " + floor + " " + ending;
    }

    public static void test1_5(){
        Home home1 = new Home(21);
        System.out.println(home1);
    }
}
