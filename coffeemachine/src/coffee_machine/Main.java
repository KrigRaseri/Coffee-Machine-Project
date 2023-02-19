package coffee_machine;

public class Main extends Coffee {
    public static void main(String[] args) {
        //Coffee constructor.
        Coffee coffee = new Coffee(400, 540, 120, 9, 540);

        //Runs the coffee machine menu.
        Util.coffeeMachineMenu(coffee);

    }
}
