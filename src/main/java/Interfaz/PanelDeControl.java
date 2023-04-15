package Interfaz;

import Logica.Colonia;
import Logica.HormigaCria;
import Logica.HormigaObrera;
import Logica.HormigaSoldado;
import Logica.ListaThreads;
import Logica.Invasion;
import Logica.Pausa;

public class PanelDeControl extends javax.swing.JFrame
{
    //private Invasion paso = new Invasion();
    private boolean botonPulsado = false;
    private Invasion i = new Invasion();
    private Pausa p = new Pausa();


    /** Creates new form Colores */
    public PanelDeControl()
    {
        initComponents();
        Colonia c = new Colonia(jexterior,jcolonia,jalmacen, jrefugio,jsalaDescanso,jsalaEntrenamiento,jcomedor,jresistencia);
        ListaThreads ext = c.getExterior();

        for(int k= 1; k<=10; k++){
            if (k%3 == 0 && k !=0){
                HormigaSoldado os = new HormigaSoldado(k,c,i,p);
                HormigaCria oc = new HormigaCria(k,c,i,p);
                ext.meter(oc);
                ext.meter(os);
                os.start();
                oc.start();
            }else{
                HormigaObrera oo = new HormigaObrera(k,c,p);
                ext.meter(oo);
                oo.start();
            }
            
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jexterior = new javax.swing.JTextField();
        jcolonia = new javax.swing.JTextField();
        jalmacen = new javax.swing.JTextField();
        jcomedor = new javax.swing.JTextField();
        jrefugio = new javax.swing.JTextField();
        jsalaDescanso = new javax.swing.JTextField();
        jsalaEntrenamiento = new javax.swing.JTextField();
        jresistencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colores");

        jButton5.setText("Detener");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jcolonia.setText("jTextField2");
        jcolonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcoloniaActionPerformed(evt);
            }
        });

        jalmacen.setText("jTextField3");

        jcomedor.setText("jTextField4");
        jcomedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomedorActionPerformed(evt);
            }
        });

        jrefugio.setText("jTextField5");
        jrefugio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrefugioActionPerformed(evt);
            }
        });

        jsalaDescanso.setText("jTextField6");

        jsalaEntrenamiento.setText("jTextField7");

        jresistencia.setText("jTextField7");
        jresistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresistenciaActionPerformed(evt);
            }
        });

        jLabel1.setText("COLONIA");

        jLabel2.setText("EXTERIOR");

        jLabel3.setText("ALMACEN");

        jLabel4.setText("COMEDOR");

        jLabel5.setText("SALA DE DESCANSO");

        jLabel6.setText("REFUGIO");

        jLabel7.setText("RESISTENCIA");

        jLabel8.setText("SALA DE ENTRENAMIENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jButton5)
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcolonia, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(jexterior)
                    .addComponent(jalmacen)
                    .addComponent(jcomedor)
                    .addComponent(jrefugio)
                    .addComponent(jsalaDescanso)
                    .addComponent(jsalaEntrenamiento)
                    .addComponent(jresistencia))
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jexterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jalmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrefugio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsalaDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsalaEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jresistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(856, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!botonPulsado) //Si no se ha pulsado
        {                 
            botonPulsado=true;             //lo cambiamos a pulsado
            jButton5.setText("Reanudar");  //y cambiamos el texto
            p.cerrar();    //Cerramos el paso para que los pintores se detengan
        }
        else //Si ya se había pulsado
        {                           
            botonPulsado=false;            //lo cambiamos
            jButton5.setText("Detener");  //y cambiamos el texto
            p.abrir();    //Abrimos el paso para que los pintores sigan trabajando
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jcoloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcoloniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcoloniaActionPerformed

    private void jcomedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomedorActionPerformed

    private void jrefugioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrefugioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrefugioActionPerformed

    private void jresistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jresistenciaActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new PanelDeControl().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jalmacen;
    private javax.swing.JTextField jcolonia;
    private javax.swing.JTextField jcomedor;
    private javax.swing.JTextField jexterior;
    private javax.swing.JTextField jrefugio;
    private javax.swing.JTextField jresistencia;
    private javax.swing.JTextField jsalaDescanso;
    private javax.swing.JTextField jsalaEntrenamiento;
    // End of variables declaration//GEN-END:variables
}