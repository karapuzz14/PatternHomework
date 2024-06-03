package ru.neostudy.patternhomework.adapter;

public class CardAdapter implements IBus {

  private final MemoryCard memoryCard;

  public CardAdapter(MemoryCard memoryCard) {
    this.memoryCard = memoryCard;
  }

  @Override
  public String setAndRead() {
    return memoryCard.setAndRead();
  }
}
