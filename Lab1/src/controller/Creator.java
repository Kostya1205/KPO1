package controller;

import model.GameRoom;

public class Creator {
    public static GameRoom CreateGameRoom(){
        return new GameRoom();
    }
    public static void AddToyInRoom(GameRoom gameRoom){
        gameRoom.addToy();
    }
}
