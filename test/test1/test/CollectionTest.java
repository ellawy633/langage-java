/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import static jdk.nashorn.internal.objects.NativeArray.map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CollectionTest {
     @Test
    public void rmplaceDefRbyParSuperLanguage() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programation objet");
        map.put("c", "langage de prog  structure");
        map.put("ruby", "langage de script objet");
        String def = map.replace("ruby", "SuperLanguage");
        System.out.println(def);

    }

    @Test
    public void recupRuby() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programation objet");
        map.put("c", "langage de prog  structure");
        map.put("ruby", "langage de script objet");
        String def = map.get("ruby1233");
        System.out.println(def);
    }

   

    @Test
    public void SuprimerLangagec() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programation objet");
        map.put("c", "langage de prog  structure");
        map.put("ruby", "langage de script objet");
        String def = map.remove("c");
        System.out.println(def);

    }

    @Test
    public void map() {

        HashMap<String, String> map = new HashMap<>();

        map.put("java", "langage de programation objet");
        map.put("c", "langage de prog  structure");
        map.put("ruby", "langage de script objet");
        map.size();// revoie 3
        map.get("ruby");//renvoie  "langage de script objet
        map.keySet();
        map.putAll(map);// ajoute une map ds un  autre 
        map.remove("c");//suprimee l entree c dans la map 
        map.replace("c", "language prehéstorique ");//remplace
        map.clear();//vid la map
        map.values();

    }

    @Test
    public void map2() {
         HashMap<String, String> map = new HashMap<>();

        map.put("java", "langage de programation objet");
        map.put("c", "langage de prog  structure");
        map.put("ruby", "langage de script objet");

        HashMap<String, String> map2 = new HashMap<>();

        map2.put("a", "premiere lettre");
        map2.put("b", "dexieme lettre");
        map2.put("d", "quatrieme lettre");

        map.putAll(map);
      
    }

}
