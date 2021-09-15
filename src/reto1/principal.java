/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author USUARIO
 */
public class principal {
    public static void main(String[] args) {
        
        Autobus camion = new Autobus ("PEPE",30,false);
       
        camion.moverDerecha(5);
        camion.gestionarWifi();
        camion.gestionarAireAcondicionado();
        camion.gestionarMarcha();
        camion.gestionarMotor();
        camion.gestionarMarcha();
        camion.moverDerecha(5);
        camion.recogerPasajero(2);
        camion.gestionarPuerta();
        camion.moverArriba(10);
        camion.gestionarMarcha();
        camion.gestionarPuerta();
        camion.recogerPasajero(1);
        camion.recogerPasajero(4);
        camion.recogerPasajero(6);
        camion.gestionarWifi();
        camion.gestionarAireAcondicionado();
        camion.gestionarMarcha();
        camion.moverIzquierda(2);
        camion.dejarPasajero();
        camion.gestionarMotor();
        camion.calcularDistanciaAcopio();
        
        
        
        
       
     
        
        System.out.println(camion.getNombreConductor());
        System.out.println("numero pasajeros "+camion.getnPasajeros());
        System.out.println("Cantidad dinero "+camion.getCantidadDinero());
        System.out.println("Maximo Pasajeros "+camion.getnMaximoPasajeros());
        System.out.println("P X "+camion.getLocalizacionX());
        System.out.println("P Y "+camion.getLocalizacionY());
        System.out.println("Puerta "+camion.isPuertaAbierta());
        System.out.println("Aire "+camion.isAireAcondicionadoActivado());
        System.out.println("Motor "+camion.isMotorEncendido());
        System.out.println("Wifi "+camion.isWifiEncendido());
        System.out.println("Marcha "+camion.isEnMarcha());
        System.out.println("Distancia "+camion.calcularDistanciaAcopio());              
                

    }
    
        
    }
    
       
   
