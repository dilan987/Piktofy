/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlCategoria;
import control.ControlLike;
import control.ControlPost;
import control.ControlUsuario;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.categoria;
import modelo.like;
import modelo.post;
import modelo.usuario;
import static vista.Login.correoglobal;

/**
 *
 * @author danie
 */
public class VistaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VistaUsuario
     */
    LinkedList<like> listalikes;
    LinkedList<post> listaposts;
    LinkedList<categoria> listacategoria;
    LinkedList<usuario> listausuarios;
    LinkedList<like> listausuarioDarLike;//esta lista será para evaluar al usuario que dió like
    int i = 0;
    int j = 0;
    int k = 0;
    int contadorlike = 0;
    boolean llegada = false;

    public VistaUsuario() {
        initComponents();
        listaposts = new LinkedList<>();
        listacategoria = new LinkedList<>();
        listalikes = new LinkedList<>();
        listausuarios = new LinkedList<>();
        consultalikeBoton();
        verpost();
        verLike();
        consultalikeBoton();

        System.out.println(correoglobal);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelimage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        btnant = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();
        labelcorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labeletiqueta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncategoria = new javax.swing.JButton();
        btnvercomentarios = new javax.swing.JButton();
        labelLikes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnlike = new javax.swing.JButton();
        btnfav = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelLike = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtdescripcion.setEditable(false);
        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        btnant.setText("Anterior");
        btnant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnantActionPerformed(evt);
            }
        });

        btnsiguiente.setText("Siguiente");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });

        labelcorreo.setForeground(new java.awt.Color(102, 102, 255));
        labelcorreo.setText("jLabel1");

        jLabel1.setText("Etiqueta:");

        labeletiqueta.setText("jLabel2");

        jLabel2.setText("Categoria:");

        btncategoria.setText("jButton1");

        btnvercomentarios.setText("Ver comentarios");

        labelLikes.setText("likes");

        btnlike.setText("Me gusta");
        btnlike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlikeActionPerformed(evt);
            }
        });

        btnfav.setText("Favoritos");

        labelLike.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(labelcorreo)
                                        .addGap(299, 299, 299)
                                        .addComponent(labelLikes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelLike))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btncategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labeletiqueta))))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnlike)
                                .addGap(18, 18, 18)
                                .addComponent(btnfav)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(btnvercomentarios))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnant)
                        .addGap(18, 18, 18)
                        .addComponent(btnsiguiente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(labelimage, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelimage, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcorreo)
                    .addComponent(labelLikes)
                    .addComponent(labelLike))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labeletiqueta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btncategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvercomentarios)
                    .addComponent(btnlike)
                    .addComponent(btnfav))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnant)
                    .addComponent(btnsiguiente))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Categorias", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mi perfil", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Favoritos", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Opciones", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnantActionPerformed
        // TODO add your handling code here:

        if ((i <= listaposts.size()) && i >= 0) {
            if (i == 0) {
                JOptionPane.showMessageDialog(rootPane, "No hay más contenido");
            } else {
                i--;
                verpost();
                verLike();
                consultalikeBoton();
            }

        }
        System.out.println(correoglobal);
        //System.out.println(i);
    }//GEN-LAST:event_btnantActionPerformed

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        // TODO add your handling code here:

        if ((i <= listaposts.size()) && i >= 0) {
            if (i == (listaposts.size() - 1)) {
                JOptionPane.showMessageDialog(rootPane, "Actualice su feed");
            } else {
                i++;
                verpost();
                verLike();
                consultalikeBoton();
            }

        }
        // System.out.println(i);
        System.out.println(correoglobal);
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btnlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlikeActionPerformed
        // TODO add your handling code here:
        ControlLike cl = new ControlLike();

        if (llegada == false) {

            like nuevolike = new like(listaposts.get(i).getIdpost(), correoglobal);
            cl.insertarLike(nuevolike);

            // btnlike.setText("Me gusta");
        } else if (llegada == true) {

            like nuevolike = new like(listaposts.get(i).getIdpost(), correoglobal);
            cl.BorrarLikes(nuevolike);

        }
        consultalikeBoton();
        verLike();


    }//GEN-LAST:event_btnlikeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        verpost();
        verLike();
        consultalikeBoton();

    }//GEN-LAST:event_formWindowOpened

    public void consultalikeBoton() {
        System.err.println("Entré al metodo");
        ControlUsuario cu = new ControlUsuario();
        listausuarios = cu.consultarUsuarios(correoglobal);//esta lista va a consultar solo la id de mi login
        ControlLike cl = new ControlLike();
        listausuarioDarLike = cl.consultarLikes();
        for (int u = 0; u < listausuarios.size(); u++) {

            llegada = cl.consultarLikesPorUsuario(listaposts.get(i).getIdpost(), listausuarios.get(u).getCorreoU());

            if (llegada == true) {
                btnlike.setText("No Me gusta");

                System.out.println(llegada);
                break;
            } else {
                btnlike.setText("Me gusta");

                System.err.println(llegada);
                break;
            }

        }

    }

    private void verpost() {
        try {

            ControlCategoria objcc = new ControlCategoria();

            listacategoria = objcc.consultarCategoria();

            ControlPost cp = new ControlPost();
            listaposts = cp.consultarPosts();

            //Object[] fila = new Object[ncol];
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(listaposts.get(i).getFotoPelicula()));

            ImageIcon imageIcon = new ImageIcon(img);
            Image image = imageIcon.getImage();
            Image newImage = image.getScaledInstance(labelimage.getWidth(), labelimage.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImage);
            labelimage.setIcon(newIcon);
            labeletiqueta.setText(listaposts.get(i).getEtiqueta());

            txtdescripcion.setText(listaposts.get(i).getDescripcion());
            int categorias = listaposts.get(i).getIdCategoriastf();

            //// 
            for (j = 0; j < listacategoria.size(); j++) {
                if (listacategoria.get(j).getIdCategoriast() == listaposts.get(i).getIdCategoriastf()) {

                    btncategoria.setText(listacategoria.get(j).getTipoCategoria());
                }

            }
            ///     
            //txtcategoria.setText(Integer.toString(categorias));
            labelcorreo.setText(listaposts.get(i).getCorreoUF());
        } catch (IOException ex) {
            Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void verLike() {

        ControlLike objcl = new ControlLike();
        listalikes = objcl.consultarLikes();

        int cantlikes = objcl.consultarCantidadLikes(listaposts.get(i).getIdpost());
        labelLike.setText(String.valueOf(cantlikes));

    }

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
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnant;
    private javax.swing.JButton btncategoria;
    private javax.swing.JButton btnfav;
    private javax.swing.JButton btnlike;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JButton btnvercomentarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelLike;
    private javax.swing.JLabel labelLikes;
    private javax.swing.JLabel labelcorreo;
    private javax.swing.JLabel labeletiqueta;
    private javax.swing.JLabel labelimage;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
