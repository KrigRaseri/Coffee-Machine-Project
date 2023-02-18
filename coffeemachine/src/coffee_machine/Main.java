package coffee_machine;

public class Main extends Coffee {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(askWater(), askMilk(), askBeans());
        coffee.makeBeanJuice();
    }
}
