package HomeWork_7_2;

public class Director implements WorkOnPosition {
    private String name;
    private int salary;

    public Director(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

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

    public String getsPosition() {
        System.out.println("Job title: Director");
        return "";
    }
}
