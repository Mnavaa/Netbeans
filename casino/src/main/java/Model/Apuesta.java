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
     public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public LocalDate getFecha_partido() {
        return fecha_partido;
    }

    public void setFecha_partido(LocalDate fecha_partido) {
        this.fecha_partido = fecha_partido;
    }

    public double getApuesta() {
        return apuesta;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }
}
