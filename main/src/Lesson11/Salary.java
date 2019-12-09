package Lesson10;

public class Salary extends Employee {
    private double salary; // Annual salary
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }



    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with weekly pay " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double computePay() {
        return salary/52;
    }
}


