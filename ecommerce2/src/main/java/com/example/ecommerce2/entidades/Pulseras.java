package com.example.ecommerce2.entidades;

import com.example.ecommerce2.entidades.Joyas;

public class Pulseras extends Joyas {

    private String dije;

    Pulseras(String dije, String material, String marca){
        super(material, marca);
        this.dije=dije;
    }

    public String getDije() {
        return dije;
    }

    public void setDije(String dije) {
        this.dije = dije;
    }

}


