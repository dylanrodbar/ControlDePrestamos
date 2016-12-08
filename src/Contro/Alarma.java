/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contro;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Diego
 */

public class Alarma implements Serializable {
    LocalDateTime Fecha;
    boolean activada;
    boolean recurrente;

    public Alarma(LocalDateTime Fecha, boolean recurrente) {
        this.Fecha = Fecha;
        activada = true;
        this. recurrente = recurrente;
        
    }

    public boolean isRecurrente(){
        return recurrente;
    }
    
    
    public boolean fueraDeTiempo(){
        return Fecha.isBefore(LocalDateTime.now());
    }
    
    
    public LocalDateTime getFecha() {
        return Fecha;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }
    
    
    
}
