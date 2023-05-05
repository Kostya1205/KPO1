import model.GameRoom;
import model.ToyMachine;

public class Main {
    public static void main(String[] args) {
        GameRoom gameRoom = new GameRoom();
        ToyMachine toyMachine = new ToyMachine();
        System.out.println(toyMachine.buyToy(1,gameRoom));
        System.out.println(toyMachine.buyToy(2,gameRoom));
        System.out.println(toyMachine.buyToy(1,gameRoom));
        System.out.println(toyMachine.buyToy(2,gameRoom));

        System.out.println(gameRoom.priceOfAllToys());
        System.out.println(gameRoom.weightOfAllToys());
    }
}