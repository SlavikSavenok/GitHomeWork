package homeWork_7_2;

public class HomeWork_7_2 {
    public HomeWork_7_2() {
    }

    public static void main(String[] args) {
        Director director = new Director("Valerii", 4500);
        Worker worker = new Worker("Ivan", 2700);
        Accountant accountant = new Accountant("Diana", 3350);
        director.getsPosition();
        worker.getsPosition();
        accountant.getsPosition();
    }
}
