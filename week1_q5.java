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
public class week1_q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Absolute value: "+Math.abs(num));
        System.out.println("Square root: "+Math.sqrt(num));
        System.out.println("Power (num^2): "+Math.pow(num, 2));
        System.out.println("Sine value: "+Math.sin(num));
        System.out.println("Cosine value: "+Math.cos(num));
    }
}
