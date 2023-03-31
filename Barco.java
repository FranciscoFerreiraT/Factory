package com.cod.factorymethod;

public class Barco implements Transportes{

    
    float coste;
    int tipoEmbalaje;

  

    @Override
    public float costeTotal(int cp) {
        if (cp<10){
            coste = 0.5f;
            System.out.println("El coste del transporte para este cp es:" + coste);
        }if (cp>10 && cp<210){
            coste = 17.85f;
            System.out.println("El coste del transporte para este cp es: " + coste);
        }if (cp>=210){
            coste = 23.35f;
            System.out.println("El coste del transporte para este cp es:" + coste);
        }
        return coste;
    }
    @Override
    public int embalaje(float x, float y, float z, float peso) {
        if ((x>=2000 || y>=2000 || z>=2000) && (peso>=500)){
            tipoEmbalaje = 0;
            System.out.println("El tipo de embalaje es un pallet");
        }if ((x<2000 || y<2000 || z<2000) && (peso<500)){
            tipoEmbalaje = 1;
            System.out.println("El tipo de embalaje es una caja de cartón");
        }if ((x<500 || y<500 || z<500) && (peso<=100)) {
            tipoEmbalaje = 2;
            System.out.println("El tipo de embalaje es una caja de madera");
        }
        return tipoEmbalaje;
    }
}