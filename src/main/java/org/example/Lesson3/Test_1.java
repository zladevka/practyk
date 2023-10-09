package org.example.Lesson3;

import java.util.Scanner;

public class Test_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();


    if (number % 2 == 0) {
      System.out.println("Число " + number + " є парне.");
    } else {
      System.out.println("Число " + number + " є непарне.");
    }

    if (number > 0) {
      System.out.println("Число " + number + " є додатнє.");
    } else if (number < 0) {
      System.out.println("Число " + number + " є від'ємне.");
    } else {
      System.out.println("Число " + number + " є нуль.");
    }

    if (priem(number)) {
      System.out.println("Число " + number + " є просте.");
    } else {
      System.out.println("Число " + number + " є складене.");
    }
  }

  public static boolean priem(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

}


