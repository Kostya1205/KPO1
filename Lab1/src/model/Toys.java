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
    public String maxWeight(){
        Toy maxToy = toys.get(toys.size()-1);
        for (Toy toy:toys) {
            if(maxToy.getWeight()<toy.getWeight())
                maxToy=toy;
        }
        return maxToy.getName()+" - игрушка с самым большим весом равным "+maxToy.getWeight();
    }
    public String maxPrice(){
        Toy maxToy = toys.get(toys.size()-1);
        for (Toy toy:toys) {
            if(maxToy.getPrice()<toy.getPrice())
                maxToy=toy;
        }
        return maxToy.getName()+" - игрушка с самой большой ценой равной "+maxToy.getPrice();
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
