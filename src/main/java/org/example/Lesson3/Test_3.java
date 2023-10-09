package org.example.Lesson3;

import java.util.Scanner;

public class Test_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введіть номер місяця (1-12): ");
    int month = scanner.nextInt();

    System.out.println("Введіть вартість години: ");
    double hour = scanner.nextDouble();

    System.out.println("Введіть відсоток: ");
    double tax = scanner.nextDouble();


    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days = daysInMonth[month - 1];

    int workDay = (days / 7) * 5;

    double salaryBeforeTax = workDay * 8 * hour;
    double salaryAfterTax = (tax / 100) * salaryBeforeTax;
    double resulTax = salaryBeforeTax - salaryAfterTax;

    System.out.println("Зарплата до оподаткування: " + salaryBeforeTax);
    System.out.println("Зарплата після оподаткування: " + resulTax);
  }
}
