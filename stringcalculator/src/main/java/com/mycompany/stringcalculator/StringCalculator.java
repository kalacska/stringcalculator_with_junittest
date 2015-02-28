/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrik
 */

public class StringCalculator {
    
    String numbersStringArray[];
    String alapertelmezett_elValasztoKarakter=",";
    int negativTombElemSzama=0;
    
    public int add(String numbers, String elvalasztoKarakter){
        
        int visszaAdottErtek=0;
        
        if(numbers.isEmpty()){
            visszaAdottErtek=0;
        }
        else{
            numbersStringArray=numbers.split(elvalasztoKarakter);
            
            for (String szovegesSzam : numbersStringArray) {
                
                if (Integer.valueOf(szovegesSzam)<0) {
                    negativTombElemSzama+=1;
                }
                else{
                    visszaAdottErtek+=Integer.valueOf(szovegesSzam);
                }
            }
        }
        
        if(negativTombElemSzama>0){
            vizsgal();
        }
 
        return visszaAdottErtek;
    }
    
    public int add(String numbers){
        return this.add(numbers, alapertelmezett_elValasztoKarakter);
    }

    private void vizsgal() {
        List<Integer> negativok=new ArrayList<>();
        
        for (int i = 0; i < numbersStringArray.length; i++) {
            if (Integer.valueOf(numbersStringArray[i])<0) {
                negativok.add(Integer.valueOf(numbersStringArray[i]));
            }
        }
        
        try {
            throw new NegativesNotAllowed(negativok);
        } catch (Exception ex) {
            //Logger.getLogger(StringCalculator.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
        
    }
}
