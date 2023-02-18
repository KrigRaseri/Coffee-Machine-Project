package coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Coffee {
    private int coffeeBeans;
    private int water;
    private int milk;
    private int plastCups;
    private int money;

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

    public void printCoffeeStats() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", getWater(), getMilk(), getCoffeeBeans(), getPlastCups(), getMoney());

        System.out.println();
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



    public void fillCoffee() {
        setWater(getWater() + Util.askWater());
        setMilk(getMilk() + Util.askMilk());
        setCoffeeBeans(getCoffeeBeans() + Util.askBeans());
        setPlastCups(getPlastCups() + Util.askCups());
        System.out.println();
    }



    public void buyCoffee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int inp = sc.nextInt();

        switch (inp) {
            case 1:
                setWater(getWater() - 250);
                setCoffeeBeans(getCoffeeBeans() - 16);
                setPlastCups(getPlastCups() - 1);
                setMoney(getMoney() + 4);
                break;

            case 2:
                setWater(getWater() - 350);
                setMilk(getMilk() - 75);
                setCoffeeBeans(getCoffeeBeans() - 20);
                setPlastCups(getPlastCups() - 1);
                setMoney(getMoney() + 7);
                break;

            case 3:
                setWater(getWater() - 200);
                setMilk(getMilk() - 100);
                setCoffeeBeans(getCoffeeBeans() - 12);
                setPlastCups(getPlastCups() - 1);
                setMoney(getMoney() + 6);
                break;

        }
    }



    //Constructors
    public Coffee() {}

    public Coffee(int water, int milk, int beans) {
        this.coffeeBeans = beans;
        this.water = water;
        this.milk = milk;
    }

    public Coffee(int water, int milk, int beans, int plastCups, int money) {
        this.coffeeBeans = beans;
        this.water = water;
        this.milk = milk;
        this.plastCups = plastCups;
        this.money = money;
    }



    //Getters, Setters.
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

    public int getPlastCups() {
        return plastCups;
    }

    public void setPlastCups(int plastCups) {
        this.plastCups = plastCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
