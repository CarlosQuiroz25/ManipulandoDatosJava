package com.example;

public class Auto {

    String color;
    String marca;
    int modelo;
    int id;

    public void detalles(){
        System.out.println("el color del carro es " + color + "," + " la marca es " + marca + " y el modelo es " + modelo);
    }

    public void acelerar(){
        System.out.println("el carro " + id + " comineza a acelerar");
    }
}
