package com.cod.factorymethod;

public class Bicicleta implements Transportes{

  
    float coste;
    int tipoEmbalaje;


   
    @Override
    public float costeTotal(int cp) {
        if (cp<50){
            coste = 2f;
            System.out.println("El coste del transporte para este cp es:" + coste);
        }if (cp>500 && cp<300){
            coste = 8f;
            System.out.println("El coste del transporte para este cp es: " + coste);
        }if (cp>=300){
            coste = 11f;
            System.out.println("El coste del transporte para este cp es:" + coste);
        }
        return coste;
    }

    @Override
    public int embalaje(float x, float y, float z, float peso) {
        if ((x>=1000 | y>=1000 | z>=1000) && (peso>=50)){
            tipoEmbalaje = 0;
            System.out.println("El tipo de embalaje es un pallet");
            System.out.println("ATENCION!: Necesita ser transportado por camión");
        }if ((x<1000 | y<1000 | z<1000) && (peso<50)){
            tipoEmbalaje = 1;
            System.out.println("El tipo de embalaje es una caja de cartón");
            System.out.println("ATENCIÓN!: Necesita ser transportado por camión");
        }if ((x<200 | y<1200 | z<200) && (peso<=10)) {
            tipoEmbalaje = 2;
            System.out.println("El tipo de embalaje es una caja de madera");
            System.out.println("Dimensiones adecuadas para transportar con bicicleta");
        }
        return tipoEmbalaje;
    }
}