package org.example.coffee;

public class Coffee {

    private CoffeeBeanType beanType;
    private float temperature;
    private CoffeeRoast roast;
    private WaterType waterType;

    public Coffee(CoffeeBeanType beanType, float temperature, CoffeeRoast roast, WaterType waterType) {
        this.beanType = beanType;
        this.temperature = temperature;
        this.roast = roast;
        this.waterType = waterType;
    }




    public CoffeeBeanType getBeanType() {
        return beanType;
    }

    public void setBeanType(CoffeeBeanType beanType) {
        this.beanType = beanType;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public CoffeeRoast getRoast() {
        return roast;
    }

    public void setRoast(CoffeeRoast roast) {
        this.roast = roast;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

}
