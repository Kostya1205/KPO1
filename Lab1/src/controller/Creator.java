package controller;

import model.GameRoom;

public class Creator {
    public static GameRoom CreateGameRoom(){
        GameRoom gameRoom = new GameRoom();
        ToyMachine toyMachine = new ToyMachine();
        for (int i = 0; i < 30; i++)
            toyMachine.buyToy(gameRoom);
        return new GameRoom();
    }
}
