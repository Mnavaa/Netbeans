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
    private String nomUsuari;
    private Date dataPartit;
    private double quantitatAposta;
    private String enfrontament;
    private String resultatAposta;
    private int idAposta;
    //Contrutor
     public Aposta(String nomUsuari, int idAposta, String enfrontament, String resultatAposta, Date dataPartit, double quantitatAposta) {
       this.idAposta = idAposta;
        this.nomUsuari = nomUsuari;
        this.enfrontament = enfrontament;
        this.resultatAposta = resultatAposta;
        this.dataPartit = dataPartit;
        this.quantitatAposta = quantitatAposta;
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
    public String setResultatAposta(){
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
}   
