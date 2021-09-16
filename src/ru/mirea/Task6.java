package ru.mirea;

import java.util.*;

public class Task6 {
  private static final Scanner IN = new Scanner(System.in);

  /**
   * Проверяет, является ли число простым
   * @param number          проверяемое число
   * @param divisor         делитель (начинается с числа 2)
   */
  private static boolean isSimple(int number, int divisor) {
    if (number == 1 || number == 2) {
      return true;
    }

    if (divisor == number - 1) {
      return (number % divisor != 0);
    }

    return (number % divisor != 0) && isSimple(number, divisor + 1);
  }

  public static void main(String[] args) {
    System.out.print("Введите число: ");
    int n = IN.nextInt();

    if (isSimple(n, 2)) {
      System.out.println("Число " + n + " является простым!");
      return;
    }

    System.out.println("Число " + n +" не является простым!");
  }
}
