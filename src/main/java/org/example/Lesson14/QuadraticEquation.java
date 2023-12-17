package org.example.Lesson14;

public class QuadraticEquation {

  private double a;
  private double b;
  private double c;

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getDiscriminant() {
    return b * b - 4 * a * c;
  }

  public double[] getRoots() {
    double discriminant = getDiscriminant();

    if (discriminant > 0) {
      double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      return new double[]{x1, x2};
    } else if (discriminant == 0) {
      double x = -b / (2 * a);
      return new double[]{x};
    } else {
      return new double[]{};
    }
  }
  public boolean hasRealRoots() {
    return getDiscriminant() >= 0;
  }
}
