package org.coffee_machine.machine;

import org.coffee_machine.coffee.ingridients.additive.AdditiveIngredients;
import org.coffee_machine.coffee.ingridients.beans.Beans;
import org.coffee_machine.coffee.ingridients.result.CupOfCoffee;
import org.coffee_machine.user_interface.UserInterface;

import java.util.List;

public class MyCoffeeMachine extends AverageCoffeeMachine {
    private final UserInterface userInterface;
    private Beans beans;
    private List<AdditiveIngredients> additiveIngredientsList;
    private CupOfCoffee cupOfCoffee;

    public MyCoffeeMachine(Beans beans, List<AdditiveIngredients> additiveIngredientsList) {
        this.beans = beans;
        this.additiveIngredientsList = additiveIngredientsList;
        userInterface = new UserInterface();
    }

    @Override
    public void start() {
        userInterface.sayHello("==========My Coffee Machine started!==========");
        createCupOfCoffee();
        showCoffeeConfiguration();
    }

    @Override
    void pause() {

    }

    @Override
    void stop() {

    }

    private void createCupOfCoffee() {
        beans.defineCoffeeTemperature();

        cupOfCoffee = new CupOfCoffee("Cap", beans, additiveIngredientsList);
    }

    public void showCoffeeConfiguration() {
        System.out.println("Capacity: " + cupOfCoffee.getCapacity());
        beans.showConfiguration();
        showAdditiveIngredientsConfiguration();
    }

    private void showAdditiveIngredientsConfiguration() {
        for (AdditiveIngredients ingredient : additiveIngredientsList)
            System.out.println("Additive ingredient: " + ingredient);
    }
    
}
