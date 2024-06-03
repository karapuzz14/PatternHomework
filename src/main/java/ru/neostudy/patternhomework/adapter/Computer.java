package ru.neostudy.patternhomework.adapter;

public class Computer {
  public void connect(IBus bus) {
    String data = bus.setAndRead();
    System.out.println("Компьютер был подключен. Считана информация: " + data);
  }
}
