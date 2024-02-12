/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;
import com.eniso.tp2.systemegestionetudiants.Etudiant;
import static java.lang.System.in;
import java.util.ArrayList ;

public class SystemeGestionEtudiants {
     private  ArrayList<Etudiant> tab ;
    private String email;
     
   
       public SystemeGestionEtudiants(ArrayList<Etudiant> tab) {
        this.tab = tab;
    }
       

public void ajouterEtudiant(String nom, String prenom,int numinscri,String email){
   Etudiant e1 = new  Etudiant( nom ,prenom,numinscri ,email  );
   tab.add(e1);
}
    
    

public void afficherEtudiants(){
    for (Etudiant e : this.tab){
        System.out.println(e.toString());
}
}

public void modifierEmailEtudiant(int numinscri, String newEmail){
      
    for (Etudiant e: this.tab){
        if (e.getNumeroInscription() == numinscri) {
               e.setEmail(newEmail);
         
        }
    }
      }
    
    public void supprimerEtudiant(int numinscri){
      
    for (Etudiant e: this.tab){
        if (e.getNumeroInscription() == numinscri) {
            tab.remove(e);
             
         
        }
    }
}

















}
