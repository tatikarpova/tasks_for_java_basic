/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

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
    }
}
