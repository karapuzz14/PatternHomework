package ru.neostudy.patternhomework.adapter;

public class USB implements IBus {

  private final String data = "USB data";
  @Override
  public String setAndRead() {
    System.out.println("USB подключен.");
    return data;
  }
}
