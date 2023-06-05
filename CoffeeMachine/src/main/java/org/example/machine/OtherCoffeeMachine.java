package org.example.machine;

import org.example.coffee.*;

public class OtherCoffeeMachine extends CoffeeMachine {

    private WaterType waterType;
    private CoffeeRoast roast;
    private CoffeeBeanType beanType;
    private Coffee coffee;
    private float temperature;

    public OtherCoffeeMachine(WaterType waterType, CoffeeRoast roast, CoffeeBeanType beanType) {
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
