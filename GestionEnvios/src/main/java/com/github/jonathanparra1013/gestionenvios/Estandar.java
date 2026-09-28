/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.gestionenvios;

/**
 *
 * @author jonap
 */
public class Estandar extends TipoEnvio implements Envio{
    private static final double tarifa = 5_000;
    private String direccionEnvio;

    public Estandar(String direccionEnvio, String codigoEnvio, String nombreDestinatario, double peso) {
        super(codigoEnvio, nombreDestinatario, peso);
        
        this.direccionEnvio = direccionEnvio;
        super.valorPagar = 0;
        

    }

    @Override
    public double calcularCosto() {
        this.valorPagar = super.peso * tarifa;
        return this.valorPagar;
    }
   
}
