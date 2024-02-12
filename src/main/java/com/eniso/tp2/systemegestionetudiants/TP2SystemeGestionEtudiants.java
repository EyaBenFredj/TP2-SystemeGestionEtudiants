/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemegestionetudiants; 

import java.util.ArrayList;

/**
 *
 * @author eyabe
 */
public class TP2SystemeGestionEtudiants {

    public static void main(String[] args) {
      
        ArrayList<Etudiant> tab = new ArrayList<Etudiant>();

        SystemeGestionEtudiants s = new SystemeGestionEtudiants(tab);
      
      
          
     s.ajouterEtudiant( "aziz" ,"BF",155162 ,"jbhfvdhbfv"  );
     s.ajouterEtudiant( "zaineb" ,"BF",1585162 ,"jbhfvdhbfv"  );
     
     
     Etudiant e1 = new  Etudiant( "zaineb" ,"BF",1585162 ,"jbhfvdhbfv"  );
     e1.modifierEmailEtudiant(1515162, "jbnfkzjbk");
     
        
}
}


