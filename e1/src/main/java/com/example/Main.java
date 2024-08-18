package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        persona p1 = new persona();
        p1.nombre = "juan";
        p1.saludar();
        persona p2 = new persona();
        p2.nombre = "maria";
        p2.saludar();

        Auto a1 = new Auto();
        a1.color = "amarillo";
        a1.marca = "Mazda";
        a1.modelo = 2019;
        a1.detalles();
        a1.id = 1;

        Auto a2 = new Auto();
        a2.color = "verde";
        a2.marca = "Renault";
        a2.modelo = 2020;
        a2.detalles();
        a2.id = 2;
        a2.acelerar();
    }
}