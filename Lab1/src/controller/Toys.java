package controller;

import model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toys {
    private final List<Toy> toys = new ArrayList<>();
    Toys(){
        toys.add(new Toy(2,200,"Стикер"));
        toys.add(new Toy(1,100,"Брелок"));
        toys.add(new Toy(2,300,"Матрёшка"));
        toys.add(new Toy(1,400,"Автомобиль"));
        toys.add(new Toy(2,400,"Поезд"));
        toys.add(new Toy(1,200,"Солдатик"));
    }
    public Toy getRandomToy(int price){
        for (int i = 0;i<toys.size()*2;i++) {
            Random random = new Random();
            Toy toy =toys.get(random.nextInt(toys.size()));
            if(toy.getPrice()==price)
                return toy;
        }
        return null;
    }
}
