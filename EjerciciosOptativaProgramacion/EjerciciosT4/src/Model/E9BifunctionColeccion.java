package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class E9BifunctionColeccion {
    public void ejer9(){
        //Ejercicio 9 - BiFunction con Colecciones: Fusión de Listas
        // Implementa una BiFunction que reciba dos listas de enteros
        // y devuelva una nueva lista con todos los elementos de ambas listas,
        // pero sin duplicados y ordenada de menor a mayor.

        List<Integer> numeros1List = new ArrayList<>();
        numeros1List.add(8);
        numeros1List.add(4);
        numeros1List.add(1);
        numeros1List.add(13);
        numeros1List.add(2);
        numeros1List.add(88);

        List<Integer> numeros2List = new ArrayList<>();
        numeros2List.add(44);
        numeros2List.add(2);
        numeros2List.add(8);
        numeros2List.add(66);
        numeros2List.add(3);
        numeros2List.add(20);



        BiFunction<List<Integer>, List<Integer>, List<Integer>> fusion = (lista1, lista2) -> {
            TreeSet<Integer> resultado = new TreeSet<>();
            resultado.addAll(lista1);
            resultado.addAll(lista2);
            return new ArrayList<>(resultado);
        };


    }
}
