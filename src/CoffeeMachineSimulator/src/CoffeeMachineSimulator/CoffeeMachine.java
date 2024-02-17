package CoffeeMachineSimulator;

import java.util.Scanner;

import static CoffeeMachineSimulator.OptionsMachine.*;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    printMachineStatus();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid action!");
            }
        }


    }
}
