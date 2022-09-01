package machine;

import java.util.Scanner;



public class CoffeeMachine {
    public static void main(String[] args) {
        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
         */
        /*
        System.out.println("Write how many cups of coffee you will need:");
        Scanner userInput = new Scanner(System.in);
        final int waterPerCup = 200;
        final int milkPerCup = 50;
        final int beansPerCup = 15;
        int numberOfCups = userInput.nextInt();
        System.out.println("For " + numberOfCups + "cups of coffee you will need:");
        System.out.println(waterPerCup * numberOfCups + " ml of water");
        System.out.println(milkPerCup * numberOfCups + " ml of milk");
        System.out.println(beansPerCup * numberOfCups + " g of coffee beans");

        final int waterPerCup = 200;
        final int milkPerCup = 50;
        final int beansPerCup = 15;
         */

        final int espressoWater = 250;
        final int espressoBeans = 16;
        final int espressoCost = 4;

        final int latteWater = 350;
        final int latteMilk = 75;
        final int latteBeans = 20;
        final int latteCost = 7;

        final int cappuccinoWater = 200;
        final int cappuccinoMilk = 100;
        final int cappuccinoBeans = 12;
        final int cappuccinoCost = 6;

        int cashInMachine = 550;
        int waterInMachine = 400;
        int milkInMachine = 540;
        int beansInMachine = 120;
        int cupsInMachine = 9;

        Scanner userInput = new Scanner(System.in);
        String optionSelect = "blank";

        while (!optionSelect.equals("exit")) {
            System.out.println("Write action (buy, fill, take):");
            optionSelect = userInput.nextLine();
            switch (optionSelect) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String beverageOfChoice = userInput.nextLine();
                    switch (beverageOfChoice) {
                        case "1":
                            if (waterInMachine < espressoWater) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beansInMachine < espressoBeans) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cupsInMachine == 0) {
                                System.out.println("Sorry, not disposable cups!");
                            } else {
                                waterInMachine -= espressoWater;
                                beansInMachine -= espressoBeans;
                                cashInMachine += espressoCost;
                                cupsInMachine -= 1;
                            }
                            break;
                        case "2":
                            if (waterInMachine < latteWater) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beansInMachine < latteBeans) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (milkInMachine < latteMilk) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (cupsInMachine == 0) {
                                System.out.println("Sorry, not disposable cups!");
                            } else {
                                waterInMachine -= latteWater;
                                milkInMachine -= latteMilk;
                                beansInMachine -= latteBeans;
                                cashInMachine += latteCost;
                                cupsInMachine -= 1;
                            }
                            break;
                        case "3":
                            if (waterInMachine < cappuccinoWater) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beansInMachine < cappuccinoBeans) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (milkInMachine < cappuccinoMilk) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (cupsInMachine == 0) {
                                System.out.println("Sorry, not disposable cups!");
                            } else {
                                waterInMachine -= cappuccinoWater;
                                milkInMachine -= cappuccinoMilk;
                                beansInMachine -= cappuccinoBeans;
                                cashInMachine += cappuccinoCost;
                                cupsInMachine -= 1;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    waterInMachine += userInput.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milkInMachine += userInput.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beansInMachine += userInput.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    cupsInMachine += userInput.nextInt();

                    break;
                case "take":
                    System.out.println("I gave you $" + cashInMachine);
                    cashInMachine = 0;

                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(waterInMachine + " ml of water");
                    System.out.println(milkInMachine + " ml of milk");
                    System.out.println(beansInMachine + " g of coffee beans");
                    System.out.println(cupsInMachine + " disposable cups");
                    System.out.println("$" + cashInMachine + " of money");
            }
        }
        /*
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInMachine = userInput.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInMachine = userInput.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansInMachine = userInput.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups = userInput.nextInt();

        int maxWater = waterInMachine / waterPerCup;
        int maxMilk = milkInMachine / milkPerCup;
        int maxBeans = beansInMachine / beansPerCup;

        int findTheSmallest = maxWater > maxMilk ? (maxMilk < maxBeans ? maxMilk : maxBeans) :
                (maxWater < maxBeans ? maxWater : maxBeans) ;

        if (findTheSmallest == numberOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (findTheSmallest > numberOfCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (findTheSmallest - 1) + "more than that)");
        }
        else {
            System.out.println("No, I can make only " + findTheSmallest + " cup(s) of coffee");
        }
         */
    }
}
