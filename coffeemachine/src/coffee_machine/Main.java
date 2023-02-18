package coffee_machine;

public class Main extends Coffee {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(400, 540, 120, 9, 540);

        Util.coffeeMachineMenu(coffee);

    }
}
