class Employee1 {
    int id;
    String name;
    String deptname;
    double salary;
    static int count = 0;

    public Employee1() {
        this(0, "NA", "NA", 0.0);
    }

    public Employee1(int id, String name, String deptname, double salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count++;
        System.out.println("Employee1 count: " + count);
        display();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + deptname);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static int getCount() {
        return count;
    }
}
public class Slip21_2 {
    public static void main(String[] args) {
       

        System.out.println("\nQ2: Employee1 Object Count & Details");
        Employee1 e1 = new Employee1(101, "Ravi", "IT", 50000);
        Employee1 e2 = new Employee1(102, "Priya", "HR", 45000);
        Employee1 e3 = new Employee1(103, "Amit", "Sales", 55000);
    }
}

