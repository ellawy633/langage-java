/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author admin
 */
public class SetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("hfhgf");
        set.add("vghc");
        System.out.println(set);

        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            set1.add(i);

        }
        Collection <Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(3);
        liste.add(4);
        liste.add(4);
        liste.add(5);

        liste.addAll(set1);
        System.out.println(liste);
        set1.addAll(liste);
        System.out.println(set1);

    }

}
