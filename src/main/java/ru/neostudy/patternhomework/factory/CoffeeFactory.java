package ru.neostudy.patternhomework.factory;

public class CoffeeFactory {

  public Coffee createCoffee(CoffeeType type)
  {
    Coffee coffee = switch (type) {
      case AMERICANO -> new Americano("Американо", 90f);
      case ESPRESSO -> new Espresso("Эспрессо", 94f);
    };

    return coffee;
  }
}
