//SUBCLASS Apple
public class Apple extends Fruit {

    //Nedarver alt fra Fruit

    //Main metode der laver objekter fra Fruit og tilkobler sig til metoden help fra Fruit
    public static void main(String[] args) {

        //Banana object
        Banana banana = new Banana();
        //Nedarver metoden help fra Fruit
        banana.help();

        //Apple object
        Apple apple = new Apple();
        //Nedarver metoden help fra Fruit
        apple.help();
    }

}
