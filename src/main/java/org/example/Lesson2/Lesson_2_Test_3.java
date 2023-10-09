package org.example.Lesson2;

public class Lesson_2_Test_3 {
  static double hours_a_week = 55;
  static double Annual_salary = 264000;
  static double Percent = 12;

  public static void main(String[] args) {
    System.out.println("При " + hours_a_week + " робочих годин на тиждень з річною зарплатею в " + Annual_salary + " та податком " + Percent + "%" + " година часу коштує " + (Annual_salary / 12 / 4 / 55));
  }

}
