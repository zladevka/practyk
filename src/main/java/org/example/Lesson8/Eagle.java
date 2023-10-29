package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.FlyingBird;

abstract class Eagle implements FlyingBird {
  private String name;

  public Eagle(String name) {
    this.name = name;
  }

  public void makeSound() {
    System.out.println(name + " кричить");
  }

  public void fly() {
    System.out.println(name + " летить високо");
  }

  abstract class Stork implements FlyingBird {
    private String name;

    public Stork(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " клекоче");
    }

    public void fly() {
      System.out.println(name + " летить низько");
    }
  }

  abstract class Pigeon implements FlyingBird {
    private String name;

    public Pigeon(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " гукає");
    }

    public void fly() {
      System.out.println(name + " летить");
    }
  }
}
