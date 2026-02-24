package Model;

import java.util.function.BiFunction;

public class E3BifunctionCalculadora {
    public void e3(){

        //Crea una BiFunction que reciba dos números enteros y devuelva su suma. Después, crea otras tres BiFunctions para resta, multiplicación y división.

        BiFunction<Integer, Integer, Integer> suma = (n1,n2) -> n1+n2;
        BiFunction<Integer, Integer, Integer> resta = (n1, n2) -> n1-n2;
        BiFunction<Integer, Integer, Integer> multi = (n1, n2) -> n1*n2;
        BiFunction<Integer, Integer, Double> divi = (n1, n2) -> (double) n1/(double) n2;

        System.out.println("La suma de 2 y 3 es= " +suma.apply(2,3));
        System.out.println("La resta de 2 y 3 es= " +resta.apply(2,3));
        System.out.println("La multiplicacion de 2 y 3 es= " +multi.apply(2,3));
        System.out.println("La division de 2 y 3 es = " +divi.apply(2,3));
    }
}
