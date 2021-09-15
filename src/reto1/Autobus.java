/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

public class Autobus{
    //Inserte aca los atributos
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;           
    
    
    //Inserte aca el método constructor
    
    public Autobus (String nombreConductor, int nMaximoPasajeros , boolean puertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;        
        
    }
    
    
    //Inserte aca los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero(int estrato){
        int costo = 0;
        if (enMarcha == false && nPasajeros< nMaximoPasajeros ) {
            if (estrato <= 2){
                costo = 1500;
            }else if (estrato <= 4){
                costo = 2600;
            }else {
                costo = 3000;
        }
        cantidadDinero +=costo;
        nPasajeros+=1;
        }         
    }
    
    public void dejarPasajero(){
        
        if (enMarcha == false){
           nPasajeros =nPasajeros-1; 
        }
        
        
    }
    
    public double calcularDistanciaAcopio (){
        
       double x = Math.pow(localizacionX, 2);
       double y = Math.pow(localizacionY, 2);
       double distancia = Math.sqrt(x+y);         
       
       return distancia;
        
    }
    
    public void gestionarPuerta (){
        if (enMarcha == false){
        
        puertaAbierta = !puertaAbierta;
        }
        
    }
    
    public void gestionarAireAcondicionado (){
        if  (motorEncendido == true){       
        aireAcondicionadoActivado = !aireAcondicionadoActivado;
        }
        
    }
    
    public void gestionarMotor (){
        
        motorEncendido = !motorEncendido;
        if (motorEncendido == false){
            aireAcondicionadoActivado = false;
            motorEncendido = false;
            wifiEncendido = false;
            enMarcha = false;
        }
        
    }
    
    public void gestionarWifi (){
        if  (motorEncendido == true){         
        wifiEncendido = !wifiEncendido;
        }
        
    }
    
    public void gestionarMarcha (){
        if (motorEncendido == true && puertaAbierta == false){
            enMarcha = !enMarcha;
        }
        
        
    }
    
    public void moverDerecha (double d){
        if (enMarcha == true){
            localizacionX += d;
        }        
        
        
    }
    
    public void moverIzquierda (double d){
        if (enMarcha == true){        
        localizacionX -= d;
        }
        
    }
    
    public void moverArriba (double d){
        if (enMarcha == true){        
        localizacionY += d;
        }
        
    }
    
    public void moverAbajo (double d){
        if (enMarcha == true){       
        localizacionY -= d;
        }
        
    }
       
    
    //Inserte aca los SETTERS Y GETTERS

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
    
    
}