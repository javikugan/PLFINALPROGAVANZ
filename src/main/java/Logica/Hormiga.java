/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author javik
 */
public class Hormiga extends Thread {
    private int idhormiga;
    private int inventarioHormiga;
    private String nombre;
    private Colonia c;
    
    
    
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public Hormiga(int idhormiga, Colonia colonia) {
        this.idhormiga = idhormiga;
        this.c = colonia;
    }
    public Colonia getColonia(){
        return this.c;
  
    }

    public int getIdhormiga() {
        return idhormiga;
    }

    public void setIdhormiga(int idhormiga) {
        this.idhormiga = idhormiga;
    }

    public int getInventarioHormiga() {
        return inventarioHormiga;
    }

    public void setInventarioHormiga(int inventarioHormiga) {
        this.inventarioHormiga = inventarioHormiga;
    }
    
    
}
