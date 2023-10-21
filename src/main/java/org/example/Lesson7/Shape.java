package org.example.Lesson7;

public class Shape {
  public double getArea() {
    return 0.0;
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }


  public double getArea() {
    return Math.PI * radius * radius;
  }
}

