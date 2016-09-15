/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */





public class MathUtil {

    public static int factorielleRecu(int nombr) {
        if (nombr < 0) {
            throw new RuntimeException("erreure");
        }
        if (nombr <= 1) {
            return 1;
        }
        return nombr * factorielleRecu(nombr - 1);

    }

    public static int factoriel(int m) {
        if (m < 0) {
            throw new RuntimeException("erreure");
        }

        int r = m;
        while (m > 1) {
            r = r * m;
            m = m - 1;

        }

        return r;

    }

    public static int exposant(int nombre, int puissance) {
        if (puissance <= 0) {
            return 1;
        }
        int resultat = 1;
        while (puissance > 0) {

            resultat = resultat * nombre;
            puissance = puissance - 1;
        }
        return resultat;
    }

    public static int carre(int n) {
        int c = n * n;
        return c;
    }

    public static int calculeunnombrealeatoir() {
        double nombreSecretdecimal = Math.random() * 100 + 1;
        int nombreSecret = (int) nombreSecretdecimal;
        return nombreSecret;
    }

    public static int calculerNMinMax(int min, int max) {
        if(min>=max) {
            throw new RuntimeException("erreure");
        }
        int k=3;
        int x = calculeunnombrealeatoir(); 
        if (x> min && x< max) {
             k = 1;
        }else{
            k=0;
        }
        return k;
    }
}
