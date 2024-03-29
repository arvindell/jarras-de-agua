package com.alexvilchis.jarras;

public class Jug {

  private int volume;

  private int capacity;

  private String label;

  public Jug(int volume, int capacity, String label) {
    this.volume = volume;
    this.capacity = capacity;
    this.label = label;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return "Jug{" +
        "volume=" + volume +
        ", capacity=" + capacity +
        ", label='" + label + '\'' +
        '}';
  }
}
