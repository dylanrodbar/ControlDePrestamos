/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGra;
import Contro.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author La curacao
 */
public class ItemCrear extends javax.swing.JFrame {
    Controladora con = VentanaPrin.getCon();
    private int contador;
    private ArrayList<String> categs = new ArrayList<>(); //Agregar al combo box
    private ArrayList<Integer> indices = new ArrayList<>();
    private ArrayList<String> agregados = new ArrayList<>(); //Para ir agregando los elementos en textedit
    private ArrayList<String> tipos = new ArrayList<>();  
    private String tipo;
    /**
     * Creates new form ItemCrear
     */
    public ItemCrear() {
        categs=con.devolverArrayListCategoriasStr(); //Asignar al combo box
        tipos=con.devolverArrayListTipos();
        contador=-1;
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

        jLabel5 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Boton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Texto5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Boton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JComboBox();
        Texto1 = new javax.swing.JTextField();
        Boton6 = new javax.swing.JButton();
        Texto2 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setText("Nombre");

        jLabel6.setText("Codigo");

        Boton2.setText("Agregar");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion");

        Texto5.setEnabled(false);

        jLabel8.setText("Tipo");

        Boton3.setText("Quitar");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel1.setText("Crear Item");

        Texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto1ActionPerformed(evt);
            }
        });

        Boton6.setText("Agregar");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Texto4.setEnabled(false);
        Texto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Categorias");

        Boton.setText("Crear");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Boton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton3))
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton6))
                            .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 165, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton6))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton3)
                    .addComponent(Boton2)
                    .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(Boton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Combo.addItem("-------");
        for(String e: categs)
        {
            Combo.addItem(e);
        }
        Combo2.addItem("------");
        for(String m: tipos)
        {
            Combo2.addItem(m);
        }
    }//GEN-LAST:event_formWindowOpened

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        if(Combo.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "No ha seleccionado una categoría", "Error", 0);
        }
        else if(esta(Combo.getSelectedItem().toString(),agregados))
        {
            JOptionPane.showMessageDialog(this, "La categoría seleccionada ya se encuentra agregada", "Error", 0);
        }
        else
        {
            indices.add(Combo.getSelectedIndex()-1);
            if(indices.isEmpty())
            {
                System.out.println("ESTÁ VACÍO");

            }
            System.out.println(indices.get(0).toString());

            agregados.add(Combo.getSelectedItem().toString());    //Agrega una categoría seleccionada
            contador+=1;
            String cadena = "";
            for(String e: agregados)
            {
                cadena+=e;
            }
            Texto5.setText(cadena);
        }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        if(!Texto5.getText().equals(""))
        {
            indices.remove(contador);
            agregados.remove(contador); //Quita la última categoría que se seleccionó
            contador-=1;
            String cadena = "";
            for(String e: agregados)
            {
                cadena+=e;
            }
            Texto5.setText(cadena);
        }
    }//GEN-LAST:event_Boton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaPrin abrir = new VentanaPrin ();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto1ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        if(Combo2.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un tipo", "Error", 0);
        }
        else
        {
            tipo = Combo2.getSelectedItem().toString();
            Texto4.setText(tipo);
        }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Texto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto4ActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        if(Texto1.getText().equals("") || Texto2.getText().equals("") || Texto3.getText().equals("") || Texto4.getText().equals("") || Texto5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Ha dejado un espacio en blanco", "Error", 0);
        }
        else
        {
            con.crearItem(Texto1.getText(), Texto2.getText(), Texto3.getText(), Combo2.getSelectedIndex()-1, indices);
            JOptionPane.showMessageDialog(this, "Se ha creado el ítem exitosamente", "Información", 1);
            ItemCrear abrir = new ItemCrear ();
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BotonActionPerformed

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
            java.util.logging.Logger.getLogger(ItemCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemCrear().setVisible(true);
            }
        });
    }
    
    public boolean esta(String categ, ArrayList <String> items)
    {
        for(String e: items)
        {
            if(e.equals(categ))
                return true;
        }
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton6;
    private javax.swing.JComboBox Combo;
    private javax.swing.JComboBox Combo2;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto4;
    private javax.swing.JTextField Texto5;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}