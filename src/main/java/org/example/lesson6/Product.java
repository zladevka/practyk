package org.example.lesson6;

public class Product {
  private String brand;
  private int article;
  private double price;
  private String description;
  private boolean existence;

  public Product(String brand, int article, double price, String description, boolean existence) {
    this.brand = brand;
    this.article = article;
    this.price = price;
    this.description = description;
    this.existence = existence;
  }
  // Метод Гет для отримання значення полів

  public String getBrand() {
    return brand;
  }

  public int getArticle() {
    return article;
  }

  public double getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public boolean getExistence() {
    return existence;
  }

  // Метод Сетт для зміни значення полів
  public void setBrand(String newBrand) {
    this.brand = newBrand;

  }

  public void setArticle(int newArticle) {
    this.article = newArticle;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  public void setDescription(String newDescription) {
    this.description = newDescription;
  }

  public void setExistence(boolean newExistence) {
    this.existence = newExistence;
  }



}
