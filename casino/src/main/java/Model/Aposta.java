package Model;

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
    
    public Aposta(int id, String nomUsuari, String enfrontament, String resultat, Date datapartit, double apostaEconomica){
        this.id = id;
        this.nomUsuari = nomUsuari;
        this.enfrontament = enfrontament;
        this.resultat = resultat;
        this.dataPartit = dataPartit;
        this.apostaEconomica = apostaEconomica;
    }
    
    
    
}
