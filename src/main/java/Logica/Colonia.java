/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.lang.Thread;


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
    private Semaphore semComidaCom = new Semaphore(1);
   
    
    public void entrarColonia(Hormiga h){
        boolean rep = true;
        while(rep){
            if(lockEntrada.tryLock()){
                try{
                    //System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En La Colonia");
                    Thread.sleep(100);
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
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Salido De La Colonia");
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
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En El Almacen");
            Thread.sleep(Util.intAleat(200, 400));
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Repuesto El Almacen");
            comidaAlmacen += 5;
            semComidaAlm.release();           
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Salido Del Almacen");

        }catch(InterruptedException e){
            throw new RuntimeException(e);
            }
        
    }
    public void reponerComedor(Hormiga h){
        try{
            aforoAlmacen.acquire();
            semComidaAlm.acquire();
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En El Almacen");
            Thread.sleep(Util.intAleat(100, 200));
            comidaAlmacen -= 5;
            semComidaAlm.release();
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Cogido Comida Del Almacen");
            aforoAlmacen.release();
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Salido Del Almacen");
            Thread.sleep(Util.intAleat(100,300));
            semComidaCom.acquire();
            Thread.sleep(Util.intAleat(100, 200));
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Dejado comida en el comedor");
            comidaComedor +=5;
            semComidaCom.release();            
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            }   
    }
    public void descansar(int tiempo, Hormiga h){
        try{            
            //System.out.println("La Hormiga" + h.getNombre() + " Está Descansando");
            Thread.sleep(tiempo);
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Terminado De Descansar");
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void comer(int tiempo, Hormiga h){
        try{
            semComidaCom.acquire();
            comidaComedor --;
            semComidaCom.release();
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Empezado a Comer");
            Thread.sleep(tiempo);
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Terminado De Comer");
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void entrenamiento(Hormiga h){
        try{
            //System.out.println("La Hormiga" + h.getNombre() + " Está Entrenando");
            Thread.sleep(Util.intAleat(200,800));
            //System.out.println("La Hormiga" + h.getNombre() + " Ha Terminado de Entrenar");
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                    } 
            }        
}

