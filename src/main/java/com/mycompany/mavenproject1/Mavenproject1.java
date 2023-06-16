/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        /*задание 1*/
        System.out.println("Hello World!");
         /*задание 2*/
         double a = 4.145;
         byte b = 127;
         /*задание 3*/
         int[] nums = {1,2,3,4,5};
         int var = nums[0];
         nums[0]=nums[nums.length-1];
         nums[nums.length-1] = var;
         int sum = nums[0] + nums[nums.length/2];
         System.out.println(sum);
         
         /*задание4*/
         Scanner in = new Scanner(System.in);
         System.out.println("Введите число 1: ");
         int x = in.nextInt();
         System.out.println("Введите число 2: ");
         int y = in.nextInt();
         System.out.println("Введите число 3: ");
         int z = in.nextInt();
         int num = (x+y+z)/3;
         System.out.printf("Среднее арифметическое чисел = %s%n", num);
         int num2 = num/2;
         if (num2 > 3) System.out.println("Программа выполнена корректно");
         
         /*задание 5*/
         char symbol;
         double number1, number2, result;
         System.out.println("Введите число 1: ");
         number1 = in.nextDouble();
         System.out.println("Введите число 2: ");
         number2 = in.nextDouble();
         System.out.println("Введите символ  ‘+’, ‘-’, ‘*’ или ‘/’ ");
         symbol = in.next().charAt(0);
         switch (symbol) {
             case '+' -> { 
                 result = number1 + number2;
                 System.out.print(result);
            }
             case '-' -> { 
                 result = number1 - number2;
                 System.out.print(result);
            }
             case '*' -> { 
                 result = number1 * number2;
                 System.out.print(result);
            }
             case '/' -> { 
                 result = number1 / number2;
                 System.out.print(result);
            }
             default -> System.out.print("Введен некорретный символ");
                 
            }
         
    }
}
