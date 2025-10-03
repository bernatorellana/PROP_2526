/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.epsevg.prop.lab.sessio1.model;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Alumne extends Persona{

    public Alumne(int id, String nom, String cognom, Date dataNaix) {
        super(id, nom, cognom);
        this.setDataNaixement(dataNaix);
    }
}
