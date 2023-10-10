package com.example.ecommerce2.entidades;

public class Collares extends Joyas {
    private double largo;

    Collares(double largo, String material, String marca){
        super(material, marca);
        this.largo=largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
