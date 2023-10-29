package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.Mammal;

abstract class Cat implements Mammal {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public void makeSound() {
    System.out.println(name + " муркоче");
  }

  abstract class Dog implements Mammal {
    private String name;

    public Dog(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " гавкає");
    }
  }

  abstract class Hamster implements Mammal {
    private String name;

    public Hamster(String name) {
      this.name = name;
    }

    public void makeSound() {
      System.out.println(name + " пищить");
    }
  }

}
