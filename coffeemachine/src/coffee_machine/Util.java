package coffee_machine;

import java.util.Scanner;

public class Util {


    public static void coffeeMachineMenu(Coffee c) {
        Scanner sc = new Scanner(System.in);
        c.printCoffeeStats();
        System.out.println("Write action (buy, fill, take):");
        String input = sc.nextLine();

        switch (input) {
            case "buy":
                c.buyCoffee();
                c.printCoffeeStats();
                break;

            case "fill":
                c.fillCoffee();
                c.printCoffeeStats();
                break;

            case "take":
                System.out.printf("I gave you %d$\n", c.getMoney());
                c.setMoney(0);
                System.out.println();
                c.printCoffeeStats();
                break;
            }

    }

    public static int askWater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        System.out.print("> ");
        return sc.nextInt();
    }

    public static int askMilk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of milk you want to add:");
        System.out.print("> ");
        return sc.nextInt();
    }

    public static int askBeans() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans you want to add:");
        System.out.print("> ");
        return sc.nextInt();
    }

    public static int askCups() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many disposable cups you want to add:");
        System.out.print("> ");
        return sc.nextInt();
    }


}

