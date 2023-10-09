package org.example.Lesson3;

import java.util.Scanner;

public class Test_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введіть вартість товару за одиницю:");
    double price = scanner.nextDouble();

    System.out.println("Введіть кількість товару, яку ви хочете придбати:");
    int quantity = scanner.nextInt();

    double discount = 0;

    if (quantity >= 80) {
      discount = 0.13;
    } else if (quantity >= 30) {
      discount = 0.12 + 0.004 * ((quantity - 30) / 10);
    } else if (quantity >= 20) {
      discount = 0.10;
    } else if (quantity >= 10) {
      discount = 0.05;
    }

    double total = price * quantity * (1 - discount);
    System.out.println("Загальна сума товару: " + total);
  }
}
