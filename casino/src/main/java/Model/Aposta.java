package Model;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isard
 */
public class Aposta {
    private int id;
    private String nomUsuari;
    private String enfrontament;
    private String resultat;
    private Date dataPartit;
    private double apostaEconomica;
    
    public Aposta(){} //Constructor buit
    
    public Aposta(int id, String nomUsuari, String enfrontament, String resultat, Date dataPartit, double apostaEconomica){
        this.id = id;
        this.nomUsuari = nomUsuari;
        this.enfrontament = enfrontament;
        this.resultat = resultat;
        this.dataPartit = dataPartit;
        this.apostaEconomica = apostaEconomica;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNomUsuari(){
        return nomUsuari;
        
    }
    public void setNomUsuari(String nomUsuari){
        this.nomUsuari = nomUsuari;
    }
    public String getEnfrotament(){
        return enfrontament;
    }
    public void setEnfrontament(String enfrontament){
        this.enfrontament = enfrontament;
    }
    public String setResultat(){
        return resultat;
    }
    public void setResultat(String resultat){
       this.resultat = resultat; 
    }
    public Date getDataPartit(){
        return dataPartit;
    }
    public void setDataPartit(Date dataPartit){
        this.dataPartit = dataPartit;
    }
    public double getApostaEconomica(){
        return apostaEconomica;
    }
    public void setApostaEconomica(double apostaEconomica){
        this.apostaEconomica = apostaEconomica;
    }
    @Override
    public S
}   
