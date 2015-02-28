/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringcalculator;

/**
 *
 * @author Patrik
 */
public class Main {
    public static void main(String[] args){
        StringCalculator stringCalculator=new StringCalculator();
        System.out.println(stringCalculator.add(""));
        System.out.println(stringCalculator.add("3"));
        System.out.println(stringCalculator.add("3,3"));
        System.out.println(stringCalculator.add("5,2,3,10"));
        System.out.println(stringCalculator.add("10;2;3;10",";"));
        System.out.println(stringCalculator.add("10,-2,3,-10"));
    }
}
