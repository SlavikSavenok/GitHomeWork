package HomeWorK_6_1;

import java.io.FileNotFoundException;

public class HomeWork_6_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Owner owner = new Owner(2, "Ivan", "+29 8573983");
        Client client = new Client(1, "Boris", 21, true);


        LivingSpase apartmentOne = new LivingSpase(3, 70, 350);
        LivingSpase apartmentTwo = new LivingSpase(1, 550, 450.5, owner, client);

        client.clientInformation();
        owner.ownerInformation();

        apartmentOne.apartmentOne();
        apartmentTwo.apartmentTwo();


    }
}


