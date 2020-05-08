/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegovarela_lab2;

import java.util.ArrayList;

public class Casa {
    private int numcasa;
    private int numblock;
    private String color;
    private double ancho;
    private double largo;
    private String comprada;
    private int numpiso;
    private int numbaño;
    private int numcuarto;
    private String dueño;
    private String estado;
    private String ingeniero;
   
    public Casa() {
    }

    public Casa(int numcasa, int numblock, String color, double ancho, double largo, String comprada, int numpiso, int numbaño, int numcuarto, String dueño, String estado, String ingeniero) {
        this.numcasa = numcasa;
        this.numblock = numblock;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.comprada = comprada;
        this.numpiso = numpiso;
        this.numbaño = numbaño;
        this.numcuarto = numcuarto;
        this.dueño = dueño;
        this.estado = estado;
        this.ingeniero = ingeniero;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumblock() {
        return numblock;
    }

    public void setNumblock(int numblock) {
        this.numblock = numblock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getComprada() {
        return comprada;
    }

    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    public int getNumpiso() {
        return numpiso;
    }

    public void setNumpiso(int numpiso) {
        this.numpiso = numpiso;
    }

    public int getNumbaño() {
        return numbaño;
    }

    public void setNumbaño(int numbaño) {
        this.numbaño = numbaño;
    }

    public int getNumcuarto() {
        return numcuarto;
    }

    public void setNumcuarto(int numcuarto) {
        this.numcuarto = numcuarto;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }
    
    @Override
    public String toString() {
        return "Casa{" + "comprada=" + comprada + ", due\u00f1o=" + dueño + ", estado=" + estado + ", ingeniero=" + ingeniero + '}';
    }
    
}
