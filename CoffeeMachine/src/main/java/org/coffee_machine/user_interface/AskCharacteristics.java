package org.coffee_machine.user_interface;

import org.coffee_machine.coffee.ingridients.additive.AdditiveIngredients;
import org.coffee_machine.coffee.ingridients.beans.Beans;
import org.coffee_machine.coffee.ingridients.beans.roast.RoastType;
import org.coffee_machine.coffee.ingridients.beans.type.BeanType;
import org.coffee_machine.machine.MyCoffeeMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AskCharacteristics {

    private final Scanner scanner;
    private Beans beans;
    private List<AdditiveIngredients> additiveIngredientsList;

    public AskCharacteristics() {
        scanner = new Scanner(System.in);
        beans = new Beans();
        additiveIngredientsList = new ArrayList<>();
    }

    public void askRequirements() {
        System.out.println("================Hello dear user, which coffee do you desire?================");

        try {
            askBeanType();
            askRoastType();
            askAdditiveIngredients();

            sendDataToCoffeeMachine();
        } catch (RuntimeException exception) {
            System.out.println("================" + exception.getMessage() + "================");
        }

    }



    private void askBeanType() {
        String userBeanType = askUser("Coffee bean type [arabica, robusta]");

        beans.setBeanType(BeanType.valueOf(userBeanType.toUpperCase()));
    }

    private void askRoastType() {
        String userRoastType = askUser("Roast type [light, medium, dark]");

        beans.setRoastType(RoastType.valueOf(userRoastType.toUpperCase()));
    }

    private void askAdditiveIngredients() {
        int additiveIngredientsNumber = Integer.parseInt(askUser("How much additive ingredients"));

        while (additiveIngredientsNumber > 0) {
            String userAdditiveIngredient = askUser("Additive ingredients [whipped_cream, caramel, lemon_juice, water, whiskey, milk, frothed_milk, chocolate, espresso]");
            additiveIngredientsList.add(AdditiveIngredients.valueOf(userAdditiveIngredient.toUpperCase()));

            additiveIngredientsNumber--;
        }
    }

    private void sendDataToCoffeeMachine() {
        MyCoffeeMachine myCoffeeMachine = new MyCoffeeMachine(beans, additiveIngredientsList);

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
