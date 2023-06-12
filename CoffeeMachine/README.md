# CoffeeMachine project (done)
## What is it?
CoffeeMachine project is a completed version of an Idea about Coffee Machine Math Model.

## Features
It can make a cup of coffee. First case of using Abstract classes and Interfaces simultaneously.


## How does it work?
Essence:
- Ask user about prefer coffee beans, roast and additive ingredients
- Define Coffee temperature
- Show all cup of tea data

## Internal organization
### Enums:
1. Bean types contains: *ARABICA, ROBUSTA*
2. Roast types: *LIGHT, MEDIUM, DARK, COAL*
3. Ingredients: *WHIPPED_CREAM, CARAMEL, LEMON_JUICE, WATER, WHISKEY, MILK, FROTHED_MILK, CHOCOLATE, ESPRESSO*

### Classes:
4. Define coffee temperature is a method in Beans.java
```java
@Deprecated
public void defineCoffeeTemperature() {
    if (roastType == RoastType.LIGHT)  roastTemperature = RoastTemperature.LIGHT;
    if (roastType == RoastType.MEDIUM) roastTemperature = RoastTemperature.MEDIUM;
    if (roastType == RoastType.DARK)   roastTemperature = RoastTemperature.DARK;
}
```

5. Show all cup of tea data is separated methods which call from one method in the MyCoffeeMachine.java
```java
public void showCoffeeConfiguration() {...}
```