/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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

        /*задание 11*/ 
        Scanner str = new Scanner(System.in, "windows-1251");
        System.out.print("Введите первое число:  ");
        String v1 = str.nextLine();
        System.out.printf("%nВведите второе число:  ");
        int v2 = in.nextInt();
        Integer v3 = Integer.valueOf(v1);
        int max = Math.max(v2, v3);
        System.out.printf("%nБольшеее из введенных чисел: " + max);
        int min0 = Math.min(v2, v3);
        double min = Double.valueOf(min0);
        System.out.printf("%nМеньшее из введенных чисел: " + min);
        
        /*задание 12*/
        System.out.printf("%nВведите строку:  ");       
        String str2 = str.nextLine();
        if (str2.contains("Java") && str2.startsWith("I like") && str2.endsWith("!!!"))
        {
         System.out.println(str2.toUpperCase()); 
        }
        String str3 = str2.replace("a", "o");
        System.out.println(str3.substring(7,11));     
       

        /*задание 13*/
        System.out.printf("%nВведите строку:  ");       
        String str4 = str.nextLine(); 
        String[] str5 = str4.split(" ");
        int count = 0;
        for (int i = 0; i < str5.length; i++)
        {
            if (str5[i].matches("[a-zA-Z]+"))
            {
                count++;            
            }
                    
        }
        System.out.printf("%nКоличество слов из латинских символов: " + count); 
        
        /*задание 14*/
        int[] nums5 = new int[15];
        int max_mod = 0;
        for (int i = 0; i < 15; i++)
        {
            nums5[i] = (int)(Math.random()*41) - 20;
        }
        int max5 = nums5[0];
        for (int i = 0; i < 15; i++)
        {
            if(nums5[i] > max5)
                max5 = nums5[i];
        }
        int min5 = nums5[0];
        for (int i = 0; i < 15; i++)
        {
            if(nums5[i] < min5)
                min5 = nums5[i];
        }
        System.out.printf("%nМаксимальный элемент массива: " + max5); 
        System.out.printf("%nМинимальный элемент массива " + min5); 
        max_mod  = Math.max(Math.abs(max5), Math.abs(min5));
        System.out.printf("%nМаксимальный элемент массива по модулю: " + max_mod );
        
        /* итоговая задача №1*/
        System.out.printf("%nВведите текущий курс: ");
        double rate = in.nextDouble();
        System.out.printf("%nВведите количество рублей: ");
        double rubles = in.nextDouble();
        double transfer = rate * rubles;
        System.out.printf("%nКурс доллара: " + rate );
        System.out.printf("%nКоличество рублей: " + rubles );
        System.out.printf("%nИтого: %.2f",transfer);
        
        
        /* итоговая задача №2*/
        System.out.printf("%nВведите уравнение: " ); 
        String formula0 = str.nextLine(); 
        int X, A, B;
       // String[] str5 = str4.split(" ");
        char[] formula = formula0.toCharArray();
        //случаи , если x стоит после знака равенства
        if (formula[4]=='x' && formula[1]=='-') {
            A = Integer.parseInt(String.valueOf(formula[0]));
            B = Integer.parseInt(String.valueOf(formula[2]));
            X = A - B;
            System.out.printf("%nОтвет " + X );            
        }
        if (formula[4]=='x' && formula[1]=='+') {
            A = Integer.parseInt(String.valueOf(formula[0]));
            B = Integer.parseInt(String.valueOf(formula[2]));
            X = A + B;
            System.out.printf("%nОтвет: "+ X );            
        }
         //случаи , если x - первое введенное число
        if (formula[0]=='x' && formula[1]=='-') {
            A = Integer.parseInt(String.valueOf(formula[4]));
            B = Integer.parseInt(String.valueOf(formula[2]));
            X = A + B;
            System.out.printf("%nОтвет: "+ X );            
        }
        if (formula[0]=='x' && formula[1]=='+') {
            A = Integer.parseInt(String.valueOf(formula[4]));
            B = Integer.parseInt(String.valueOf(formula[2]));
            X = A - B;
            System.out.printf("%nОтвет: "+ X );            
        }
         //случаи , если x - второе введенное число
        if (formula[2]=='x' && formula[1]=='-') {
            A = Integer.parseInt(String.valueOf(formula[0]));
            B = Integer.parseInt(String.valueOf(formula[4]));
            X = A - B;
            System.out.printf("%nОтвет: "+ X );            
        }
        if (formula[2]=='x' && formula[1]=='+') {
            A = Integer.parseInt(String.valueOf(formula[4]));
            B = Integer.parseInt(String.valueOf(formula[0]));
            X = A - B;
            System.out.printf("%nОтвет: "+ X );            
        }  

        /* итоговая задача №3*/
        System.out.printf("%nВведите количество строк: ");
        //определяем количество строк и создаем строчный массив
        int numberstring = in.nextInt();
        String[] strochki = new String[numberstring];
        int[] box = new int[numberstring];
        //наполняем строчный массив + переводим к нижнему регистру для дальнейшего подсчета уникальных символов
        for (int i = 0; i < strochki.length; i++){
            System.out.print("Введите строку: ");
            strochki[i]= str.nextLine();
            strochki[i] = strochki[i].toLowerCase();
        }
        //считаем уникальные символы в каждой введенной строке
        for (int i =0; i < numberstring; i ++){
            box[i] = (int) strochki[i].chars().distinct().count();
        }
        //находим строку с самым большим количеством уникальных символов
        int maxstr = box[0];
        int strCounter = 0;
        for (int i=0; i< numberstring; i++){
            if ( box[i] > maxstr)
            {
              maxstr = box[i];
              strCounter = i;
            } 
        }      
        //выводим строку с самым большим количеством уникальных символов
        System.out.printf("%nОтвет: " + strochki[strCounter]);
        
        /* итоговая задача №4*/
        String question = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";
        String hint = "я - подсказка. теперь ты должен угадать! но это не точно..";
        String userAnswer;
        int attempt = 0;
        for (int i = 0; i <= 3; i++)
        {
            System.out.printf("%nЗагадка: " + question );
            System.out.printf("%nВаш ответ: ");
            userAnswer = str.nextLine();
            attempt = attempt + 1;    
            if (userAnswer.equals(answer))
            {
                System.out.printf("%nПравильно!");
                break;
            }
            else
            {
                if ((attempt <= 2 )&& (userAnswer.equals("Подсказка")==false))
                        {
                            System.out.printf("%nПодумай еще! ");                           
                        }
                if ((attempt == 3) && (userAnswer.equals("Подсказка")==false))
                        {
                            System.out.printf("%nОбидно, приходи в другой раз! "); 
                            break;
                        }
            }
            if ((userAnswer.equals("Подсказка"))&&(attempt == 1))
                {   System.out.println(hint);
                    System.out.printf("%nВаш ответ: ");
                    userAnswer = str.nextLine();
                    if (userAnswer.equals(answer))
                        {
                          System.out.printf("%nПравильно!");
                          break;
                         } 
                    else
                    {
                        System.out.printf("%nОбидно, приходи в другой раз! ");
                        break;
                    }
                        
                }
            if ((attempt == 2 || attempt == 3)&& (userAnswer.equals("Подсказка")))
                {
                    System.out.printf("%nПодсказка уже недоступна"); 
                    attempt = attempt - 1;
                }
            }                     
        }
                  
    
}
