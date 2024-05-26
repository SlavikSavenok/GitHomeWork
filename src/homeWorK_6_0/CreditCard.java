package homeWorK_6_0;

public class CreditCard {
    private final String cardNumber;
    private int id;
    private double currentAmount;


    public CreditCard(int id, String cardNumber, double currentAmount) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.currentAmount = currentAmount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void deposit(double deposit) {
        currentAmount += deposit;
        System.out.println("Баланс равен: " + currentAmount);

    }

    public void withdraw(int withdraw) {
        if (withdraw > currentAmount) {
            System.out.println("Недостаточно средств на счете, ваш баланс: " + currentAmount);
            System.exit(6);
        } else {
            currentAmount -= withdraw;
            System.out.println("Баланс равен: " + currentAmount);
        }

    }

    public void cardInfo() {
        System.out.println("ID:" + id + " Номер карты: " + cardNumber + " Бланс: " + currentAmount);
    }

}





