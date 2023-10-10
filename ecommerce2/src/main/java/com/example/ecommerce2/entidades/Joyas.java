package com.example.ecommerce2.entidades;

public class Joyas {
    public String material;
    public String marca;
    Joyas (){
    }
    Joyas(String material,String marca){
        this.material=material;
        this.marca=marca;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

}
