package org.example.lesson6;

public class Credit {
  private String clientName;
  private double creditAmount;
  private double interestRate;
  private int creditTermMonths;

  public Credit(String clientName, double creditAmount, double interestRate, int creditTermMonths) {

    this.clientName = clientName;
    this.creditAmount = creditAmount;
    this.interestRate = interestRate;
    this.creditTermMonths = creditTermMonths;
  }


  // Метод для підрахунку загальної суми, яку клієнт повинен повернути (з урахуванням відсотків)
  public double calculateReturnAmount() {
    double percent = creditAmount * (interestRate) / 100;
    return creditAmount + percent;
  }
  // Метод для підрахунку щомісячного платежу

  public double calculateMonthlyPayment() {
    double amountToReturn = calculateReturnAmount();
    return amountToReturn / creditTermMonths;
  }

  // Геттер для отримання імені клієнта
  public String getClientName() {
    return clientName;
  }
}
