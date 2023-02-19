package coffee_machine;

import java.util.Scanner;

public class Util {
    public static void coffeeMachineMenu(Coffee c) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = sc.nextLine();

            switch (input) {
                case "buy":
                    c.buyCoffee();
                    break;

                case "fill":
                    c.fillCoffee();
                    break;

                case "take":
                    System.out.printf("I gave you %d$\n", c.getMoney());
                    c.setMoney(0);
                    System.out.println();
                    break;

                case "remaining":
                    System.out.println();
                    c.printCoffeeStats();
                    break;

                case "exit":
                    isTrue = false;
                    break;
                }
        }
    }


    public static boolean isEnough(Coffee c, String inp) {
        //Input 1 equals espresso
        if (inp.equals("1")) {
            if (c.getWater() < 250) {
                System.out.println("Sorry, not enough water!");
                return false;
            } else if (c.getCoffeeBeans() < 16) {
                System.out.println("Sorry, not enough coffee beans!");
                return false;
            } else if (c.getPlastCups() < 1) {
                System.out.println("Sorry, not enough cups!");
                return false;
            }
        }

        //Input 2 equals latte
        if (inp.equals("2")) {
            if (c.getWater() < 350) {
                System.out.println("Sorry, not enough water!");
                return false;
            } else if (c.getMilk() < 75) {
                System.out.println("Sorry, not enough milk!");
                return false;
            } else if (c.getCoffeeBeans() < 20) {
                System.out.println("Sorry, not enough coffee beans!");
                return false;
            } else if (c.getPlastCups() < 1) {
                System.out.println("Sorry, not enough cups!");
                return false;
            }
        }

        //Input 3 equals cappuccino
        if (inp.equals("3")) {
            if (c.getWater() < 200) {
                System.out.println("Sorry, not enough water!");
                return false;
            } else if (c.getMilk() < 100) {
                System.out.println("Sorry, not enough milk!");
                return false;
            } else if (c.getCoffeeBeans() < 12) {
                System.out.println("Sorry, not enough coffee beans!");
                return false;
            } else if (c.getPlastCups() < 1) {
                System.out.println("Sorry, not enough cups!");
                return false;
            }
        }
        return true;
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
//======================================================================================================================
//No longer used methods go here

/*public void makeBeanJuice() {
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


    */
