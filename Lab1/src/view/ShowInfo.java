package view;

import model.GameRoom;
import controller.ToyMachine;

public class ShowInfo {
    public ShowInfo(GameRoom gameRoom){
        System.out.println(gameRoom.priceOfAllToys());
        System.out.println(gameRoom.weightOfAllToys());
        System.out.println(gameRoom.toyWithMaxPrice());
        System.out.println(gameRoom.toyWithMaxWeight());
    }
}
