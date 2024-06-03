package ru.neostudy.patternhomework.factory;

import lombok.Setter;

public class Espresso extends Coffee {

  @Setter
  int beanAmount = 20;
  public Espresso(String name, float temperature) {
    super(name, temperature);
  }
}
