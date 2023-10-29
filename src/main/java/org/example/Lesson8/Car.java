package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.Vehicle;

abstract class Car implements Vehicle {
  private String name;

  public Car(String name) {
    this.name = name;
  }

  public void move() {
    System.out.println(name + " їде по дорозі");
  }

  class Bus implements Vehicle {
    private String name;

    public Bus(String name) {
      this.name = name;
    }

    public void move() {
      System.out.println(name + " рухається по місту");
    }
  }

  class Tractor implements Vehicle {
    private String name;

    public Tractor(String name) {
      this.name = name;
    }

    public void move() {
      System.out.println(name + " рухається повільно по полі");
    }
  }

}
