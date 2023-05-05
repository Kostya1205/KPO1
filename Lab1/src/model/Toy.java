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
    public Toy(String name) {
        this.name = name;
        this.weight = 14;
        this.price = 5;
    }

    public Toy(int price) {
        this.name = "Kostya";
        this.price = price;
        this.weight = 14;
    }
    public Toy(Toy toy) {
        this.name = toy.getName();
        this.price = 1;
        this.weight = 14;
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
