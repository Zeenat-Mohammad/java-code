/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

/**
 *
 * @author zeena
 */
public class week1_q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num=sc.nextDouble();
        double numRound=Math.round(num);
        double numCeil=Math.ceil(num);
        double numFloor=Math.floor(num);
        int numInteger=(int)num;
        System.out.println("numRound: "+numRound);
        System.out.println("numCeil: "+numCeil);
        System.out.println("numFloor: "+numFloor);
        System.out.println("numInteger: "+numInteger);
    }
}
