package org.example.Lesson9;

public enum Size {
  S("S", 30, 40),
  M("M", 40, 50),
  XL("XL", 60, 70);

  private final String shortName;
  private final int width;
  private final int length;

  Size(String shortName, int width, int length) {
    this.shortName = shortName;
    this.width = width;
    this.length = length;
  }

  public String getShortName() {
    return shortName;
  }

  public int getWidth() {
    return width;
  }

  public int getLength() {
    return length;
  }

  @Override
  public String toString() {
    return "Size{" +
        "shortName='" + shortName + '\'' +
        ", width=" + width +
        ", length=" + length +
        '}';
  }
}