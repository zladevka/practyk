package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.Watercraft;

abstract class Motorboat implements Watercraft {
  private String name;

  public Motorboat(String name) {
    this.name = name;
  }

  public void move() {
    System.out.println(name + " рухається по воді з високою швидкістю");
  }

  public void floatOnWater() {
    System.out.println(name + " плаває в річці");
  }

  class Boat implements Watercraft {
    private String name;

    public Boat(String name) {
      this.name = name;
    }

    public void move() {
      System.out.println(name + " плаває в річці");
    }

    public void floatOnWater() {
      System.out.println(name + " плаває в річці");
    }
  }

  class Barge implements Watercraft {
    private String name;

    public Barge(String name) {
      this.name = name;
    }

    public void move() {
      System.out.println(name + " рухається повільно по воді");
    }

    public void floatOnWater() {
      System.out.println(name + " плаває на річці");
    }
  }

}
