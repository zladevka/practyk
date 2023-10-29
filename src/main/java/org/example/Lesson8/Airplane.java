package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.Vehicle;

abstract class Airplane implements Vehicle {
  private String name;

  public Airplane(String name) {
    this.name = name;
  }

  public void move() {
    System.out.println(name + " летить");
  }

class Helicopter implements Vehicle {
    private String name;

    public Helicopter(String name) {
      this.name = name;
    }

    public void move() {
      System.out.println(name + " летить вертикально");
    }
  }

 class HotAirBalloon implements Vehicle {
    private String name;

    public HotAirBalloon(String name) {
      this.name = name;
    }

    public void move() {
      System.out.println(name + " плаває в повітрі");
    }
  }

}