/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

/**
 *
 * @author javik
 */
public class Main {
    
    
    public static void main(String[] args) {
        Colonia c = new Colonia();

        for(int i= 0; i<=10000; i++){
            if (i%3 == 0 && i !=0){
                HormigaSoldado os = new HormigaSoldado(i,c);
                HormigaCria oc = new HormigaCria(i,c);
                oc.run();
            }else{
                HormigaObrera oo = new HormigaObrera(i,c);
                oo.run();
            }
            
        }
    }
}
