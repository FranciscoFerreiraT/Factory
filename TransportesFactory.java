package com.cod.factorymethod;

public class TransportesFactory {

   

    public Transportes crearTransporte (String TipoTransporte){
        if (TipoTransporte == null || TipoTransporte.isEmpty())
            return null;
        switch (TipoTransporte){
            case "Camion":
                return new Camion();
            case "Bicicleta":
                return new Bicicleta();
            default:
                throw new IllegalArgumentException("Transporte desconocido "+ TipoTransporte);
        }

    }

}