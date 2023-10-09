package org.example.Lesson2;

public class Lesson_2_Test_2 {
  static double hours_a_week = 40.0;
  static double Cost_per_hour = 100;
  static double Percent = 15;
  static double resul_Monthly_salary = (hours_a_week * 4) * Cost_per_hour;
  static double resul_Monthly_salary_percent = (Percent / 100) * resul_Monthly_salary;


  public static void main(String[] args) {
    System.out.println("Зарплатня на місяць без податків: " + resul_Monthly_salary);
    System.out.println("Зарплатня на місяць з податками: " + (resul_Monthly_salary - resul_Monthly_salary_percent));
    System.out.println("Зарплатня на рік без податків: " + resul_Monthly_salary * 12);
    System.out.println("Зарплатня на рік з податками: " + (resul_Monthly_salary - resul_Monthly_salary_percent) * 12);

  }
}
