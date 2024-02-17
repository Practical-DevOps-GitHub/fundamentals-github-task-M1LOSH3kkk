package CoffeeMachineSimulator;

import java.util.Scanner;

public class OptionsMachine {
    private static int money = 550;
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int disposableCups = 9;

    static void printMachineStatus() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    static void buyCoffee () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String beverage = scanner.nextLine();
        while (true) {
            switch (beverage) {
                case "1": //espresso
                    makeCoffee(250, 0, 16, 4, 1);
                    return;
                case "2": //latte
                    makeCoffee(350, 75, 20, 7, 1);
                    return;
                case "3": //cappuccino
                    makeCoffee(200, 100, 12, 6,1);
                    return;
                case "back":
                    return;
                default:
                    System.out.println("Invalid beverage!");
            }
        }

    }

    static void makeCoffee (int waterNeeded, int milkNeeded, int coffeeBeansNeeded,
                            int moneyNeeded, int disposableCupsNeeded) {
        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded
                && money >= moneyNeeded && disposableCups >= disposableCupsNeeded) {
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            money += moneyNeeded;
            disposableCups -= disposableCupsNeeded;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (waterNeeded > water) {
                System.out.println("Sorry, not enough water!");
            }
            if (milkNeeded > milk) {
                System.out.println("Sorry, not enough milk!");
            }
            if (coffeeBeansNeeded > coffeeBeans) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            if (disposableCupsNeeded > disposableCups) {
                System.out.println("Sorry, not enough disposable cups!");
            }
            if (moneyNeeded > money) {
                System.out.println("Sorry, not enough money!");
            }
        }
    }

    static void fillMachine () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int waterQuantity = scanner.nextInt();
        water = water + waterQuantity;
        System.out.println("Write how many ml of milk you want to add:");
        int milkQuantity = scanner.nextInt();
        milk = milk + milkQuantity;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeansQuantity = scanner.nextInt();
        coffeeBeans = coffeeBeans + coffeeBeansQuantity;
        System.out.println("Write how many disposable cups you want to add:");
        int disposableCupsQuantity = scanner.nextInt();
        disposableCups = disposableCups + disposableCupsQuantity;
    }

    static void takeMoney () {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
