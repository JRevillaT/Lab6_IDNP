package com.example.lab_0006;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private float tasaNatalidad;
    private String color;

    public static ArrayList<Pais> paises;

    Pais(String n, float tn, String c){
        this.nombre = n;
        this.tasaNatalidad=tn;
        this.color = c;
    }

    //Accesores
    public String getNombre(){
        return nombre;
    }

    public float getTasaNatalidad() {
        return tasaNatalidad;
    }

    public String getColor() {
        return color;
    }

    public static void generarListaPaises(){

        paises = new ArrayList<Pais>();

        paises.add(new Pais("Argentina", 20.7f,"#2ba9ca"));
        paises.add(new Pais("Bolivia", 46.6f, "#23afa0"));
        paises.add(new Pais("Brazil", 28.6f, "#9ee0a9"));
        paises.add(new Pais("Canada", 14.5f, "#e5e5bb"));
        paises.add(new Pais("Chile", 23.4f, "#0c412e"));
        paises.add(new Pais("Colombia", 27.4f,"#377057"));
        paises.add(new Pais("Ecuador", 32.9f, "#749576"));
        paises.add(new Pais("Guyana", 28.3f, "#bec19e"));
        paises.add(new Pais("Mexico", 29f, "#201b24"));
        paises.add(new Pais("Paraguay", 34.8f, "#b9ce55"));
        paises.add(new Pais("Peru", 32.9f, "#799646"));
        paises.add(new Pais("U.S.A", 16.7f, "#456835"));
        paises.add(new Pais("Uruguay", 18f, "#55a09e"));
        paises.add(new Pais("Venezuela", 27.5f,"#7eb89c"));

    }
}
