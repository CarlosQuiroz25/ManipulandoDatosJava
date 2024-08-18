package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // declaracion de las variables asignadas en la actividad
        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Perez";
        boolean esMayorDeEdad = true;
        
        Byte edadByte = (byte) edad; //se convierte la variable edad a un objeto de tipo Byte mediante el método autoboxing
        byte nuevaEdad = edadByte; //se convierte el objeto Byte de edad a un valor de tipo byte mediante el método unboxing

        Double salaDouble = (double) salario; //se convierte la variable salario a un objeto Double utilizando autoboxing

        System.out.println(nombre.toString()); //se imprime en consola la variable nombre mediante el método toString()

        int entero = (int) salario; //se convierte la variable salario a un valor entero utilizando el casteo
        System.out.println(entero);

        long newCodigoPostal = (short) codigoPostal; //se convierte la variable codigoPostal a un valor long mediante el casteo
        System.out.println(newCodigoPostal);

        String numeroStr = "12345678"; 
        int numeroInt = Integer.parseInt(numeroStr); //se convierte la variable numeroStr de tipo String a un valor entero mediante el parseo con el método parseInt
        
        String decimalStr = "3.14159";
        double decimalDbl = Double.parseDouble(decimalStr); //se convierte la variable decimalStr de tipo String a un valor decimal de la clase Double mediante el parseo con el método parseDouble

        System.out.println(decimalDbl);
        System.out.println(numeroInt);
        
    }
}