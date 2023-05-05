package model;

public class Toy {
    private int price;
    private int weight;
    private String name;

    public Toy(int price, int weight,String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
