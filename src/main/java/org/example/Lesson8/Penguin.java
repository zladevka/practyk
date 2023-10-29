package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.Bird;
import org.example.Lesson8.interfaceTest.WaterAnimal;

abstract class Penguin implements Bird {
  private String name;

  public Penguin(String name) {
    this.name = name;
  }

  public void makeSound() {
    System.out.println(name + " кричить");
  }

  abstract class Kiwi implements Bird {
    private String name;

    public Kiwi(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " пищить");
    }
  }

  abstract class Ostrich implements Bird {
    private String name;

    public Ostrich(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " курлить");
    }
  }

  abstract class Duck implements Bird, WaterAnimal {
    private String name;

    public Duck(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " крякає");
    }

    public void swim() {
      System.out.println(name + " плаває");
    }
  }
}
