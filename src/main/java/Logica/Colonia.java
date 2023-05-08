/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.lang.Thread;
import javax.swing.JTextField;


/**
 *
 * @author javik
 */
public class Colonia {
    private int comidaAlmacen;
    private int comidaComedor;
    private ReentrantLock lockEntrada = new ReentrantLock();
    private Semaphore semSalida = new Semaphore(2);
    private Semaphore aforoAlmacen = new Semaphore(10);
    private Semaphore semComidaAlm = new Semaphore(1);
    private Semaphore semAlmVacio = new Semaphore(0);
    private Semaphore semComidaCom = new Semaphore(1);
    private Semaphore semComVacio = new Semaphore(0);

    JTextField contcomedor;
    JTextField contalmacen;
    ListaThreads exterior;
    ListaThreads colonia;
    ListaThreads almacen;
    ListaThreads refugio;
    ListaThreads salaDescanso;
    ListaThreads salaEntrenamiento;
    ListaThreads comedor;
    ListaThreads resistencia;
   
    
    public void entrarColonia(Hormiga h){
        boolean rep = true;
        while(rep){
            if(lockEntrada.tryLock()){
                try{
                    System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En La Colonia");
                    Thread.sleep(100);
                    colonia.meter(h);
                    exterior.sacar(h);

                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                    }
                finally{
                    lockEntrada.unlock();
                    rep = false;
                    }
            }  
        }
    }
    public void salirColonia(Hormiga h){        
        try{
            
            semSalida.acquire();
            Thread.sleep(100);
            System.out.println("La Hormiga" + h.getNombre() + " Ha Salido De La Colonia");
            colonia.sacar(h);
            exterior.meter(h);
            semSalida.release();

        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void reponerAlmacen(Hormiga h){
        try{
            aforoAlmacen.acquire();
            semComidaAlm.acquire();
            almacen.meter(h);
            System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En El Almacen");
            Thread.sleep(Util.intAleat(200, 400));
            System.out.println("La Hormiga" + h.getNombre() + " Ha Repuesto El Almacen");
            comidaAlmacen += 5;
            contalmacen.setText(Integer.toString(comidaAlmacen));
            semComidaAlm.release();
            semAlmVacio.release();
            System.out.println("La Hormiga" + h.getNombre() + " Ha Salido Del Almacen");
            almacen.sacar(h);
            aforoAlmacen.release();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            }
        // de aqui para arriba faltan las pausas 
    }
    public void reponerComedor(Hormiga h){
        try{            
            h.getPausa().mirar();
            aforoAlmacen.acquire();
            almacen.meter(h);
            System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En El Almacen");
            semAlmVacio.acquire();
            semComidaAlm.acquire();
            h.getPausa().mirar();
            Thread.sleep(Util.intAleat(100, 200));
            comidaAlmacen -= 5;
            contalmacen.setText(Integer.toString(comidaAlmacen));
            semComidaAlm.release();
            System.out.println("La Hormiga" + h.getNombre() + " Ha Cogido Comida Del Almacen");
            h.getPausa().mirar();
            aforoAlmacen.release();
            System.out.println("La Hormiga" + h.getNombre() + " Ha Salido Del Almacen");
            almacen.sacar(h);
            h.getPausa().mirar();
            Thread.sleep(Util.intAleat(100,300));
            comedor.meter(h);
            semComidaCom.acquire();
  
            h.getPausa().mirar();
            Thread.sleep(Util.intAleat(100, 200));
            System.out.println("La Hormiga" + h.getNombre() + " Ha Dejado comida en el comedor");
            comidaComedor +=5;
            contcomedor.setText(Integer.toString(comidaComedor));
            h.getPausa().mirar();
            comedor.sacar(h);
            semComidaCom.release();     
            semComVacio.release();
            aforoAlmacen.release();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            }   
    }
    public void descansar(int tiempo, Hormiga h){
        try{            
            h.getPausa().mirar();
            salaDescanso.meter(h);
            System.out.println("La Hormiga" + h.getNombre() + " Está Descansando");
            h.getPausa().mirar();
            Thread.sleep(tiempo);
            h.getPausa().mirar();
            System.out.println("La Hormiga" + h.getNombre() + " Ha Terminado De Descansar");
            salaDescanso.sacar(h);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void comer(int tiempo, Hormiga h){
        try{
            h.getPausa().mirar();
            comedor.meter(h);
            System.out.println("La Hormiga" + h.getNombre() + " Ha Llegado Al Comedor");
            h.getPausa().mirar();
            semComVacio.acquire();
            semComidaCom.acquire();
            comidaComedor --;
            contcomedor.setText(Integer.toString(comidaComedor));
            h.getPausa().mirar();
            semComidaCom.release();
            h.getPausa().mirar();
            System.out.println("La Hormiga" + h.getNombre() + " Ha Empezado a Comer");
            Thread.sleep(tiempo);
            h.getPausa().mirar();
            System.out.println("La Hormiga" + h.getNombre() + " Ha Salido Del Comedor");
            h.getPausa().mirar();
            comedor.sacar(h);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void entrenamiento(Hormiga h){
        try{
            h.getPausa().mirar();
            salaEntrenamiento.meter(h);
            System.out.println("La Hormiga" + h.getNombre() + " Está Entrenando");
            Thread.sleep(Util.intAleat(200,800));
            System.out.println("La Hormiga" + h.getNombre() + " Ha Terminado de Entrenar");
            h.getPausa().mirar();
            salaEntrenamiento.sacar(h);
            
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                    } 
            }        

    public ListaThreads getExterior() {
        return exterior;
    }

    public ListaThreads getRefugio() {
        return refugio;
    }

    public ListaThreads getResistencia() {
        return resistencia;
    }
    

    public Colonia(JTextField jexterior, JTextField jcolonia, 
            JTextField jalmacen, JTextField jrefugio, JTextField jsalaDescanso, 
            JTextField jsalaEntrenamiento, JTextField jcomedor, JTextField jresistencia, JTextField jContAlmacen, JTextField jContComedor) {
        this.exterior = new ListaThreads(jexterior);
        this.colonia = new ListaThreads(jcolonia);
        this.almacen = new ListaThreads(jalmacen);
        this.refugio = new ListaThreads(jrefugio);
        this.salaDescanso = new ListaThreads(jsalaDescanso);
        this.salaEntrenamiento = new ListaThreads(jsalaEntrenamiento);
        this.comedor = new ListaThreads(jcomedor);
        this.resistencia = new ListaThreads(jresistencia);
        this.contalmacen = jContAlmacen;
        this.contcomedor = jContComedor;
        
    }
    
}

