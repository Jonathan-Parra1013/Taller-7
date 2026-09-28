/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.gestionenvios;

/**
 *
 * @author jonap
 */
public class Express extends TipoEnvio implements Envio{
     private static final double tarifa = 5_000;
     private String hora_limite;
      private static final double recargo = 15_000;

    public Express(String hora_limite, String codigoEnvio, String nombreDestinatario, double peso) {
        super(codigoEnvio, nombreDestinatario, peso);
        this.hora_limite = hora_limite;
        
        super.valorPagar = 0;
    }

    @Override
    public double calcularCosto() {
        super.valorPagar = (super.peso * tarifa) + recargo;
        return super.valorPagar;
    }
      
    
}
