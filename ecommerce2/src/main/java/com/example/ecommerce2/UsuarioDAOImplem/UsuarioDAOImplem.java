package com.example.ecommerce2.UsuarioDAOImplem;

import com.example.ecommerce2.DAO.UsuarioDAO;
import com.example.ecommerce2.conexion.Conexion;
import com.example.ecommerce2.entidades.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImplem implements UsuarioDAO {
    private Connection conexion = Conexion.getConexion();
    @Override
    public List<Usuario> obtenerTodosLosUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        try{
            PreparedStatement statement = conexion.prepareStatement("Select * from usuarios");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setCorreo(resultSet.getString("correo"));
                usuario.setPassword(resultSet.getString("password"));
                usuarios.add(usuario);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int id){
        Usuario usuario = null;
        try{
            PreparedStatement statement = conexion.prepareStatement("Select * from usuarios wehere id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setCorreo(resultSet.getString("correo"));
                usuario.setPassword(resultSet.getString("password"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public Usuario obtenerUsuario(String user, String password){
        Usuario usuario = null;
        try{
            PreparedStatement statement = conexion.prepareStatement("Select * from usuarios where usuario = ? and password = ?");
            statement.setString(1, user);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setCorreo(resultSet.getString("correo"));
                usuario.setPassword(resultSet.getString("password"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
    public boolean agregarUsuario(Usuario usuario){
        String consulta = "insert into usuarios(id,usuario,nombre,apellido,correo, password) VALUES (NULL,?,?,?,?,?)";

        try{
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, usuario.getUsuario());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellido());
            st.setString(4, usuario.getCorreo());
            st.setString(5, usuario.getPassword());
            st.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public void actualizarUsuario(Usuario usuario){
        String consulta = "update usuarios set usuario = ?, nombre = ?, apellido = ?, correo = ?, password = ? where id = ?";

        try{
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, usuario.getUsuario());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellido());
            st.setString(4, usuario.getCorreo());
            st.setString(5, usuario.getPassword());
            st.setInt(6, usuario.getId());
            st.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(int id){
        String consulta = "delete from usuario where id = " + id;
        try{
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}