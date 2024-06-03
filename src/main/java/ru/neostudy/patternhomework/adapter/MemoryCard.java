package ru.neostudy.patternhomework.adapter;

public class MemoryCard implements ICard {

  private final String data = "Memory card data";
  @Override
  public String setAndRead() {
    System.out.println("Карта памяти подключена.");
    return data;
  }
}
