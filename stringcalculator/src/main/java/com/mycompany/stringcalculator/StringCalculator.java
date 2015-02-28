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

public class StringCalculator {
    
    String numbersStringArray[];
    String elValasztoKarakter=",";
    
    public int add(String numbers){
        
        int visszaAdottErtek=0;
        
        if(numbers.isEmpty()){
            visszaAdottErtek=0;
        }
        else{
            numbersStringArray=numbers.split(elValasztoKarakter);
            
            for (String szovegesSzam : numbersStringArray) {
                visszaAdottErtek+=Integer.valueOf(szovegesSzam);
            }
        }
        
        return visszaAdottErtek;
    }
}
