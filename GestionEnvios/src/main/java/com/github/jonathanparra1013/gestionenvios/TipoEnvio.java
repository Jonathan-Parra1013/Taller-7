/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.gestionenvios;
/**
 *
 * @author jonap
 */
public abstract class TipoEnvio {
    protected String codigoEnvio;
    protected String nombreDestinatario;
    protected double peso; 
    protected double valorPagar;

    public TipoEnvio(String codigoEnvio, String nombreDestinatario, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.nombreDestinatario = nombreDestinatario;
        this.peso = peso;
        this.valorPagar = 0;

    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public double getPeso() {
        return peso;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    
}
