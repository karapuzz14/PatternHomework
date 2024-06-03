package ru.neostudy.patternhomework.factory;

public class CoffeeShop {

  private final CoffeeFactory factory;

  public CoffeeShop(CoffeeFactory factory) {
    this.factory = factory;
  }

  public Coffee makeCoffee(CoffeeType type)
  {
    Coffee coffee = factory.createCoffee(type);
    coffee.grindBeans();
    coffee.boil();
    coffee.fillCup();

    return coffee;
  }
}
