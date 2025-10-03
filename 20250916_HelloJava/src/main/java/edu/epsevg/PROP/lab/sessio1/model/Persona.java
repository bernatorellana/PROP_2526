package edu.epsevg.prop.lab.sessio1.model;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Persona implements Imprimible, Comparable<Persona> {
    
    private int id;
    private String nom;
    private String cognom;
    private Date dataNaixement;
    
    //*************************************
    // Constructor

    public Persona(int id, String nom, String cognom) {
        this.id = id;
        setNom(nom);
        this.cognom = cognom;
        
    }
    
    
    //*************************************

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null||nom.isBlank()) throw new RuntimeException("Nom incorrecte");
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public Date getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Date dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    @Override
    public String toHTML() {
        return "<html><body>"+this.nom+"</body></html>";
    }

    @Override
    public String toDocx() {
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(Persona o) {
        return this.id-o.id; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //return this.cognom.compareTo(o.cognom);
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + ", cognom=" + cognom + ", dataNaixement=" + dataNaixement + '}';
    }


    
    
    
}
