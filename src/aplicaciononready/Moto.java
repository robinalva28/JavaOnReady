/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciononready;

/**
 *
 * @author Robinson
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, float precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    
    @Override
    public String toString (){
        return super.toString() + " // Cilindrada: " + this.cilindrada +
                "cc // Precio: " + super.getPrecio();
    }
    
    
}
