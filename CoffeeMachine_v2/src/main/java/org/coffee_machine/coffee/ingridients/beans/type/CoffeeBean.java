package org.coffee_machine.coffee.ingridients.beans.type;

public abstract class CoffeeBean {

    private boolean isBitter;
    private double caffeineLevel;

    public CoffeeBean() {}

    public boolean isBitter() {
        return isBitter;
    }

    public void setBitter(boolean bitter) {
        isBitter = bitter;
    }

    public double getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(float caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }
}
