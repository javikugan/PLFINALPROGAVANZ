/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author javik
 */
public class Util {

    public static int intAleat(int min, int max) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    public static String formatoId(int id) {
        String valorId  = Integer.toString(id);
        if( id<10){
            valorId =  "000"  + id;
        }
        else if (id >= 10) {
            valorId = "00"  +  id;
        }
        else if (id  >=  100){
            valorId=  "0" +  id;
        }
        return valorId;
    }
}
