package view;

import model.GameRoom;
import model.ToyMachine;

public class ShowInfo {
    public ShowInfo(GameRoom gameRoom){
        ToyMachine toyMachine = new ToyMachine();
        System.out.println(toyMachine.buyToy(1,gameRoom));
        System.out.println(toyMachine.buyToy(2,gameRoom));
        System.out.println(toyMachine.buyToy(1,gameRoom));
        System.out.println(toyMachine.buyToy(2,gameRoom));

        System.out.println(gameRoom.priceOfAllToys());
        System.out.println(gameRoom.weightOfAllToys());
    }
}
