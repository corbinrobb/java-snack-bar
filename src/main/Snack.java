package main;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack() {

    }

    public Snack(String name, int quantity, double cost, int vendingId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

    public int getVendingId() {
        return vendingId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int amount) {
        this.quantity -= amount;
    }

    public double getTotalCost(int quantity) {
        return cost * quantity;
    }
}
