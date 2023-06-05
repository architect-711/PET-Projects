package org.example.machine;

import org.example.coffee.*;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

public class MyCoffeeMachine extends CoffeeMachine {

    private WaterType waterType;
    private CoffeeRoast roast;
    private CoffeeBeanType beanType;
    private Coffee coffee;
    private float temperature;

    public MyCoffeeMachine(WaterType waterType, CoffeeRoast roast, CoffeeBeanType beanType) {
        super(waterType, roast, beanType);
    }




    @Override
    public void start() {
        System.out.println("================Making a cup of coffee for you================");

        defineCoffeeTemperature();
        coffee = new Coffee(beanType, temperature, roast, waterType);

        showCoffeeConfiguration();
    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

}
