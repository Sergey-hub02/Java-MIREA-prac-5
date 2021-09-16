package ru.mirea;

import java.util.*;


public class Task4 {
  private static final Scanner IN = new Scanner(System.in);

  /**
   * Вычисляет сумму цифр числа
   * @param number        число, сумму цифр которого нужно найти
   * @return              сумма цифр целого числа
   */
  private static int sumOfDigits(int number) {
    if (number < 10) {
      return number;
    }

    return number % 10 + sumOfDigits(number / 10);
  }

  public static void main(String[] args) {
    System.out.print("Введите k: ");
    int k = IN.nextInt();

    System.out.print("Введите s: ");
    int s = IN.nextInt();

    int start = (int) Math.pow(10, k - 1);
    int end = (int) Math.pow(10, k);

    int count = 0;

    for (int num = start; num < end; ++num) {
      if (sumOfDigits(num) == s) {
        ++count;
      }
    }

    System.out.println();
    System.out.println("Количество " + k + "-значных чисел, сумма цифр которых равна " + s + ": " + count);
  }
}
