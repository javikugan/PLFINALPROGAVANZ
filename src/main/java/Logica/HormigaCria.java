/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author javik
 */
public class HormigaCria extends Hormiga{
    private Util util;
    
    public HormigaCria(int idHormiga, Colonia c) {
        super(idHormiga, c);
        setNombre(("HC" + idHormiga));
    }
    
    @Override
    public void run(){
        System.out.println("La Hormiga" + getNombre() + " Ha Aparecido");
        Colonia c = getColonia();
        c.entrarColonia(this);
        while(true){
            //try{
            c.comer(util.intAleat(300,500), this);
            c.descansar(400, this);
        
           
                
            
        /*}catch(InterruptedException e){
            throw new RuntimeException(e);
        } */ 
        }
    } 

    
}
