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
    
    int visszaAdottErtek=0;
    
    public int add(String numbers){
        if(numbers.isEmpty()){
            visszaAdottErtek=0;
        }
        else{
            visszaAdottErtek=Integer.valueOf(numbers);
        }
        
        
        return visszaAdottErtek;
    }
}
