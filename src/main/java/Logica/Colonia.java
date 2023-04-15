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
    private Util util;
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
                    System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En La Colonia");
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
            System.out.println("La Hormiga" + h.getNombre() + " Ha Entrado En La Colonia");
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
            Thread.sleep(util.intAleat(200, 400));
            comidaAlmacen += 5;
            semComidaAlm.release();           
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            }
        
    }
    public void reponerComedor(Hormiga h){
        try{
            aforoAlmacen.acquire();
            semComidaAlm.acquire();
            Thread.sleep(util.intAleat(100, 200));
            comidaAlmacen -= 5;
            semComidaAlm.release();
            aforoAlmacen.release();
            Thread.sleep(util.intAleat(100,300));
            semComidaCom.acquire();
            Thread.sleep(util.intAleat(100, 200));
            comidaComedor +=5;
            semComidaCom.release();            
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            }   
    }
    public void descansar(int tiempo, Hormiga h){
        try{
             Thread.sleep(tiempo);         
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void comer(int tiempo, Hormiga h){
        try{
            semComidaCom.acquire();
            comidaComedor --;
            semComidaCom.release();
            Thread.sleep(tiempo);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
            } 
    }
    public void entrenamiento(Hormiga h){
        try{
            Thread.sleep(util.intAleat(200,800));
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                    } 
            }        
}

