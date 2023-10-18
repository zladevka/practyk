package org.example.lesson6;

public class Employee {
  private String surname;
  private String name;
  private String position;
  private double salaryPayhour;

  public Employee(String surname, String name, String position, double salaryPayhour) {
    this.surname = surname;
    this.name = name;
    this.position = position;
    this.salaryPayhour = salaryPayhour;
  }

  public double calculateSalaryDay(double hoursWorksPerDay) {
    return hoursWorksPerDay * salaryPayhour;
  }

  public String getInformation() {
    return "Прізвище: " + surname + "\nІмя: " + name + "\nПосада: " + position + "\nЗаробітня плата за годину: $" + salaryPayhour;
  }




}
