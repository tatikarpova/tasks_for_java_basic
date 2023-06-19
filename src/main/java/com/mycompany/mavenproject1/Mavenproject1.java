/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Arrays;
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
         
         /*задание 6*/
         int var2, M, R;
         double numberR, metr, mili, yard, foot, numberM, kg, g, foont, karat;
         System.out.printf("%nВыберите что переводить: 1 - масса, 2 - расстояние ");
         var2 = in.nextInt();
         switch(var2){
             case 1 -> {   
                 System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - карат ");
                 M = in.nextInt();
                 switch(M){
                     case 1 ->{
                        System.out.println("Введите число: ");
                        numberM = in.nextDouble(); 
                        kg = numberM;
                        g = numberM * 1000;
                        foont = numberM * 2.2046226;
                        karat = numberM * 5000;
                        System.out.println("Результат: ");  
                        System.out.printf("Килограммы: %s%n", kg);
                        System.out.printf("Граммы: %s%n", g);
                        System.out.printf("Фунты: %s%n", foont);
                        System.out.printf("Караты: %s%n", karat);                        
                     }
                     case 2 -> {
                        System.out.println("Введите число: ");
                        numberM = in.nextDouble(); 
                        kg = numberM * 0.001;
                        g = numberM;
                        foont = numberM * 0.0022046226;
                        karat = numberM * 5;
                        System.out.println("Результат: ");  
                        System.out.printf("Килограммы: %s%n", kg);
                        System.out.printf("Граммы: %s%n", g);
                        System.out.printf("Фунты: %s%n", foont);
                        System.out.printf("Караты: %s%n", karat);                         
                     }
                     case 3 -> {
                        System.out.println("Введите число: ");
                        numberM = in.nextDouble(); 
                        kg = numberM * 0.4535923744953;
                        g = numberM * 453.5923744953;
                        foont = numberM;
                        karat = numberM * 2267.9618724765;
                        System.out.println("Результат: ");  
                        System.out.printf("Килограммы: %s%n", kg);
                        System.out.printf("Граммы: %s%n", g);
                        System.out.printf("Фунты: %s%n", foont);
                        System.out.printf("Караты: %s%n", karat);                         
                     }
                     case 4 -> {
                        System.out.println("Введите число: ");
                        numberM = in.nextDouble(); 
                        kg = numberM * 0.00021;
                        g = numberM * 0.2;
                        foont = numberM * 0.000441;
                        karat = numberM;
                        System.out.println("Результат: ");  
                        System.out.printf("Килограммы: %s%n", kg);
                        System.out.printf("Граммы: %s%n", g);
                        System.out.printf("Фунты: %s%n", foont);
                        System.out.printf("Караты: %s%n", karat);                          
                     }
                     default -> System.out.print("Введено некорректное значение ");
                 }
                 
             }
             case 2 -> {
                 System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
                 R = in.nextInt();
                 switch(R){
                     case 1 -> {
                        System.out.println("Введите число: ");
                        numberR = in.nextDouble(); 
                        metr = numberR;
                        mili = numberR * 0.00062137;
                        yard = numberR * 1.093613;
                        foot = numberR * 3.28084;
                        System.out.println("Результат: ");  
                        System.out.printf("Метры: %s%n", metr);
                        System.out.printf("Мили: %s%n", mili);
                        System.out.printf("Ярды: %s%n", yard);
                        System.out.printf("Футы: %s%n", foot);
                     }
                     case 2 -> {
                        System.out.println("Введите число: ");
                        numberR = in.nextDouble(); 
                        metr = numberR * 1609.34;
                        mili = numberR;
                        yard = numberR * 1760;
                        foot = numberR * 5280;
                        System.out.println("Результат: ");  
                        System.out.printf("Метры: %s%n", metr);
                        System.out.printf("Мили: %s%n", mili);
                        System.out.printf("Ярды: %s%n", yard);
                        System.out.printf("Футы: %s%n", foot);                        
                     }
                     case 3 -> {
                        System.out.println("Введите число: ");
                        numberR = in.nextDouble(); 
                        metr = numberR * 0.9144;
                        mili = numberR * 0.00056;
                        yard = numberR;
                        foot = numberR * 3;
                        System.out.println("Результат: ");  
                        System.out.printf("Метры: %s%n", metr);
                        System.out.printf("Мили: %s%n", mili);
                        System.out.printf("Ярды: %s%n", yard);
                        System.out.printf("Футы: %s%n", foot);                         
                     }
                     case 4 -> {
                        System.out.println("Введите число: ");
                        numberR = in.nextDouble(); 
                        metr = numberR * 0.3048;
                        mili = numberR * 0.00018;
                        yard = numberR * 0.333;
                        foot = numberR;
                        System.out.println("Результат: ");  
                        System.out.printf("Метры: %s%n", metr);
                        System.out.printf("Мили: %s%n", mili);
                        System.out.printf("Ярды: %s%n", yard);
                        System.out.printf("Футы: %s%n", foot);                         
                     }
                     default -> System.out.print("Введено некорректное значение ");
                 }
                             
             }
             default -> System.out.print("Введено некорректное значение");
         }
         
         /*задание 7*/
         final int x1 = 10;
         final int y1 = 15;
         final int z1 = 20;
         int i1;
         System.out.printf("%nВведите длину массива ");
         i1 = in.nextInt();
         int[] nums2;
         nums2 = new int[i1];
         for(int i=0; i<i1; i++){
             System.out.print("Введите число: ");
             nums2[i]=in.nextInt();
         }
         for(int i=0; i<i1; i++){
             if (nums2[i]==x1 || nums2[i]==y1 || nums2[i]==z1){
                System.out.printf("%nДанное значение имеется в константах ");  
             }  
         }  
         /*задание 8*/  
         int i2, sum2 = 0;
         System.out.printf("%nВведите любое целое положительное число ");
         i2 = in.nextInt();
         for(int i = 1; i<= i2; i++){
           if (i % 2 != 0 ) 
               sum2 = sum2 + i;
         }
         System.out.printf("%nРезультат:  " + sum2);  
         
         /*задание 9*/  
         double[] nums3;
         double sred = 0.0;
         System.out.printf("%nВведите длину массива ");
         int i3 = in.nextInt();
         nums3 = new double[i3];
         for(int i=0; i<i3; i++){
             System.out.print("Введите число: ");
             nums3[i]=in.nextDouble();
         }
         for(int i=0; i<i3; i++){
              sred += nums3[i];
         }
         sred /= i3;
         for(int i=0; i<i3; i++){
             nums3[i]*=sred;
              System.out.println(nums3[i]);
         }
 
        /*задание 10*/ 
        System.out.printf("%nВведите размерность матрицы: число строк ");
        int i4, i5;
        i4 = in.nextInt();
        System.out.printf("%nВведите размерность матрицы: число столбцов ");       
        i5 = in.nextInt();
        double nums4[][] = new double[i4][i5];
        for(int i = 0; i <nums4.length; i++)
        {
            for ( int j = 0; j<nums4[i].length; j++)
            {
                System.out.printf("%nВведите значение элемента массива:  ");
                nums4[i][j] = in.nextDouble();
            }
            
        }
        for(int i = 0; i <=0; i++)
        {
            for ( int j = 0; j<nums4[i].length; j++)
            {
                nums4[i][j]= nums4[i][j]*3.0;
                System.out.print(nums4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
