/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.post;

/**
 *
 * @author Vale
 */
public class ControlPost {

    public boolean insertarPost(post nuevoPost) {
        boolean t = false;

        post objp = new post();
        post p = nuevoPost;

        // String sql="insert into posts (imagen,descripcion,estadobloqueoPost,idCategoriastf,correoUp,etiqueta)value('"+p.getImagen()+"','"+p.getDescripcion()+"','"+p.getEstadoBloqueoPost()+"','"+p.getIdCategoriastf()+"','"+p.getIdUsuariof()+"','"+p.getEtiqueta()+"');";
        String sql = "insert into posts (imagen,descripcion,estadobloqueoPost,idCategoriastf,correoUp,etiqueta)values(?,?,?,?,?,?)";
        t = objp.insertarPostSql(nuevoPost, sql);
        return t;
    }

    public LinkedList<post> consultarPosts() {
        String sql = "Select * from posts;";
        post objp = new post();
        LinkedList<post> listp = objp.consultaPostSql(sql);
        return listp;
    }

    public boolean BorrarPost(post np) {
        boolean t = false;

        post objp = new post();
        post pos = np;

        String sql = "DELETE FROM posts WHERE idpost = '" + pos.getIdpost() + "'";

        t = objp.borrarPostSql(sql);
        return t;

    }

    public boolean ModificarPost(post np) {
        boolean t = false;

        post objp = new post();
        post pos = np;

        String sql = "UPDATE posts SET descripcion='" + pos.getDescripcion() + "', etiqueta='" + pos.getEtiqueta() + "', idCategoriastf='" + pos.getIdCategoriastf() + "'where idpost='" + pos.getIdpost() + "'";

        t = objp.modificarPost(sql);
        return t;

    }
}
