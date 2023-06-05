package org.example.machine;

import org.example.coffee.*;

public abstract class CoffeeMachine implements AverageCoffeeMachine, CoffeeRoastTemperature {

    private WaterType waterType;
    private CoffeeRoast roast;
    private CoffeeBeanType beanType;
    private Coffee coffee;
    private float temperature = 90;

    public CoffeeMachine(WaterType waterType, CoffeeRoast roast, CoffeeBeanType beanType) {
        this.waterType = waterType;
        this.roast = roast;
        this.beanType = beanType;
    }




    @Override
    abstract public void start();

    @Override
    abstract public void stop();

    @Override
    abstract public void pause();




    @Deprecated
    public void defineCoffeeTemperature() {
        if (roast == CoffeeRoast.LIGHT) temperature = LIGHT;
        if (roast == CoffeeRoast.MEDIUM) temperature = MEDIUM;
        if (roast == CoffeeRoast.DARK) temperature = DARK;
        if (roast == CoffeeRoast.COAL) temperature = COAL;
    }

    public void showCoffeeConfiguration() {
        System.out.println("================Your coffee is ready!================");

        displayFormattedConfigurationField("Bean", beanType);
        displayFormattedConfigurationField("Roast", roast);
        displayFormattedConfigurationField("Water", waterType);
    }




    private <T> void displayFormattedConfigurationField(String message, T t) {
        System.out.println(message + ": " + t.toString().substring(0, 1).toUpperCase() + t.toString().substring(1).toLowerCase());
    }




    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    public CoffeeRoast getRoast() {
        return roast;
    }

    public void setRoast(CoffeeRoast roast) {
        this.roast = roast;
    }

    public CoffeeBeanType getBeanType() {
        return beanType;
    }

    public void setBeanType(CoffeeBeanType beanType) {
        this.beanType = beanType;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
