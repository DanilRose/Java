public class Human {
    Names name;
    int height;

    public Human (Names name,int height){
        this.name =  name;
        this.height = height;
    }
    public String toString(){
        return "Человек с именем:" + " " + name + "и ростом:" + " " + height ;
    }

    public static void test1_2(){
        Names name1 = new Names("Клеопатра", "", "");
        Names name2 = new Names("Александр", "Сергеевич", "Пушкин");
        Names name3 = new Names("Владимир", "Маяковский", " ");
        Human human2 = new Human(name2, 167);
        Human human1 = new Human(name1, 152);
        Human human3 = new Human(name3, 189);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
