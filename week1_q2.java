/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practial_lab.week1;

import java.util.Scanner;

/**
 *
 * @author zeena
 */
public class week1_q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Sum: "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        System.out.println("Quoitent: "+(num1/num2));
        System.out.println("Maximum: "+Math.max(num1,num2));
        System.out.println("Minimum: "+Math.min(num1,num2));
    }
}
