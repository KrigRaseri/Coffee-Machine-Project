package coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee {
    private int coffeeBeans;
    private int water;
    private int milk;

    //Methods
    public void makeBeanJuice() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write how many cups of coffee you will need:");
        System.out.println("> ");

        try {
            int cups = Integer.parseInt(reader.readLine());
            setWater(200 * cups); //In ml (milliliters).
            setMilk(50 * cups); //In ml (milliliters).
            setCoffeeBeans(15 * cups); //In g (grams).

            System.out.printf("For %d cups of coffee you will need:\n", cups);
            System.out.printf("%d ml of water\n", getWater());
            System.out.printf("%d ml of milk\n", getMilk());
            System.out.printf("%d g of coffee beans\n", getCoffeeBeans());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Constructors
    public Coffee() {}

    public Coffee(int coffeeBeans, int water, int milk) {
        this.coffeeBeans = coffeeBeans;
        this.water = water;
        this.milk = milk;
    }


    //Getters and Setters
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
