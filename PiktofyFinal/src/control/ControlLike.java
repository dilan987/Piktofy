/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.like;

/**
 *
 * @author Vale
 */
public class ControlLike {

    public boolean insertarLike(like nuevolike) {
             boolean t=false;
             
             like objl= new like();
             like lik= nuevolike;

      String sql="insert into likes (idpostf,correoUL)value('"+lik.getIdpostf()+"','"+lik.getCorreoUL()+"');";
 
      t=objl.insertarLikeSql(sql);
      return t;
    }

 

    /*public LinkedList<like> consultarLikes(int id) {
       
        String sql="Select * from likes where idPost=" + id+ ";";
        
        like objl= new like();

              LinkedList<like> listl= objl.consultarLikeSql(sql);
        return listl;
    }*/
    public LinkedList<like> consultarLikes() {
          String sql="Select * from likes;";
        
        like objl= new like();

              LinkedList<like> listl= objl.consultarLikeSql(sql);
        return listl;
        
    }

    public LinkedList<like> consultarLikes(int id) {
        String sql="Select * from likes where idpostf="+id+" ;";
        
        like objl= new like();

              LinkedList<like> listl= objl.consultarLikeSql(sql);
        return listl;
    }
    
    public boolean BorrarLikes(like nl)
    {
                     boolean t=false;
             
             like objl= new like();
             like lik= nl;

       String sql = "DELETE FROM likes WHERE idpostf = " +lik.getIdpostf()+" and correoUL = '" + lik.getCorreoUL() + "'";
 
      t=objl.insertarLikeSql(sql);
      return t;
        
    }


 
    
}
