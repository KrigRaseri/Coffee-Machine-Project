package coffee_machine;

import java.util.Scanner;

public class Coffee {
    private int coffeeBeans;
    private int water;
    private int milk;
    private int plastCups;
    private int money;

    //Methods
    public void printCoffeeStats() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", getWater(), getMilk(), getCoffeeBeans(), getPlastCups(), getMoney());

        System.out.println();
    }


    //Method to fill the coffee machine with chosen ingredients.
    public void fillCoffee() {
        setWater(getWater() + Util.askWater());
        setMilk(getMilk() + Util.askMilk());
        setCoffeeBeans(getCoffeeBeans() + Util.askBeans());
        setPlastCups(getPlastCups() + Util.askCups());
        System.out.println();
    }


    //Method to handle buying the chosen coffees. Calls isEnough to check if there are enough ingredients.
    public void buyCoffee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String inp = sc.nextLine();

        switch (inp) {
            case "1":
                if (!Util.isEnough(this, inp)) {break;}
                setWater(getWater() - 250);
                setCoffeeBeans(getCoffeeBeans() - 16);
                setPlastCups(getPlastCups() - 1);
                setMoney(getMoney() + 4);
                System.out.println("I have enough resources, making you a coffee!");
                break;

            case "2":
                if (!Util.isEnough(this, inp)) {break;}
                setWater(getWater() - 350);
                setMilk(getMilk() - 75);
                setCoffeeBeans(getCoffeeBeans() - 20);
                setPlastCups(getPlastCups() - 1);
                setMoney(getMoney() + 7);
                System.out.println("I have enough resources, making you a coffee!");
                break;

            case "3":
                if (!Util.isEnough(this, inp)) {break;}
                setWater(getWater() - 200);
                setMilk(getMilk() - 100);
                setCoffeeBeans(getCoffeeBeans() - 12);
                setPlastCups(getPlastCups() - 1);
                setMoney(getMoney() + 6);
                System.out.println("I have enough resources, making you a coffee!");
                break;

            case "back":
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
