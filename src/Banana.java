//SUBCLASS Banana
public class Banana extends Fruit {

    //Nedarver alt fra Fruit

    //Overriding a method from superclass (Fruit)
    //Hvis man vil override en metode fra en superclass, kan man ændre i metoden, ved at indsætte den i selve klassen.
    //I dette tilfælde overrides metoden help fra Fruit, ved at skrive noget andet, end det originale:
    public void help(){
        System.out.println("Hjælp, jeg er en Banan!");
    }

    //Overloading a method from superclass (Fruit)
    //Hvis man vil overloade en metode fra en superclass, skal man indsætte værdier i parameterne.
    //Dvs. hvis vi ændrer parameterne i metoden help fra Fruit, så overloader vi metoden:
    //Whenever you override a method you have to take the same arguments and the same return types
    public void help(int i){
        System.out.println("Jeg er en Banan");
    }
}
