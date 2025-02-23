import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Employe em = new Employe(435788 , "Moumita Ghosh" , 30000);
        System.out.println(em.id);
        System.out.println(em.name);
        System.out.println(em.salary);

        Employe pl = new Employe(32789 , "Sayani Ghosh" , 20000);
        System.out.println(pl.id);
        System.out.println(pl.name);
        System.out.println(pl.salary);

        Student st = new Student("Moumita" , 43 , 7 , "bengali");
        System.out.println(st.name);
        System.out.println(st.rollNumber);
        System.out.println(st.ss);
        System.out.println(st.subject);
    }


}
