package org.coffee_machine.coffee.ingridients.beans;

import org.coffee_machine.coffee.ingridients.beans.roast.RoastTemperature;
import org.coffee_machine.coffee.ingridients.beans.roast.RoastType;
import org.coffee_machine.coffee.ingridients.beans.type.BeanType;

public class Beans {

    private final RoastType roastType;
    private final RoastTemperature roastTemperature;
    private final BeanType beanType;

    public Beans(RoastType roastType, RoastTemperature roastTemperature, BeanType beanType) {
        this.roastType = roastType;
        this.roastTemperature = roastTemperature;
        this.beanType = beanType;
    }

    public RoastType getRoastType() {
        return roastType;
    }

    public RoastTemperature getRoastTemperature() {
        return roastTemperature;
    }

    public BeanType getBeanType() {
        return beanType;
    }
}
