package org.example.Lesson4;

import java.util.Scanner;

public class Test_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String choice;

    do {
      System.out.println("Оберіть фігуру для намалювання: ");
      System.out.println("1. Прямокутник");
      System.out.println("2. Прямокутний трикутник (прямий кут зліва внизу)");
      System.out.println("3. Зворотній прямокутний трикутник (прямий кут зправа внизу)");
      System.out.println("4. Трикутник");
      System.out.print("Ваш вибір: ");

      int userChoice = scanner.nextInt();
      switch (userChoice) {

        case 1:
          pramokutnyk();
          break;

        case 2:
          pramoTrykutnyk();
          break;

        case 3:
          backPramoTrykutnyk();
          break;

        case 4:
          Trykutnyk();
          break;

        default:
          System.out.println("Не вірний вибір!");
      }
      System.out.print("Чи бажаєте намалювати ще одну фігурку? (yes/no): ");
      choice = scanner.next();
    } while ("yes".equalsIgnoreCase(choice));
    System.out.println("Дякую за використання програми ");
  }

  public static void pramokutnyk() {
    int height, width;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть висоту прямокутника: ");
    height = scanner.nextInt();
    System.out.print("Введіть ширину прямокутника: ");
    width = scanner.nextInt();

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pramoTrykutnyk() {
    int height;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть висоту трикутника: ");
    height = scanner.nextInt();

    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void backPramoTrykutnyk() {
    int height;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть висоту трикутника: ");
    height = scanner.nextInt();

    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= height - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void Trykutnyk() {
    int height;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть висоту трикутника: ");
    height = scanner.nextInt();

    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= height - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

