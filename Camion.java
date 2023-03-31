package com.cod.factorymethod;

public class Camion implements Transportes{

  
    float coste;
    int tipoEmbalaje;

 
    @Override
    public float costeTotal(int cp) {
        if (cp<100){
            coste = 10f;
            System.out.println("El coste del transporte para este cp es:" + coste);
        }if (cp>100 && cp<500){
            coste = 15f;
            System.out.println("El coste del transporte para este cp es: " + coste);
        }if (cp>=500){
            coste = 20f;
            System.out.println("El coste del transporte para este cp es:" + coste);
        }
        return coste;

    }

    @Override
    public int embalaje(float x, float y, float z, float peso) {
        if ((x>=1000 || y>=1000 || z>=1000) && (peso>=50)){
            tipoEmbalaje = 0;
            System.out.println("El tipo de embalaje es un pallet");
        }if ((x<1000 || y<1000 || z<1000) && (peso<50)){
            tipoEmbalaje = 1;
            System.out.println("El tipo de embalaje es una caja de cartón");
        }if ((x<200 || y<1200 || z<200) && (peso<=10)) {
            tipoEmbalaje = 2;
            System.out.println("El tipo de embalaje es una caja de madera");
        }
        return tipoEmbalaje;
    }
}