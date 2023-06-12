package org.coffee_machine.coffee.ingridients.beans;

import org.coffee_machine.coffee.ingridients.beans.roast.RoastTemperature;
import org.coffee_machine.coffee.ingridients.beans.roast.RoastType;
import org.coffee_machine.coffee.ingridients.beans.type.BeanType;

public class Beans {

    private RoastType roastType;
    private float roastTemperature;
    private BeanType beanType;

    public Beans() {}


    @Deprecated
    public void defineCoffeeTemperature() {
        if (roastType == RoastType.LIGHT)  roastTemperature = RoastTemperature.LIGHT;
        if (roastType == RoastType.MEDIUM) roastTemperature = RoastTemperature.MEDIUM;
        if (roastType == RoastType.DARK)   roastTemperature = RoastTemperature.DARK;
    }

    public void showConfiguration() {
        System.out.println("Roast type: " + roastType);
        System.out.println("Roast temperature: " + roastTemperature);
        System.out.println("Bean type: " + beanType);
    }


    public void setRoastType(RoastType roastType) {
        this.roastType = roastType;
    }

    public void setRoastTemperature(float roastTemperature) {
        this.roastTemperature = roastTemperature;
    }

    public void setBeanType(BeanType beanType) {
        this.beanType = beanType;
    }

    public RoastType getRoastType() {
        return roastType;
    }

    public float getRoastTemperature() {
        return roastTemperature;
    }

    public BeanType getBeanType() {
        return beanType;
    }
}
