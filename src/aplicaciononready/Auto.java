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
public class Auto extends Vehiculo{
    private int puertas;

    public Auto(String marca, String modelo, float precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
      @Override
    public String toString (){
        return super.toString() + " // Puertas: " + this.puertas +
                " // Precio: " + super.getPrecio();
    }
    
}
