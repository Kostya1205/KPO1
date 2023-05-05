package model;

import controller.Toys;
import model.Toy;

import java.util.ArrayList;
import java.util.List;

public class GameRoom {
    private final Toys toys;

    public GameRoom(){
        toys=new Toys();
    }

    public void addToy(int price){
        toys.set;
    }
    public String priceOfAllToys(){
        int sum = 0;
        for (Toy toy:toys) {
            sum+=toy.getPrice();
        }
        return "Цена всех игрушек в комнате равна "+sum;
    }

    public String weightOfAllToys(){
        int sum = 0;
        for (Toy toy:toys) {
            sum+=toy.getWeight();
        }
        return "Вес всех игрушек в комнате равен "+sum;
    }
}
