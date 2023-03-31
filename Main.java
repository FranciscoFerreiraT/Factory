package com.cod.factorymethod;

public class Main {
    public static void main(String[] args) {
        TransportesFactory FabricaTransporte = new TransportesFactory();
        Transportes camion1 = FabricaTransporte.crearTransporte("Camion");
        camion1.costeTotal(101);
        camion1.embalaje(1500,200,500,810);

        System.out.println("**************************************************************");

        Transportes bicicleta1 = FabricaTransporte.crearTransporte("Bicicleta");
        bicicleta1.costeTotal(800);
        bicicleta1.embalaje(40,50,100,10);

        System.out.println("**************************************************************");

        Transportes valroNulo = FabricaTransporte.crearTransporte("Cosa");



    }
}