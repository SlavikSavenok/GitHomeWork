package homeWork_8_2;

import java.util.Arrays;

public class Phone {
    public String number;
    public String model;
    public int weight;
    public String name = "Viktor";

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public Phone(String number, String model) {          // Конструктор с двумя параметрами
        this.number = number;
        this.model = model;

    }

    public Phone() {                                    // Конструктор без параметров
    }

    public Phone(String number, String model, int weight, String name) {
        this(number, model, weight);                         // Вызов одного конструктора из другого
        this.name = name;
    }

    public void receiveCall() {
        System.out.println("Calling " + name);

    }

    public void receiveCall(String name, String number) {   //  Перегруженный метод
        System.out.println(name + " " + number);

    }


    public void getNumber() {
        System.out.println(number);
    }

    public void sendMessage(String... number) {             //  Метод с аргументами переменной длинны
        System.out.println(Arrays.toString(number));


    }
}
