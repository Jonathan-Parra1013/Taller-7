/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.gestionenvios;

/**
 *
 * @author jonap
 */
public class Internacional extends TipoEnvio implements Envio{
    private static final double tarifa = 12_000;
    private double impuesto;
    private double seguro;
    private String pais_destino;

    public Internacional(String pais_destino, String codigoEnvio, String nombreDestinatario, double peso) {
        super(codigoEnvio, nombreDestinatario, peso);
        this.pais_destino = pais_destino;
        this.impuesto = 0.10;
        this.seguro = 0.05;
        super.valorPagar = 0;
    }

    @Override
    public double calcularCosto() {
        super.valorPagar = tarifa * peso;
        impuesto = impuesto * super.valorPagar;
        seguro = seguro * super.valorPagar;
        
        super.valorPagar = super.valorPagar + impuesto + seguro;
        return super.valorPagar;
    }

    
    
}
