public class Employee {
    Department department;
    String name;
    public Employee (String name, Department department){
        this.name = name;
        this.department = department;
    }
    public Employee(String name){
        this.name = name;
    }
    public String toString(){
        if (department.boss.name.equals(name)){
            return name + " начальник отдела" + " " + department.name;
        }
        return  name + " работает в отделе " + department.name + " начальник которого: " + department.boss.name;
    }

    public static void test1_4(){
        Employee employee1 = new Employee("Петров");
        Employee employee2 = new Employee("Козлов");
        Employee employee3 = new Employee("Сидоров");
        Department department1 = new Department("IT", employee3);
        employee1.department = department1;
        employee2.department = department1;
        employee3.department = department1;
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
