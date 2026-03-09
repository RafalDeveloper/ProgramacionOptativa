package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class E2PredicateFiltroN {
    // Utiliza un Predicate para crear una función lambda que determine si un número es par.
    // Aplícala a una lista de números del 1 al 20 y muestra solo los pares.

    public void e2(){
        Predicate<Integer> nPar = n -> n % 2 == 0; // Creo funcion predicate (devuelve True o false)

        List<Integer> comprobarPares = new ArrayList<>(); // Creamos lista vacia para despues rellenarla

        for (int i = 1; i <= 20; i++) { // Recorro lista con 20 numeros
            comprobarPares.add(i); // Agrego los 20 numeros a lista
        }

        for (Integer item:comprobarPares){ // ForEach de la lista
            if (nPar.test(item)){ // Hacemos "Test" para comprobar si entra por la funcion Predicate o no
                System.out.println("El numero " +item+ " de la lista, es par.");
            }
        }
    }
}
