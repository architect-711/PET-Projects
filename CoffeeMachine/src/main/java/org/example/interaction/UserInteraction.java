package org.example.interaction;

import org.example.coffee.CoffeeBeanType;
import org.example.coffee.CoffeeRoast;
import org.example.coffee.WaterType;
import org.example.machine.MyCoffeeMachine;

import java.util.Scanner;

public class UserInteraction {

    private Scanner scanner;
    private WaterType waterType;
    private CoffeeRoast roast;
    private CoffeeBeanType beanType;

    public UserInteraction() {
        scanner = new Scanner(System.in);
    }




    public void startCoffeeMachine() {
        askRequirements();
    }




    private void askRequirements() {
        System.out.println("================Hello dear user, which coffee do you desire?================");

        try {
            askBeanType();
            askRoastType();
            askWaterType();

            sendDataToCoffeeMachine();
        } catch (RuntimeException exception) {
            System.out.println("================" + exception.getMessage() + "================");
        }

    }

    private void askWaterType() {
        String userWaterType = askUser("Water type [filtered, mineral, tap]");

        waterType = WaterType.valueOf(userWaterType.toUpperCase());
    }

    private void askRoastType() {
        String userRoastType = askUser("Roast type [light, medium, dark, coal]");

        roast = CoffeeRoast.valueOf(userRoastType.toUpperCase());
    }

    private void askBeanType() {
        String userBeanType = askUser("Coffee bean type [arabica, robusta]");

        beanType = CoffeeBeanType.valueOf(userBeanType.toUpperCase());
    }

    private void sendDataToCoffeeMachine() {
        MyCoffeeMachine myCoffeeMachine = new MyCoffeeMachine(waterType, roast, beanType);

        myCoffeeMachine.start();
    }

    private String askUser(String question) {
        System.out.print(question + ": ");
        String answer = scanner.nextLine();

        if (!answer.isEmpty()) {
            return answer;
        }
        throw new RuntimeException("Answer cannot be empty!");
    }

}
