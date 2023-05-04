/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import static Logica.Util.intAleat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javik
 */
public class Generador extends Thread {

    Pausa p;
    Invasion i;
    Colonia c;
    ListaThreads exterior;

    public Generador(Pausa p, Invasion i, Colonia c) {
        this.p = p;
        this.i = i;
        this.c = c;
        this.exterior = this.c.getExterior();
    }

    public void run() {
        
        for (int k = 1; k <= 10; k++) {
            try {
                Thread.sleep(intAleat(800, 3500));
            } catch (InterruptedException ex) {
                Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (k % 3 == 0 && k != 0) {
                HormigaSoldado os = new HormigaSoldado(k, c, i, p);
                HormigaCria oc = new HormigaCria(k, c, i, p);
                exterior.meter(oc);
                exterior.meter(os);
                os.start();
                oc.start();
            } else {
                HormigaObrera oo = new HormigaObrera(k, c, p);
                exterior.meter(oo);
                oo.start();
            }

        }
    }

}
