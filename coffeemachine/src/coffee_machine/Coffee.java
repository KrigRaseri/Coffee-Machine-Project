package coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Coffee {
    private int coffeeBeans;
    private int water;
    private int milk;

    //Methods
    public void makeBeanJuice() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");

        try {
            int cups = Integer.parseInt(reader.readLine());
            int totalCups = totalCups(getWater(), getMilk(), getCoffeeBeans());

            if (cups == totalCups) { System.out.println("Yes, I can make that amount of coffee"); }

            else if (cups < totalCups) {
                System.out.printf("Yes, I can make that amount of coffee " +
                        "(and even %d more than that)\n", totalCups - cups);
            }

            else {
                System.out.printf("No, I can make only %d cup(s) of coffee\n", totalCups);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private int totalCups(int water, int milk, int BEANS) {
        int cupCount = 0;
        int waterAmount = water;
        int milkAmount = milk;
        int beanAmount = BEANS;

        while (true) {
            if (waterAmount - 200 < 0) {
                break;
            } else {
                waterAmount -= 200;
            }

            if (milkAmount - 50 < 0) {
                break;
            } else {
                milkAmount -= 50;
            }

            if (beanAmount - 15 < 0) {
                break;
            } else {
                beanAmount -= 15;
            }

            cupCount++;
        }

        return cupCount;
    }




    //Constructors
    public Coffee() {}

    public Coffee(int water, int milk, int beans) {
        this.coffeeBeans = beans;
        this.water = water;
        this.milk = milk;
    }


    //Getters, Setters, Askers.
    public static int askWater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        return sc.nextInt();
    }

    public static int askMilk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print("> ");
        return sc.nextInt();
    }

    public static int askBeans() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print("> ");
        return sc.nextInt();
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }
}
