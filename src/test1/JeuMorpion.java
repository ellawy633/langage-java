/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.CnsoleUtil;

/**
 *
 * @author admin
 */
public class JeuMorpion {

    public static void affiche(int[][] p) {
        for (int[] ligneAct : p) {
            for (int elemAct : ligneAct) {
                System.out.println(elemAct);
            }
        }

    }

    public static void main(String[] args) throws IOException {

        char[][] plateau = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(plateau[i][j] = '*');
            }
            System.out.println();

        }

        for (int tour = 0; tour < 9; tour++) {

            String i1 = CnsoleUtil.lireTexte("veuillez choisir la line ligne i ");

            int s = Integer.valueOf(i1);
            String j1 = CnsoleUtil.lireTexte("veuillez choisir le colone j");
            int t = Integer.valueOf(j1);
            if (plateau[s][t] == '*') {

                if (tour % 2 == 1) {

                    plateau[s][t] = 'x';
                } else {
                    plateau[s][t] = 'O';
                }
            } else {
                System.out.println("saisi faux");

                

            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(plateau[i][j] + "----");

            }
            System.out.println();

        }

        if (plateau[0][0] == 'X' && plateau[0][1] =='X'&& plateau[0][2]=='X') {

            System.out.println("ganie ");
        } else if (plateau[1][0] == 'X' && plateau[1][1] =='X'&& plateau[1][2]=='X') {

            System.out.println("ganie ");
        } else if (plateau[2][0] == 'X' && plateau[2][1] =='X'&& plateau[2][2]=='X') {
            System.out.println("ganie ");
        } else if (plateau[0][0] == 'X' && plateau[1][1] =='X'&& plateau[2][2]=='X') {
            System.out.println("ganie ");
        }

    }

}
