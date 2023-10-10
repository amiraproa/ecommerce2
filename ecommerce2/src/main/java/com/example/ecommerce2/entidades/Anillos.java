package com.example.ecommerce2.entidades;

public class Anillos extends Joyas {
        private double diametro;
        Anillos (double diametro, String material, String marca){
            super(material,marca);

        }

        public double getDiametro() {
            return diametro;
        }

        public void setDiametro(double diametro) {
            this.diametro = diametro;
        }
    }


