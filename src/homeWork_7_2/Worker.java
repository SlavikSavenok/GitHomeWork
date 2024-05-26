package HomeWork_7_2;

public class Worker implements WorkOnPosition {
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

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getPosition() {
        System.out.println("Job title: Worker");
        return "";
    }
}
