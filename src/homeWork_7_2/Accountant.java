package HomeWork_7_2;

public class Accountant implements WorkOnPosition {
    private String name;
    private int salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Accountant(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getPosition() {
        System.out.println("Job title: Accountant");
        return "";
    }
}