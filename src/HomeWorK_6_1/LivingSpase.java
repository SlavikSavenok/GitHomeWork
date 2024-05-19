package HomeWorK_6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class LivingSpase {

    private int id;
    private int apartamentArea;
    private double costPerMonth;
    public Owner owner;
    public Client client;

    public LivingSpase(int id, int apartamentArea, double costPerMonth) {
        this.id = id;
        this.apartamentArea = apartamentArea;
        this.costPerMonth = costPerMonth;
    }

    public LivingSpase(int id, int apartamentArea, double costPerMonth, Owner owner, Client client) {
        this(id, apartamentArea, costPerMonth);
        this.owner = owner;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartamentArea() {
        return apartamentArea;
    }

    public void setApartamentArea(int apartamentArea) {
        this.apartamentArea = apartamentArea;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void apartmentOne() {
        System.out.println("Информация о квартире №1: id " + id + ". Площадь квартиры: " + apartamentArea + ". Стоимость аренды: " + costPerMonth);
    }

    public void apartmentTwo() {
        System.out.println("Информация о квартире №2: id " + id + ". Площадь квартиры: " + apartamentArea + ". Стоимость аренды: " + costPerMonth + ". Имя владельца: " + owner.getName() + ". Имя клиента: " + client.getName());
    }

}

