/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.jonathanparra1013.gestionenvios;

/**
 *
 * @author jonap
 */
public interface Envio {
    
    public double calcularCosto();
    String getCodigoEnvio();
    String getNombreDestinatario();
    double getPeso();
}
