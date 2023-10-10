package com.example.ecommerce2.entidades;

public class Usuario {
    private int id;
    private String nombre;
    private String usuario;
    private String apellido;
    private String correo;
    private String  password;
   public Usuario(){}
    public Usuario(int id, String nombre, String usuario, String apellido, String correo, String password){
        this.id=id;
        this.usuario=usuario;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() { return usuario; }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUsuario(String usuario) {
        this.usuario=usuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}