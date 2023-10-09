package org.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Test_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введіть кількість чисел у масиві: ");
    int n = scanner.nextInt();

    int[] array = new int[n];

    System.out.println("Введіть числа: ");
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println("Початковий масив: " + Arrays.toString(array));


    int[] ascArray = Arrays.copyOf(array, array.length);
    Arrays.sort(ascArray);
    System.out.println("Сортування  від найменшого до найбільшого: " + Arrays.toString(ascArray));


    int[] descArray = Arrays.copyOf(array, array.length);
    Arrays.sort(descArray);
    for (int i = 0; i < descArray.length / 2; i++) {
      int temp = descArray[i];
      descArray[i] = descArray[descArray.length - 1 - i];
      descArray[descArray.length - 1 - i] = temp;
    }
    System.out.println("Сортування від найбільшого до найменшого: " + Arrays.toString(descArray));


    int[] innerArray = Arrays.copyOf(array, array.length);
    Arrays.sort(innerArray);
    int[] tempArray = new int[n];
    int left = 0, right = n - 1;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        tempArray[i] = innerArray[right];
        right--;
      } else {
        tempArray[i] = innerArray[left];
        left++;
      }
    }
    System.out.println("Сортування від країв (найбільші в середені, найменші по краях):  " + Arrays.toString(tempArray));
  }
}
