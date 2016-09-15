/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.CnsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {

        int x;
        int i = 0;

        String min = CnsoleUtil.lireTexte("veuillez entrer min =");

        int min1 = Integer.valueOf(min);

        String max = CnsoleUtil.lireTexte("veuillez entrer max =");

        int max1 = Integer.valueOf(max);

        int h = MathUtil.calculerNMinMax(min1, max1);

        System.out.println("h=" + h);

        do {
            String m = CnsoleUtil.lireTexte("entre x=");

            x = Integer.valueOf(m);
            if (x == h) {
                System.out.println("gané*******");
            } else if (x > h) {

                System.out.println("plus petit");

            } else {
                System.out.println("plus grand ");

            }
            i = i + 1;//i++
        } while (h != x);
        String j = "";
        System.out.println(i);
        if (i < 3) {
            System.out.println("genial");
            j = "jenial";
        } else if (i < 6) {
            System.out.println("super");
            j = "jenial";
        } else if (i < 9) {
            System.out.println("cool");
        } else if (i < 12) {
            System.out.println("pasmal");
        } else {
            System.out.println("nul");
        }
    }

}
