public class Employe {

   String name;
   int id;
   int salary;

   public void abcd () {

   }
   // all argument constructor
    public Employe(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 0 argument constructor
    public Employe() {
    }

    public Employe(String name) {
        this.name = name;
    }

    public Employe(int salary) {
        this.salary = salary;
    }
}
