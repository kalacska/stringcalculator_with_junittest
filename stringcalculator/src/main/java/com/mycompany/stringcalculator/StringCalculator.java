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
    String alapertelmezett_elValasztoKarakter=",";
    
    public int add(String numbers, String elvalasztoKarakter){
        
        int visszaAdottErtek=0;
        
        if(numbers.isEmpty()){
            visszaAdottErtek=0;
        }
        else{
            numbersStringArray=numbers.split(elvalasztoKarakter);
            
            for (String szovegesSzam : numbersStringArray) {
                visszaAdottErtek+=Integer.valueOf(szovegesSzam);
            }
        }
 
        return visszaAdottErtek;
    }
    
    public int add(String numbers){
        return this.add(numbers, alapertelmezett_elValasztoKarakter);
    }
}
