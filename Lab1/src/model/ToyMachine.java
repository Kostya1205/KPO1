package model;

import controller.Toys;
import model.Toy;

public class ToyMachine {
    public String buyToy(int price, GameRoom gameRoom){
        Toys toys = new Toys();
        Toy toy = toys.getRandomToy(price);
        if(toy!=null) {
            gameRoom.addToy(toy);
            return "Игрушка "+toy.getName()+" добалена и игровую комнату";
        }else return "Нет игрушки с такой ценой ("+price+")";
    }
}
