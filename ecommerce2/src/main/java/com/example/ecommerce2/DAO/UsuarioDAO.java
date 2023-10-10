package com.example.ecommerce2.DAO;

import com.example.ecommerce2.entidades.Usuario;

import java.util.List;

public interface UsuarioDAO {
    public List<Usuario> obtenerTodosLosUsuarios();
    public Usuario obtenerUsuarioPorId(int id);

    public Usuario obtenerUsuario(String usuario,String password);
    public boolean agregarUsuario(Usuario usuario);

    public void actualizarUsuario(Usuario usuario);

    public void eliminarUsuario(int id);
}