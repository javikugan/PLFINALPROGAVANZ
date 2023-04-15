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
    
    public HormigaSoldado(int idHormiga, Colonia c) {
        super(idHormiga, c);
        setNombre(("HS" + idHormiga));
    }
    
    @Override
    public void run(){
        Colonia c = getColonia();
        c.entrarColonia(this);
        System.out.println("La Hormiga" + getNombre() + " Ha Aparecido");

        while(true){
            //try{
                for(int i = 0; i<=10; i++){
                    c.entrenamiento(this);
                    c.descansar(200, this);
                }
            /*}catch(InterruptedException e){
                throw new RuntimeException(e);
            }*/
        }
    } 

    
}
