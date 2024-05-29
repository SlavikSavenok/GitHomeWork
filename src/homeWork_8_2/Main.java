package homeWork_8_2;

public class Main {
    public static void main(String[] args) {


        Phone phoneOne = new Phone("846-84-08", "Samsung", 232);
        Phone phoneTwo = new Phone("309-87-77", "apple", 250);
        Phone phoneThree = new Phone("777-77-77", "Nokia", 400);
        System.out.println("model: " + phoneOne.model + ". number: " + phoneOne.number + ". weight: " + phoneOne.weight);
        System.out.println("model: " + phoneTwo.model + ". number: " + phoneTwo.number + ". weight: " + phoneTwo.weight);
        System.out.println("model: " + phoneThree.model + ". number: " + phoneThree.number + ". weight: " + phoneThree.weight);

        phoneOne.receiveCall();
        phoneTwo.receiveCall();
        phoneThree.receiveCall();
        phoneOne.getNumber();
        phoneTwo.getNumber();
        phoneThree.getNumber();

        phoneOne.receiveCall("Viktor", "354-98-56");
        phoneOne.sendMessage(phoneOne.number, phoneTwo.number, phoneThree.number);

    }


}


