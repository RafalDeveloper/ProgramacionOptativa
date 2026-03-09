package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class E7BifunctionObjetos {

    public void ejer7() {

        // Ejercicio 7 - BiFunction con Objetos: Gestión de Productos
        // Crea una clase Producto con nombre y precio.
        // Implementa una BiFunction que reciba dos Productos y devuelva el producto con mayor precio.
        // Pruébala con una lista de al menos 5 productos.

        BiFunction<Productos, Productos, Productos> mayor = (p1, p2) -> {
            if (p1.getPrecio() < p2.getPrecio()){
                return p1;}
            else{
                return p2;}
        };


        List<Productos> listaProductos = new ArrayList<>();
        listaProductos.add(new Productos("Lapiz", 10.0));
        listaProductos.add(new Productos("Ordenador", 1200.5));
        listaProductos.add(new Productos("Boligrafo", 3.75));
        listaProductos.add(new Productos("Gafas", 190.0));
        listaProductos.add(new Productos("iPhone", 1800.25));

        Productos[] ganador = {listaProductos.get(0)};

        listaProductos.forEach(productos -> ganador[0] = mayor.apply(ganador[0], productos));

        System.out.println("El producto con precio mayor es: " +ganador[0]);
    }

    static class Productos {

        private final String nombre;
        private final Double precio;

        Productos(String nombre, Double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public Double getPrecio() {
            return precio;
        }

        @Override
        public String toString() {
            return nombre+ " (precio: " +precio+ ")";
        }
    }
}

