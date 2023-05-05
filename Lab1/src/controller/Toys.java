package controller;

import model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toys {
    private List<Toy> toys ;

    public Toys() {
        this.toys = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }
    public Toy getToy(int number) {
        return toys.get(number);
    }
    public void addToy(Toy toy) {
        this.toys.add(toy);
    }
}
