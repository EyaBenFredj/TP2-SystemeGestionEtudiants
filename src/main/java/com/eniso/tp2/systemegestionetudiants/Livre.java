/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author eyabe
 */
public class Livre {
    private String titre ;
    private String auteur;
    public int annee;
    public int isbn;
    
    
    public String gettitre() {
        return titre;
    }

    public void settitre(String titre) {
        this.titre= titre;
    }
     public String getAuteur() {
        return auteur;
    }

    public void setauteur(String auteur) {
        this.auteur= auteur;
    }

    public Livre(){
        this.titre="book";
        this.auteur="john greene";
        this.isbn=2556;
        this.annee=2024;
}

     public Livre( int isbn, int annee){
        this.titre="book";
        this.auteur="john greene";
        this.isbn=isbn;
        this.annee=annee;
}
      public Livre( String titre, String auteur ,int annee){
        this.titre="book";
        this.auteur="john greene";
        this.isbn=753;
        this.annee=2024;
}
       public Livre( String titre , String auteur,int isbn,  int annee){
        this.titre=titre;
        this.auteur=auteur;
        this.isbn=isbn;
        this.annee=annee;
}
     

    public static void main(String[] args) {
                Livre l1=new Livre("hello","author",2023);
                Livre l2=new Livre("hello","author",25,2023);
                Livre l3=new Livre(78,2023);
                               System.out.println("le titre est"+ l1.gettitre());
               System.out.println("Nom de l'auteur"+ l2.getAuteur());
               System.out.println("book number"+ l3.isbn);
               System.out.println("annee de publication" +l3.annee);
    }


      

        
    }

