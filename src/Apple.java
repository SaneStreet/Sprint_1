//SUBCLASS Apple
public class Apple extends Fruit {

    //Nedarver alt fra Fruit

    //Main metode der laver objekter fra Fruit og tilkobler sig til metoden help fra Fruit
    public static void main(String[] args) {

        //Banana object
        Banana banana = new Banana();
        //Nedarver metoden help fra Fruit
        //Overridden - Se Banana
        banana.help();

        //Apple object
        Apple apple = new Apple();
        //Nedarver metoden help fra Fruit
        //Not overridden.
        apple.help();

        //Kiwi object
        Kiwi kiwi = new Kiwi();
        //Nedarver metoden help fra Fruit
        //Overridden - Se Kiwi
        kiwi.help();
    }

}
