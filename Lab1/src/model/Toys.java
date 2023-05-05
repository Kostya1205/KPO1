package model;

import model.Toy;

import java.util.ArrayList;
import java.util.List;

public class Toys {
    private List<Toy> toys ;

    public Toys() {
        this.toys = new ArrayList<>();
    }


    public String priceOfAllToys(){
        int sum = 0;
        for (Toy toy:toys) {
            sum+=toy.getPrice();
        }
        return "Цена всех игрушек равна "+sum;
    }
    public String weightOfAllToys(){
        int sum = 0;
        for (Toy toy:toys) {
            sum+=toy.getWeight();
        }
        return "Вес всех игрушек равен "+sum;
    }
    public List<Toy> getToys() {
        return toys;
    }
    public Toy get(int number) {
        return toys.get(number);
    }
    public void add(Toy toy) {
        this.toys.add(toy);
    }
    public int size(){
        return toys.size();
    }
}
