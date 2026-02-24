package Model;

import java.util.function.BiPredicate;

public class E4BiPredicateLongString {
    public void eje4(){
        // Implementa un BiPredicate que reciba dos Strings y determine si tienen la misma longitud. Pruébalo con varios pares de palabras.

        BiPredicate<String, String> longitudIgual = (s1, s2) -> s1.length() == s2.length();

        System.out.println("La palabra manzana y pera tienen la misma longitud? "
                +longitudIgual.test("manzana", "pera"));

        System.out.println("La palabra Rafa y Hola tienen la misma longitud? "
                +longitudIgual.test("Rafa", "hola"));
    }
}
