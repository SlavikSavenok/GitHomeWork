package HomeWork_7_2;

public class HomeWork_7_2 {
    public HomeWork_7_2() {
    }

    public static void main(String[] args) {
        Director director = new Director("Valerii", 4500);
        Worker worker = new Worker("Vitalii", 2700);
        Accountant accountant = new Accountant("Diana", 3350);
        director.getPosition();
        worker.getPosition();
        accountant.getPosition();
    }
}
