package edu.epsevg.prop.lab.sessio1;

import edu.epsevg.prop.lab.sessio1.model.Alumne;
import edu.epsevg.prop.lab.sessio1.model.Persona;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Usuari
 */
public class App {

    
    public static void main(String[] args) {
        //sessio1();
        //sessio2();
        sessio3();
    }

    private static void sessio1() {
        System.out.println("Hello World!");
        
        int i=0;
        float f = (float)10.7;
        double d = 10.7;
        //-------------------
        boolean m = true;
        char c = 'D';
        //--------------------
        String nom ="Manoli";
        nom = nom + " Pérez López";
        //0123456789
        //Pau Pérez López
        nom=nom.toUpperCase();
        int inici = nom.indexOf(' ', 0)+1;
        int end = nom.indexOf(' ', inici+1);
        System.out.println(">"+nom.substring(inici,end));
        String[] trocets = nom.split(" ");
        for(int n=0;n<trocets.length;n++) {
            System.out.println(">"+ trocets[n]);
        }
        //================0
        // Optimització de la Concatenació de cadenes
        StringBuffer sortida = new StringBuffer();
        Date dataInici = new Date();
        for(int k=0;k<1000000;k++) {
            sortida.append(k);
        }
        Date dataFinal = new Date();
        System.out.println(">"+sortida);
        System.out.println("temps d'execució (ms):"+ ( dataFinal.getTime()-dataInici.getTime()) );
        
        //*************************
        
        Persona maria = new Persona(1, "Maria", "González");
        Alumne joan = new Alumne(2, "Joan", "Martí", new Date());
        
        
        //maria.setNom("Maria");
        System.out.println(">"+maria.getNom());
    }

    private static void sessio2() {
        Alumne a1 = new Alumne(57, "Maria", "Pérez", new Date());
        Alumne a2 = new Alumne(15, "Joan", "García", new Date());
        Alumne a3 = new Alumne(10, "Marta", "Miralles", new Date());
        
        List<Alumne> alumnes = new ArrayList<>();
        alumnes.add(a1);
        alumnes.add(a2);
        alumnes.add(a3);
        System.out.println("> La llista té "+alumnes.size());
        alumnes.add(a3);
        System.out.println("> La llista té "+alumnes.size());
        System.out.println("El tercer alumne es diu:"+alumnes.get(2).getNom());
        
        a3.setNom("XXXXX");
        System.out.println("El tercer alumne es diu:"+alumnes.get(2).getNom());

        //---------- recorreguts --------------------
        for(int i=0;i<alumnes.size();i++) {
            System.out.println(" - Alumne:"+alumnes.get(i).getNom());
        }
        for(Alumne a:alumnes){
            System.out.println(" - Alumne:"+a.getNom());
        }
        
        alumnes.forEach((a)->{System.out.println(" - Alumne:"+a.getNom());});
        
        //--------- cerques --------------------------
        int indexDelA3 = alumnes.indexOf(a3);
        System.out.println(">indexDelA3:"+indexDelA3);
        
        indexDelA3 = alumnes.indexOf(new Alumne(17, "Marta", "Miralles", new Date()));
        System.out.println(">indexDelA3:"+indexDelA3);
        
        // -------- esborrar elements ------
        //alumnes.remove(a3);
        //alumnes.remove(2);
        
        // --------- altres operacions ---------
        Collections.sort(alumnes);
        for(Persona p: alumnes) {
            System.out.println(">"+p);
        }
        
        Collections.sort(alumnes, new Comparator<Persona>(){
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });
        for(Persona p: alumnes) {
            System.out.println(">"+p);
        }
        System.exit(0);
        
        //===========================================
        //              TREESET
    
        Set<Persona> conjunt = new HashSet<>();
        conjunt.add(a1);
        conjunt.add(a2);
        conjunt.add(a3);
        for(Persona p: conjunt) {
            System.out.println(">"+p);
        }
        
        //=====================================
    }

    private static void sessio3() {

        
        
        Alumne a1 = new Alumne(57, "Maria", "Pérez", new Date());
        Alumne a2 = new Alumne(15, "Joan", "García", new Date());
        Alumne a3 = new Alumne(10, "Marta", "Miralles", new Date());
        
                                        // Exemple de TreeMap proporcionant una ordenació específica de les claus
        Map<Integer,Alumne> alumnesPerId = new TreeMap<>((o1, o2) -> {
            return o1-o2;
        });
        alumnesPerId.put( a1.getId(), a1 );
        alumnesPerId.put( a2.getId(), a2 );
        alumnesPerId.put( a3.getId(), a3 );
        //-------------------------------------------------
        Alumne a57 = alumnesPerId.get(57);
        System.out.println("> alumne amb id=57:"+a57);
        a57.setCognom("XXXXX");
        System.out.println(">"+a1.getCognom());
        
        if(alumnesPerId.containsKey(666)){
            Alumne a666 = alumnesPerId.get(666);
            System.out.println(">"+a666.getCognom());
        }
        alumnesPerId.put(57, new Alumne(666, "DIABOLIC", "Pérez", new Date()));
        
        // Recorreguts pels Maps
        System.out.println("Recorreguts pels Maps");
        System.out.println("=============================");
        for(Entry<Integer,Alumne> parell: alumnesPerId.entrySet()){
            System.out.println(">"+parell.getKey()+":"+parell.getValue());
        }
        
        
    }
}
