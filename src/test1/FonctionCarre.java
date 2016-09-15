/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;
import test1.util.CnsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class FonctionCarre {


    public static void main(String[] args) throws IOException {
        String txt = CnsoleUtil.lireTexte("veuillez entrer un nombre entier =");

        int nombre = Integer.valueOf(txt);
        int nombreAuCarre = MathUtil.carre(nombre);
        System.out.println("le carrede " + nombre + "est" + nombreAuCarre);

    }

}
