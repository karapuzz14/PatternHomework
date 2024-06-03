package ru.neostudy.patternhomework.factory;

import lombok.Setter;

public class Americano extends Coffee {

  @Setter
  private int waterAmount = 200;

  public Americano(String name, float temperature) {
    super(name, temperature);
  }


}
