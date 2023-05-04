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
    private Invasion i;
    private Pausa p;
    
    public HormigaCria(int idHormiga, Colonia c, Invasion inv,Pausa pausa) {
        super(idHormiga, c, pausa);
        setNombre(("HC" + idHormiga));
        this.i = inv;
        this.p = pausa;
        setTipo("Cria");

        
    }
    
    @Override
    public void run(){
        System.out.println("La Hormiga" + getNombre() + " Ha Aparecido");
        Colonia c = getColonia();
        c.entrarColonia(this);
        while(true){
            
                p.mirar();
                i.mirar(this);
                c.comer(Util.intAleat(300,500), this);
                c.descansar(400, this);
            
        
           
                
            
        
        }
    } 

    
}
