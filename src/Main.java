package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        //Cliente
        System.out.println("\nCliente:");
        cliente cliente1 = new cliente();
        cliente1.setNombre("Jorge");
        cliente1.setEdad(28);
        cliente1.setNumero(236958742);
        cliente1.setCredito(3800);

        System.out.println("Nombre:" + cliente1.getNombre());
        System.out.println("Edad:" + cliente1.getEdad());
        System.out.println("Numero:" + cliente1.getNumero());
        System.out.println("Credito:$" + cliente1.getCredito());

        //Trabajador
        System.out.println("\nTrabajador:");
        trabajador trabajador1 = new trabajador();
        trabajador1.setNombre("Juan");
        trabajador1.setEdad(22);
        trabajador1.setNumero(235698523);
        trabajador1.setSalario(1500);

        System.out.println("Nombre:" + trabajador1.getNombre());
        System.out.println("Edad:" + trabajador1.getEdad());
        System.out.println("Numero:" + trabajador1.getNumero());
        System.out.println("Salario:$" + trabajador1.getSalario());

    }
}

class Persona{
    private String nombre;
    private int numero;
    private int edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }
}

class cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }
}

class trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}