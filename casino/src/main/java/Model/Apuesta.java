package Model;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isard
 */
public class Apuesta {
    private int ID;
    private String nombre;
    private String equipo;
    private String resultat;
    private LocalDate fecha_partido;
    private double apuesta;
    //Contrutor
    public Apuesta(String nombre, int ID, String resultat, LocalDate fecha_partido, double apuesta, String equipo) {
        this.ID = ID;
        this.nombre = nombre;
        this.equipo = equipo;
        this.resultat = resultat;
        this.fecha_partido = fecha_partido;
        this.apuesta = apuesta;
    }
    public int getIdAposta(){
        return idAposta;
    }
    public void setIdAposta(int idAposta){
        this.idAposta = idAposta;
    }
    public String getNomUsuari(){
        return nomUsuari;
        
    }
    public void setNomUsuari(String nomUsuari){
        this.nomUsuari = nomUsuari;
    }
    public String getEnfrontament(){
        return enfrontament;
    }
    public void setEnfrontament(String enfrontament){
        this.enfrontament = enfrontament;
    }
    public String getResultatAposta(){
        return resultatAposta;
    }
    public void setResultatAposta(String resultatAposta){
       this.resultatAposta = resultatAposta; 
    }
    public Date getDataPartit(){
        return dataPartit;
    }
    public void setDataPartit(Date dataPartit){
        this.dataPartit = dataPartit;
    }
     public double getQuantitatApostada() {
        return quantitatAposta;
    }

    public void setQuantitatApostada(double quantitatAposta) {
        this.quantitatAposta = quantitatAposta;
    }
    @Override
    public String toString(){
        return "Aposta{"+
                ",nomUsuari=" +nomUsuari + '\'' + 
                ",quantitatAposta="+ quantitatAposta +  
                ",enfrontament=" + enfrontament +'\'' +
                ",resultatAposta=" + resultatAposta + '\''+
                "idAposta=" + idAposta +
                 '}';
    }

    int getID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNombre(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setEquipo(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setResultat(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setFecha_partido(LocalDate parse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setApuesta(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   
