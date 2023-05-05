package model;

import controller.Toys;
import model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyMachine {
    private Toys toys;
    public ToyMachine(){
        toys = new Toys();
        toys.addToy(new Toy(2,200,"Стикер"));
        toys.addToy(new Toy(1,100,"Брелок"));
        toys.addToy(new Toy(2,300,"Матрёшка"));
        toys.addToy(new Toy(1,400,"Автомобиль"));
        toys.addToy(new Toy(2,400,"Поезд"));
        toys.addToy(new Toy(1,200,"Солдатик"));
    }
    public String buyToy(GameRoom gameRoom){
        Random random = new Random();
        Toy toy =toys.getToy(random.nextInt(toys.size()));
        if(toy.getPrice()==price)
            return toy;
        if(toy!=null) {
            gameRoom.addToy(toy);
            return "Игрушка "+toy.getName()+" добалена и игровую комнату";
        }else return "Нет игрушки с такой ценой ("+price+")";
    }
}
