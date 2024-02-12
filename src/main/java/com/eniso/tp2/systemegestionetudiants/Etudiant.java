/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;



public class Etudiant {

    static int getNuminscri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nom;
    private String prenom;
    private int numinscri;
    private String email;
    

public Etudiant(String nom,String prenom, int numinscri, String Email){
 this.nom=nom;
 this.prenom=prenom;
this.numinscri=numinscri;
this.email=Email;
}

public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroInscription() {
        return numinscri;
    }

    public void setNumeroInscription(int numeroInscription) {
        this.numinscri = numeroInscription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
       @Override
       public String toString(){
           return "npm est"+this.nom+"prenom est "+this.prenom;
       }

    void modifierEmailEtudiant(int i, String jbnfkzjbk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    
    
    
    
    
    
}




