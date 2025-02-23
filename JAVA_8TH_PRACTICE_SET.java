class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class JAVA_8TH_PRACTICE_SET {
    public static void main(String[] args) {
Employee moumita = new Employee();
        System.out.print(" Employee Name - ");
moumita.setName("Moumita");

moumita.salary = 12;


        System.out.println(moumita.getName());
        System.out.println(moumita.getSalary());
    }
}
