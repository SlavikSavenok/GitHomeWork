package homeWorK_6_0;

import java.util.Scanner;

public class HomeWork_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard cardOne = new CreditCard(1, "1234 4332 4567 9863", 4000);
        CreditCard cardTwo = new CreditCard(2, "4563 3468 4325 5678", 12000);
        CreditCard cardThree = new CreditCard(3, "2349 5435 3345 5577", 1230);

        cardOne.cardInfo();
        cardTwo.cardInfo();
        cardThree.cardInfo();

        System.out.print("Внесите сумму депозита первой карты: ");
        cardOne.deposit(scanner.nextInt());

        System.out.print("Внесите сумму депозита второй карты: ");
        cardTwo.deposit(scanner.nextInt());

        System.out.print("Внесите сумму вывода третьей карты: ");
        cardThree.withdraw(scanner.nextInt());


        scanner.close();

    }
}
