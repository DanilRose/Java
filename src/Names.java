public class Names {
    String name;
    String nameTwo;
    String patromyc;
    public Names (String name, String nameTwo, String patromyc){
        this.name = name;
        this.nameTwo = nameTwo;
        this.patromyc = patromyc;
    }

    public String toString(){
        String nameNull = "";
        if (name != null){
            nameNull += name + " ";
        }
        if (nameTwo != null){
            nameNull += nameTwo + " ";
        }
        if (patromyc != null){
            nameNull += patromyc + " ";
        }
        return nameNull;
    }

    public static void test1_3(){
        Names names1 = new Names("Клеопатра", " ", " ");
        Names names2 = new Names("Александр", "Сергеевич", "Пушкин");
        Names names3 = new Names("Владимир", "Маяковский", " ");

        System.out.println(names1);
        System.out.println(names2);
        System.out.println(names3);
    }
}
