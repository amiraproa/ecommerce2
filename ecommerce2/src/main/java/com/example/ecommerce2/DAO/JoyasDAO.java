package com.example.ecommerce2.DAO;

import com.example.ecommerce2.entidades.Joyas;
import com.example.ecommerce2.entidades.Usuario;

public interface JoyasDAO {

    public Joyas obtenerAnilloPorId(int id);

    public Joyas obtenerPulseraPorId(int id);
    public Joyas obtenerCollarPorId(int id);
}
