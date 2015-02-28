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
    
    int visszaAdottErtek,elsoSzam,masodikSzam=0;
    String numbersStringArray[]=new String[2];
    String elValasztoKarakter=",";
    
    public int add(String numbers){
        
        if(numbers.isEmpty()){
            visszaAdottErtek=0;
        }
        else{
            numbersStringArray=numbers.split(elValasztoKarakter);
            
            if(numbersStringArray.length==1){
                visszaAdottErtek=Integer.valueOf(numbersStringArray[0]);
            }
            else{
                visszaAdottErtek=(Integer.valueOf(numbersStringArray[0]))+(Integer.valueOf(numbersStringArray[1]));
            }
        }
        
        return visszaAdottErtek;
    }
}
