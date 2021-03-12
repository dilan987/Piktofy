/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.usuario;

/**
 *
 * @author Vale
 */
public class ControlUsuario {

    public boolean insertarUsuario(usuario nuevousu) {
        boolean t=false;
        usuario obju= new usuario();
        usuario usu= nuevousu;

    // String sql="insert into usuarios (nombre1U, nombre2U,apellido1U,apellido2U,fotodePerfil,correoU,contraseñaU,estadoBloqueo,idRolf)value('"
    //         +usu.getNombre1U()+"','"+usu.getNombre2U()+"','"+usu.getApellido1U()+"','"+usu.getApellido2U()+"','"+usu.getFotodePerfil()+"','"+usu.getCorreoU()+"','"+usu.getContraseñaU()+"','"+
    //          usu.getEstadoBloqueo()+"','"+usu.getIdRolf()+"');";
      
      String sql="insert into usuarios (nombre1U, nombre2U,apellido1U,apellido2U,fotodePerfil,correoU,contraseñaU,estadoBloqueo,idRolf)values(?,?,?,?,?,?,?,?,?)";
      
     
      
      t=obju.insertarUsuarioSql(nuevousu,sql);
      return t;
    }
    
    public boolean actualizarUsuario(usuario nuevousu) {
        boolean t=false;
        usuario obju= new usuario();
        usuario usu= nuevousu;

    // String sql="insert into usuarios (nombre1U, nombre2U,apellido1U,apellido2U,fotodePerfil,correoU,contraseñaU,estadoBloqueo,idRolf)value('"
    //         +usu.getNombre1U()+"','"+usu.getNombre2U()+"','"+usu.getApellido1U()+"','"+usu.getApellido2U()+"','"+usu.getFotodePerfil()+"','"+usu.getCorreoU()+"','"+usu.getContraseñaU()+"','"+
    //          usu.getEstadoBloqueo()+"','"+usu.getIdRolf()+"');";
      
//      String sql="UPDATE usuarios SET nombre1U='"+usu.getNombre1U()+"',nombre2U='"+usu.getNombre2U()+"',apellido1U='"+usu.getApellido2U()+"',apellido2U='"+usu.getApellido2U()+"',fotodePerfil='"+usu.getFotodePerfil()+
//              "',correoU='"+usu.getCorreoU()+"',contraseñaU='"+usu.getContraseñaU()+"',estadoBloqueo='"+usu.getEstadoBloqueo()+"',idRolf='"+usu.getIdRolf()+"where correoU='"+usu.getCorreoU()+"';";
//      
   String sql="UPDATE usuarios SET nombre1U= ? ,nombre2U= ? ,apellido1U= ? ,apellido2U= ? ,fotodePerfil= ? ,contraseñaU= ? where correoU= ?;";
         
      
      t=obju.actualizarUsuarioSql(nuevousu, sql);
      return t;
    }
    
        public boolean actualizarUsuarioNoFoto(usuario nuevousu) {
        boolean t=false;
        usuario obju= new usuario();
        usuario usu= nuevousu;


      String sql="UPDATE usuarios SET nombre1U='"+usu.getNombre1U()+"',nombre2U='"+usu.getNombre2U()+"',apellido1U='"+usu.getApellido1U()+"',apellido2U='"+usu.getApellido2U()+"',contraseñaU='"+usu.getContraseñaU()+"' where correoU='"+usu.getCorreoU()+"';";
         
      
      t=obju.insertarUsuarioSql(sql);
      return t;
    }

    public LinkedList<usuario> consultarUsuarios() {
       String sql="Select * from usuarios;";
       usuario obju= new usuario();
       LinkedList<usuario>listu= obju.buscarUsuarios(sql);
       
       return listu;
    }

    public LinkedList<usuario> consultarUsuarios(String busqueda) {
         String sql="Select * from usuarios where correoU = '"+busqueda+"';";
       usuario obju= new usuario();
       LinkedList<usuario>listu= obju.buscarUsuarios(sql);
       
       return listu;
    }
    
        public boolean BorrarUsuario(usuario nu) {
        boolean t = false;
        usuario objc = new usuario();
        usuario usu = nu;
        String sql = "DELETE FROM usuarios WHERE correoU ='" + usu.getCorreoU() + "'";
        t = objc.borrarUsuarioSql(sql);
        return t;
    }



   


 

    }
    

