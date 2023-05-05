package controller;

import model.GameRoom;

public class Creator {
    public static GameRoom createGameRoom(){
        GameRoom gameRoom = new GameRoom();
        ToyMachine toyMachine = new ToyMachine();
        for (int i = 0; i < 30; i++)
            System.out.println(toyMachine.buyToy(gameRoom));
        return gameRoom;
    }
}
