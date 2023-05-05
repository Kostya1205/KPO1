package model;

public class GameRoom {
    private final Toys toys;

    public GameRoom(){
        toys=new Toys();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }
    public String priceOfAllToys(){
        return toys.priceOfAllToys();
    }

    public String weightOfAllToys(){
        return toys.weightOfAllToys();
    }
}
