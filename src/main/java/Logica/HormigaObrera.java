/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


/**
 *
 * @author javik
 */
public class HormigaObrera extends Hormiga {

    public HormigaObrera(int idHormiga, Colonia c) {
        super(idHormiga, c);
        setNombre(("HO" + idHormiga));
    }

    
    @Override
    public void run(){
        Colonia c = getColonia();
        c.entrarColonia(this);
        System.out.println("La Hormiga" + getNombre() + " Ha Aparecido");
        while(true){
            try{
                
                for(int i = 0; i<=10; i++){
                    if ((getIdhormiga()%2)==0){
                        c.salirColonia(this);
                        Thread.sleep(400);
                        c.entrarColonia(this);
                        c.reponerAlmacen(this); 
                    }
                    else{
                        c.reponerComedor(this);
                    }
                }
                c.comer(300,this);
                c.descansar(100,this);

            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }  
        
    } 
}
}
        
     

