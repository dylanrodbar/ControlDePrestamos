/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGra;

import Contro.Controladora;
import Contro.Prestamos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Contro.Items;
import java.time.LocalDateTime;

/**
 *
 * @author Diego
 */
public class PrestamosCrear extends javax.swing.JFrame {

    /**
     * Creates new form PrestamosCrear
     */
    
    private Controladora con;
    private ArrayList<String> personas = new ArrayList<>(); //Asigna arraylist y objeto tipo Controlar
    private ArrayList<String> itemsString = new ArrayList<>();
    private ArrayList<Items> itemsArray;
    private ArrayList<Items> itemsSeleccionados = new ArrayList<>();
    private boolean alarmaActivada=false;
    private boolean recurrente = false;
    private boolean minimo = false;//valida si hay al menos un item seleccionado
    
    public PrestamosCrear() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboPersona = new javax.swing.JComboBox();
        cboItem = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbAlarmaActivada = new javax.swing.JRadioButton();
        rbAlarmaDesactivada = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        rbUnaVez = new javax.swing.JRadioButton();
        rbRecurrente = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox();
        cboMes = new javax.swing.JComboBox();
        cboAnno = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txfItemsSeleccionados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAñadirItem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel1.setText("Crear Prestamo");

        cboPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPersonaActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione la Persona:");

        jLabel3.setText("Seleccione el Item:");

        rbAlarmaActivada.setText("Activar");
        rbAlarmaActivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlarmaActivadaActionPerformed(evt);
            }
        });

        rbAlarmaDesactivada.setText("Desactivar");
        rbAlarmaDesactivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlarmaDesactivadaActionPerformed(evt);
            }
        });

        rbUnaVez.setText("Una Vez");
        rbUnaVez.setEnabled(false);
        rbUnaVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnaVezActionPerformed(evt);
            }
        });

        rbRecurrente.setText("Recurrente");
        rbRecurrente.setEnabled(false);
        rbRecurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRecurrenteActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");
        lblTipo.setEnabled(false);

        cboDia.setEnabled(false);

        cboMes.setEnabled(false);

        cboAnno.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbUnaVez)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbRecurrente))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRecurrente)
                    .addComponent(rbUnaVez)))
        );

        jLabel5.setText("Alarma:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Items seleccionados:");

        btnAñadirItem.setText("Añadir");
        btnAñadirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirItemActionPerformed(evt);
            }
        });

        jButton1.setText("Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfItemsSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(rbAlarmaActivada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAlarmaDesactivada)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAñadirItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuitar))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAlarmaDesactivada)
                            .addComponent(rbAlarmaActivada)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(cboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadirItem)
                            .addComponent(btnQuitar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfItemsSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(jButton1)
                            .addComponent(btnGuardar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAlarmaActivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlarmaActivadaActionPerformed
        // TODO add your handling code here:
        
        alarmaActivada = true;
        rbAlarmaDesactivada.setSelected(false);
        rbUnaVez.setEnabled(true);
        rbRecurrente.setEnabled(true);
        cboDia.setEnabled(true);
        cboMes.setEnabled(true);
        cboAnno.setEnabled(true);
        lblTipo.setEnabled(true);
        
        
    }//GEN-LAST:event_rbAlarmaActivadaActionPerformed

    private void rbUnaVezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnaVezActionPerformed
        // TODO add your handling code here:
        
        recurrente = false;
        rbRecurrente.setSelected(false);
        
    }//GEN-LAST:event_rbUnaVezActionPerformed

    private void cboPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPersonaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        cboPersona.addItem("------------");
        cboItem.addItem("------------");
        cboDia.addItem("--");
        cboMes.addItem("--");
        cboAnno.addItem("--");
        con = VentanaPrin.getCon();
        itemsArray = con.getItems();
        personas = con.devolverArrayListPersonas();
        
        personas.stream().forEach((e) -> {
            cboPersona.addItem(e);     //Asigna personas al combo box
        });
        for (Items e: itemsArray) {   //Asigna los Items no prestados al combo box
            if (!e.getPrestado()){
                cboItem.addItem(e.getNombre());
            }
        }
        for (int i =1; i<=31; i++){ //inicializa los combo box de la fecha
            cboDia.addItem(i);
        }
        for (int i = 1; i<=12; i++){
            cboMes.addItem(i);
        }
        for (int i = 2015; i<= 2030; i++){
            cboAnno.addItem(i);
        }
        rbUnaVez.setSelected(true);
        rbAlarmaDesactivada.setSelected(true);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        Prestamo abrir = new Prestamo ();
        abrir.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Guardar el prestamo
        //se valida que haya al menos una persona y un item seleccionado y que la fecha esté correcta
        
        if (cboPersona.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado una persona", "Error", 0);
        }
        else if(!minimo){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nungún Item", "Error", 0);
        }
        else if (alarmaActivada){ //crea prestamo con alarma
            if (cboDia.getSelectedIndex()==0 || cboMes.getSelectedIndex()==0||cboAnno.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Error", 0);                
            }
            else if (cboMes.getSelectedIndex()==2||cboMes.getSelectedIndex()==4||cboMes.getSelectedIndex()==6||cboMes.getSelectedIndex()==9||cboMes.getSelectedIndex()==11){
                if(cboMes.getSelectedIndex()==2){
                    if (cboDia.getSelectedIndex()<=28){
                        CrearPrestamoConAlarma();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Error", 0); 
                    }
                }
                else if (cboDia.getSelectedIndex()!=31){
                    CrearPrestamoConAlarma();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Error", 0); 
                }
            }
            else{
                CrearPrestamoConAlarma();
            }
        }
        else{
            con.crearPrestamo(cboPersona.getSelectedIndex()-1, itemsSeleccionados); //crea prestamo sin alarma
            JOptionPane.showMessageDialog(this, "El prestama se ha creado exitosamente", "Información", 1);
            Prestamo abrir = new Prestamo ();
            abrir.setVisible(true);
            this.setVisible(false);
        }
        System.out.println(con.getPersonas().get(0).getNumPrestamos());
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rbAlarmaDesactivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlarmaDesactivadaActionPerformed
        // TODO add your handling code here:
        
        alarmaActivada = false;
        rbAlarmaActivada.setSelected(false);
        rbUnaVez.setEnabled(false);
        rbRecurrente.setEnabled(false);
        cboDia.setEnabled(false);
        cboMes.setEnabled(false);
        cboAnno.setEnabled(false);
        lblTipo.setEnabled(false);
        
    }//GEN-LAST:event_rbAlarmaDesactivadaActionPerformed

    private void rbRecurrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRecurrenteActionPerformed
        // TODO add your handling code here:
        
        recurrente = true;
        rbUnaVez.setSelected(false);
        
    }//GEN-LAST:event_rbRecurrenteActionPerformed

    private void btnAñadirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirItemActionPerformed
        // Añadir Item
        //verifica que se haya seleccionado un Item del combo box y que este no se haya añadido anteriormente
        
        String ItemsSeleccionados = "";
        if (!(cboItem.getSelectedIndex()==0)){
            if (esta(cboItem.getItemAt(cboItem.getSelectedIndex()).toString(), itemsSeleccionados)){
                JOptionPane.showMessageDialog(this, "El Item ya ha sido añadido", "Informacion", 1);
            }
            else{
                itemsString.add(buscar(cboItem.getItemAt(cboItem.getSelectedIndex()).toString()).getNombre());
                minimo = true;
                itemsSeleccionados.add(buscar(cboItem.getItemAt(cboItem.getSelectedIndex()).toString()));
                for(String e: itemsString){//actualiza el text field
                    ItemsSeleccionados += e + ", ";
                }
                txfItemsSeleccionados.setText(ItemsSeleccionados);
                
                
                
            }
            
        }
        else{
                JOptionPane.showMessageDialog(this, "Ningún Item seleccionado", "Informacion", 1);
            }
        
    }//GEN-LAST:event_btnAñadirItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        VentanaPrin abrir = new VentanaPrin ();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // Quitar Item
        //verifica que haya al menos un Item, lo remueve y actualiza el text field
        String ItemsSeleccionados = "";
        if (!itemsString.isEmpty()){
            itemsString.remove(itemsString.size()-1);
            itemsSeleccionados.remove(itemsSeleccionados.size()-1);            
        }
        for(String e: itemsString){
            ItemsSeleccionados += e + ", ";
        }
        txfItemsSeleccionados.setText(ItemsSeleccionados);
        if (ItemsSeleccionados.isEmpty()){
            minimo = false;
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrestamosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamosCrear().setVisible(true);
            }
        });
    }
    
    // Booleano, verifica que el Item esté en el arraylist
    public boolean esta(String nombresItems, ArrayList<Items> nombreItemsString){
        
        for (Items j: nombreItemsString){
            if (j.getNombre().equals(nombresItems)){
                return true;
            }
        }

        return false;
    }
    
    //Verifica que un Item esté en el array de ser así lo retorna
    public Items buscar(String nombre){
        for (Items e: itemsArray){
            if (e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
    
    //
    public void CrearPrestamoConAlarma(){
        LocalDateTime alarma = LocalDateTime.of(2015+cboAnno.getSelectedIndex()-1, cboMes.getSelectedIndex(), cboDia.getSelectedIndex(), 00, 00);
        con.crearPrestamoConAlarma(cboPersona.getSelectedIndex()-1, itemsSeleccionados, alarma, recurrente);
        JOptionPane.showMessageDialog(this, "El prestama con alarma se ha creado exitosamente", "Información", 1);
        Prestamo abrir = new Prestamo ();
        abrir.setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirItem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox cboAnno;
    private javax.swing.JComboBox cboDia;
    private javax.swing.JComboBox cboItem;
    private javax.swing.JComboBox cboMes;
    private javax.swing.JComboBox cboPersona;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rbAlarmaActivada;
    private javax.swing.JRadioButton rbAlarmaDesactivada;
    private javax.swing.JRadioButton rbRecurrente;
    private javax.swing.JRadioButton rbUnaVez;
    private javax.swing.JTextField txfItemsSeleccionados;
    // End of variables declaration//GEN-END:variables
}
