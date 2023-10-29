package org.example;

// Базовий клас
class Vehicle {
  String brand;
  int year;

  public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  public void start() {
    System.out.println("Запуск транспортного засобу.");
  }
}

// Підклас, який успадковує базовий клас Vehicle
class Car extends Vehicle {
  int numberOfDoors;

  public Car(String brand, int year, int numberOfDoors) {
    super(brand, year); // Виклик конструктора базового класу
    this.numberOfDoors = numberOfDoors;
  }

  public void drive() {
    System.out.println("Водіння автомобіля.");
  }
  public void main(String[] args) {
    Car car= new Car("Honda",1995, 4);



  }
}


