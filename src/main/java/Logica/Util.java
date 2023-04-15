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
    public int intAleat(int min,int max){
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }
}
