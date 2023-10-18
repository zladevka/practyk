package org.example.lesson6;

public class Triangle {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public double getSideA() {
    return sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public double getSideC() {
    return sideC;
  }

  public double calculatePerimeter() {
    return sideA + sideB + sideC;
  }

  public double calculateArea() {
    double s = (sideA + sideB + sideC) / 2;
    return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
  }



}
