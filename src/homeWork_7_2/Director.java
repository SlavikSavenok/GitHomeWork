package homeWork_7_2;

import homeWork_7_2.WorkOnPosition;

public class Director implements WorkOnPosition {
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

    public Director(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getPosition() {
        System.out.println("Job title: Director");
        return "";
    }


    @Override
    public String getsPosition() {
        return "";
    }
}
