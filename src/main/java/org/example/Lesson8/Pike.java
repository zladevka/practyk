package org.example.Lesson8;

import org.example.Lesson8.interfaceTest.WaterAnimal;

 abstract class Pike implements WaterAnimal {
  private String name;

  public Pike(String name) {
    this.name = name;
  }

  public void swim() {
    System.out.println(name + " плаває");
  }

  class Crucian implements WaterAnimal {
    private String name;

    public Crucian(String name) {
      this.name = name;
    }

    public void swim() {
      System.out.println(name + " плаває");
    }
  }
  class Catfish implements WaterAnimal {
    private String name;

    public Catfish(String name) {
      this.name = name;
    }

    public void swim() {
      System.out.println(name + " плаває");
    }
  }


}






