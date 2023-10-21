package org.example.Lesson7;

class Triangle extends Shape {
  protected double base;
  protected double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

}

class RightTriangle extends Triangle {
  public RightTriangle(double base, double height) {
    super(base, height);
  }

  public double getArea() {
    return 0.5 * base * height;
  }
}

class IsoscelesTriangle extends Triangle {
  public IsoscelesTriangle(double base, double height) {
    super(base, height);
  }

  public double getArea() {
    return 0.5 * base * height;
  }
}

class EquilateralTriangle extends Triangle {
  public EquilateralTriangle(double side) {
    super(side, (Math.sqrt(3) / 2) * side);
  }

  public double getArea() {
    return 0.5 * base * height;
  }
}