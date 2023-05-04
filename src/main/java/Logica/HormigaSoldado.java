/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author javik
 */
public class HormigaSoldado extends Hormiga {
    private Invasion i;
    private Pausa p;
    public HormigaSoldado(int idHormiga, Colonia c, Invasion inv,Pausa pausa) {
        super(idHormiga, c, pausa);
        setNombre(("HS" + idHormiga));
        this.i = inv;        
        this.p = pausa;
        setTipo("Soldado");

    }
    
    @Override
    public void run(){
        Colonia c = getColonia();
        c.entrarColonia(this);
        System.out.println("La Hormiga" + getNombre() + " Ha Aparecido");

        while(true){
            
                for(int k = 0; k<=10; k++){
                    p.mirar();
                    i.mirar(this);
                    c.entrenamiento(this);
                    c.descansar(200, this);
                }
            
        }
    } 

    
}
