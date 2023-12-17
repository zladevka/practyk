package org.example;

import org.example.Lesson14.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {

  @Test
  public void testHasRealRoots() {
    QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
    Assertions.assertFalse(equation.hasRealRoots());
  }

  @Test
  public void testHasOneRealRoot() {
    QuadraticEquation equation = new QuadraticEquation(1, 0, 3);
    Assertions.assertEquals(0, equation.getRoots().length);
  }

  @Test
  public void testHasNoRealRoots() {
    QuadraticEquation equation = new QuadraticEquation(1, 2, 1);
    Assertions.assertEquals(1, equation.getRoots().length);

  }
}
