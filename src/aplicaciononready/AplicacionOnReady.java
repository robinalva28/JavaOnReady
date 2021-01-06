/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciononready;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Robinson
 */
public class AplicacionOnReady {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        INSTANCIA DE LOS VEHICULOS
        Vehiculo v1 = new Auto("Peugeot", "206", 200000, 4);
        Vehiculo v2 = new Moto("Honda", "Titan", 60000, 125);
        Vehiculo v3 = new Auto("Peugeot", "208", 250000, 5);
        Vehiculo v4 = new Moto("Yamaha", "YBR", 80500, 160);

        //Agrego todos los vehiculos a un array
        List<Vehiculo> lista = Arrays.asList(v1, v2, v3, v4);

        //muestro los vehiculos, el mas caro, el mas barato, con busqueda y ordenados segun precio.
        System.out.println(listarVehiculos(lista));

        System.out.println("=============================");

        System.out.println(vehiculoMasCaro(lista));
        System.out.println(vehiculoMasBarato(lista));
        System.out.println(buscarLetraEnModelo('Y', lista));
        System.out.println("=============================");
        System.out.println(ordenarDeMayorAMenor(lista));

    }

    //METODOS
    
    //METODO PARA MOSTRAR LISTA DE TODOS LOS VEHICULOS
    public static String listarVehiculos(List<Vehiculo> vehiculos) {
        String listado = "";

        for (Vehiculo vehiculo : vehiculos) {
            listado += vehiculo.toString();
        }

        return listado;
    }

    //Metodo para buscar el vehiculo mas caro.
    public static String vehiculoMasCaro(List<Vehiculo> vehiculos) {
        String resultado = "";
        float precio = 0;

        for (Vehiculo vehiculo : vehiculos) {
            //verifico si el valor de un vehiculo es mayor al anterior
            //de ser mayor entonces precio tomara el valor mas alto
            if (vehiculo.getPrecio() > precio) {
                precio = vehiculo.getPrecio();
                resultado = "Vehiculo más caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo();
            }

        }

        return resultado;

    }
    
    //Metodo para buscar el vehiculo mas barato.
    public static String vehiculoMasBarato(List<Vehiculo> vehiculos) {
        String resultado = "";
        float precio = vehiculos.get(0).getPrecio();

        for (Vehiculo vehiculo : vehiculos) {
            //verifico si el valor de un vehiculo es mayor al anterior
            //de ser mayor entonces precio tomara el valor mas alto
            if (vehiculo.getPrecio() < precio) {
                precio = vehiculo.getPrecio();
                resultado = "Vehiculo más barato: " + vehiculo.getMarca() + " " + vehiculo.getModelo();
            }

        }

        return resultado;

    }

    //METODO QUE BUSCA UNA LETRA EN EL MODELO
    public static String buscarLetraEnModelo(char letra, List<Vehiculo> vehiculos) {
        String respuesta = "Vehículo que contiene en el modelo la letra " + "'"
                + letra + "' : ";

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getModelo().indexOf(letra) > -1) {
                respuesta += vehiculo.getMarca() + " "
                        + vehiculo.getModelo() + " "
                        + vehiculo.getPrecio() + " ";
            }
        }

        return respuesta;

    }

    //METODO PARA ORDENAR DE MAYOR A MENOR EN PRECIOS
    public static String ordenarDeMayorAMenor(List<Vehiculo> vehiculos) {
        String respuesta = "Vehículos ordenados por precio de mayor a menor:\n";
        
        //creo un array para almacenar los oobjetos ordenados
        Vehiculo objetos[] = new Vehiculo[vehiculos.size()];
        
        //almaceno los objetos recibidos por parametro en mi nuevo array
        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = vehiculos.get(i);
            //System.out.println(i+": "+ objetos[i] + "\n");
        }
        
        // ORDENO DENTRO DE UN ARRAY LOS ELEMENTOS DE MAYOR A MENOR PRECIO

        Vehiculo temp;
        for (int j = objetos.length + 1; j > 1; j--) {
            for (int i = objetos.length - 1; i > 0; i--) {
                if (objetos[i - 1].getPrecio() < objetos[i].getPrecio()) {
                    //System.out.println(i+" "+objetos[i].getPrecio()+ "mayor que" + (i-1) +" "+objetos[i-1].getPrecio());

                    temp = objetos[i - 1];

                    objetos[i - 1] = objetos[i];

                    objetos[i] = temp;
                }
            }
        }

        //IMPRIMO EL ARRAY YA ORDENADO DENTRO DE LA VARIABLE RESPUESTA PARA RETORNAR
        for (int i = 0; i < objetos.length; i++) {
            //System.out.println("dentro del ordenamiento");
            respuesta += objetos[i].getMarca() + " " + objetos[i].getModelo() + "\n";
        }

        return respuesta;
    }

}
