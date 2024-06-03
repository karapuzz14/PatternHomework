package ru.neostudy.patternhomework.factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Coffee {
  String name;
  float temperature;

  public void grindBeans() {
    System.out.println("Перемолоты зёрна " + name);
  }

  public void boil() {
    System.out.println("Разогрето до температуры " + temperature + " градусов Цельсия");
  }

  public void fillCup() {
    System.out.println("Кофе " + name + " готов!");
  }
}
