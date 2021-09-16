package ru.mirea;

import java.util.*;

public class Task5 {
  private static final Scanner IN = new Scanner(System.in);

  private static int sumOfDigits(int number) {
    if (number < 10) {
      return number;
    }

    return number % 10 + sumOfDigits(number / 10);
  }

  public static void main(String[] args) {
    System.out.print("Введите число: ");
    int n = IN.nextInt();

    System.out.println("Сумма цифр числа " + n + ": " + sumOfDigits(n));
  }
}
