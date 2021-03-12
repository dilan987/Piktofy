/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlCategoria;
import control.ControlPost;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.categoria;
import modelo.post;

/**
 *
 * @author danie
 */
public class VistaPostI extends javax.swing.JFrame {

    /**
     * Creates new form VistaPostI
     */
      LinkedList<categoria>listacategoria;
      LinkedList<post>listapost;
    public VistaPostI() {
        initComponents();
          listacategoria=new LinkedList<>();
          listapost=new LinkedList<>();
    }
public String filename;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnañadir = new javax.swing.JButton();
        txtdescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        txtfile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcorreoU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEtiqueta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbcategorias = new javax.swing.JComboBox<>();
        labelimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnañadir.setText("Añadir Post");
        btnañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirActionPerformed(evt);
            }
        });

        jLabel1.setText("Añada una descripción");

        btnbuscar.setText("Buscar imagen");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtfile.setEditable(false);

        jLabel2.setText("categorias");

        jLabel3.setText("correoU");

        jLabel4.setText("Etiqueta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnañadir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txtfile, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcorreoU)
                                        .addComponent(txtEtiqueta)
                                        .addComponent(cmbcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(labelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnañadir)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirActionPerformed
       // SimpleDateFormat DateFormat= new SimpleDateFormat("YYYY-MM-dd");
      //LocalDate now = LocalDate.now();
       
        
        
        String imagen= filename;
       String descripcion= txtdescripcion.getText();
       ///String fechaPost = DateFormat.format(now);
       int idCategoriastf=0;
       String CorreoUF = txtcorreoU.getText();
       String etiqueta= txtEtiqueta.getText();
          for (int i = 0; i < listacategoria.size(); i++) {
              categoria get = listacategoria.get(i);
              String cat= String.valueOf(cmbcategorias.getSelectedItem());
            if(cat.equals(get.getTipoCategoria()))
            {
                idCategoriastf=get.getIdCategoriast();
            }
            
        }
       post nuevoPost= new post(imagen, descripcion, 0, idCategoriastf, CorreoUF, etiqueta);
        ControlPost objP= new ControlPost();
        //System.out.println(now);
        boolean t= objP.insertarPost(nuevoPost);
        
         if(t==true){
            JOptionPane.showMessageDialog(rootPane, "Se insertó el post");
            
        }else {
               JOptionPane.showMessageDialog(rootPane, "No se insertó el post");
        }   // TODO add your handling code here:
      
        
    }//GEN-LAST:event_btnañadirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
     JFileChooser chooser = new JFileChooser();
     chooser.showOpenDialog(null);
     File f= chooser.getSelectedFile();
      filename= f.getAbsolutePath();
     txtfile.setText(filename);
     
                

            ImageIcon imageIcon = new ImageIcon(filename);
            Image image = imageIcon.getImage();
            Image newImage = image.getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImage);
            labelimagen.setIcon(newIcon);
     
  
     
     
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       ControlCategoria objcc= new ControlCategoria();
         listacategoria= objcc.consultarCategoria();
         for (int j = 0; j < listacategoria.size(); j++) {
             categoria objcategoria = listacategoria.get(j);
             cmbcategorias.addItem(objcategoria.getTipoCategoria());
        //Se estan consultando los paises 
        
       
          
        }
        
       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(VistaPostI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPostI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPostI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPostI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPostI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnañadir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> cmbcategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelimagen;
    private javax.swing.JTextField txtEtiqueta;
    private javax.swing.JTextField txtcorreoU;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfile;
    // End of variables declaration//GEN-END:variables
}
