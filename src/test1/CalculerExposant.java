/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import java.util.Random;
import test1.util.CnsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class CalculerExposant {
    public static void main(String[] args) throws IOException {
        int res =MathUtil.exposant(2, 3);
        
        System.out.println(res);
        
       String min = CnsoleUtil.lireTexte("veuillez entrer min");

        int min1 = Integer.valueOf(min);
        String max = CnsoleUtil.lireTexte("veuillez entrer max");

        int max1 = Integer.valueOf(max);
       System.out.println(MathUtil.calculerNMinMax(min1,max1)); 
       int k=(int) (min1+ Math.random() * (max1-min1));
         System.out.println(k);
    }
}
