/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class Variables {

    public static void main(String[] args) {
        //Type primitive entiers 
        byte byte1 = 99;
        short short1 = 9999;
        int entier1 = 123, entier2;
        long long1 = 999999999;
        //Type primitive decimaux
        float float1 = (float) 1234.56;
        double double1 = 1234.56;
        entier2 = 456;
        char a;
        System.out.println(entier1 + entier2);

        //Type primitive booleen
        boolean boleen = true; //ou false 

        //texte
        String string1 = "coucou";

        Long l = new Long(123);
        String s2 = l.toString();

        String s = Long.toString(123);

        long l123 = Long.valueOf("1234");

    }
}
