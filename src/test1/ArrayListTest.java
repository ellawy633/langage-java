/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ArrayListTest {

    public static void main(String[] args) {
        
        
        
        ArrayList<String> liste1=new ArrayList<>();
        liste1.add("abd");
         liste1.add("samer");
          liste1.add("raif");
           liste1.add("mari");
           
        
       ArrayList<String> liste2=new ArrayList<>();
        liste2.add("nara");
         liste2.add("samer");  
        
        
        liste1.addAll(liste2);
        System.out.println(liste1);
        
        System.out.println(liste2); 
        
        ArrayList mixte =new ArrayList();
        mixte.add("A");
        mixte.add("B");
        mixte.add(1);
        mixte.add(true);
        mixte.add("coucou");
        mixte.add(4);
        mixte.add(5);
        mixte.add(6);
        
       ArrayList<Integer> liste3 = new ArrayList<Integer>();
        for (int j = 1; j< 10; j++) {
            liste3.add(j);

        } 
        
        
        
        
        mixte.removeAll(liste3);
        
        
        System.out.println(mixte);
         
        
        
        
        

    }

}
