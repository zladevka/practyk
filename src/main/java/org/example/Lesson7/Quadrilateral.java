package org.example.Lesson7;

class Quadrilateral extends Shape {
}

class Square extends Quadrilateral {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double getArea() {
    return side * side;
  }
}

class Rectangle extends Quadrilateral {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }
}

class Parallelogram extends Quadrilateral {
  private double base;
  private double height;

  public Parallelogram(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getArea() {
    return base * height;
  }
}

class Trapezoid extends Quadrilateral {
  private double base1;
  private double base2;
  private double height;

  public Trapezoid(double base1, double base2, double height) {
    this.base1 = base1;
    this.base2 = base2;
    this.height = height;
  }

  public double getArea() {
    return 0.5 * (base1 + base2) * height;
  }
}

class Rhombus extends Quadrilateral {
  private double diagonals1;
  private double diagonals2;

  public Rhombus(double diagonals1, double diagonals2) {
    this.diagonals1 = diagonals1;
    this.diagonals2 = diagonals2;
  }

  public double getArea() {
    return 0.5 * diagonals1 * diagonals2;
  }
}
