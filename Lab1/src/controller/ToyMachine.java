package controller;

import model.Toys;
import model.GameRoom;
import model.Toy;

import java.util.Random;

public class ToyMachine {
    private Toys toys;
    public ToyMachine(){
        toys = new Toys();
        toys.add(new Toy(2,200,"Стикер"));
        toys.add(new Toy(1,100,"Брелок"));
        toys.add(new Toy(2,300,"Матрёшка"));
        toys.add(new Toy(1,400,"Автомобиль"));
        toys.add(new Toy(2,400,"Поезд"));
        toys.add(new Toy(1,200,"Солдатик"));
    }
    public String buyToy(GameRoom gameRoom){
        Random random = new Random();
        Toy toy =toys.get(random.nextInt(toys.size()));
        gameRoom.addToy(toy);
        return "Игрушка "+toy.getName()+" добалена и игровую комнату";
    }
}
