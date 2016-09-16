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
public class Collection {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("A");
        liste.add("B");
        liste.add("B");
        liste.add("C");
        System.out.println(liste + " " + liste.size());

        ArrayList listAsupprimer = new ArrayList();
        listAsupprimer.add("A");
        listAsupprimer.add("B");
        liste.removeAll(listAsupprimer);
        
        
        
        
        
     
      // exercice   
        

        ArrayList<Integer> listemultiplede10 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listemultiplede10.add(i * 10);

        }

        System.out.println(listemultiplede10);
        
        
        
        ArrayList<Integer> listemultiplede2 = new ArrayList<Integer>();
        for (int j = 0; j< 50; j++) {
            listemultiplede2.add(j * 2);

        }
        
        
        
        
        
        
        
        
        System.out.println(listemultiplede2);
        ArrayList<Integer> listemultiplede3 = new ArrayList<Integer>();
        for (int k = 0;k*3< 100; k++) {
            listemultiplede3.add(k * 3); }
        System.out.println(listemultiplede3);
        
        
        listemultiplede2.removeAll(listemultiplede10);
         listemultiplede2.removeAll(listemultiplede3);
         System.out.println(listemultiplede2);
        
        System.out.println(listemultiplede10.size());
        System.out.println(listemultiplede2.indexOf(22));
    }

}
