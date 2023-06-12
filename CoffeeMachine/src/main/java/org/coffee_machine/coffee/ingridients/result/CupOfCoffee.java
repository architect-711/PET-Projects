package org.coffee_machine.coffee.ingridients.result;

import org.coffee_machine.coffee.ingridients.additive.AdditiveIngredients;
import org.coffee_machine.coffee.ingridients.beans.Beans;

import java.util.List;

public class CupOfCoffee {

    private String capacity;
    private Beans beans;
    private List<AdditiveIngredients> additiveIngredientsList;

    public CupOfCoffee(String capacity, Beans beans, List<AdditiveIngredients> additiveIngredientsList) {
        this.capacity = capacity;
        this.beans = beans;
        this.additiveIngredientsList = additiveIngredientsList;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Beans getBeans() {
        return beans;
    }

    public void setBeans(Beans beans) {
        this.beans = beans;
    }

    public List<AdditiveIngredients> getAdditiveIngredientsList() {
        return additiveIngredientsList;
    }

    public void setAdditiveIngredientsList(List<AdditiveIngredients> additiveIngredientsList) {
        this.additiveIngredientsList = additiveIngredientsList;
    }
}
