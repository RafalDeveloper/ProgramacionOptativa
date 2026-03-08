package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class E6Function {
    public void eje6() {

        // Utiliza Function y el método andThen()
        //  para crear una cadena de operaciones:
        //  toma un número, súmale 10, multiplícalo por 2, y conviértelo a String.
        //  Aplícalo a una lista de números.

        Function<Integer, Integer> suma10 = numero -> numero + 10;
        Function<Integer, Integer> multi2 = numero -> numero * 2;
        Function<Integer, String> astring = String::valueOf;
        // Function<Integer, String> astring = numero -> String.valueOf(numero); Es lo mismo que lo de arriba

        Function<Integer, String> entero = suma10.andThen(multi2).andThen(astring);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);

        numeros.forEach(numero -> System.out.println(entero.apply(numero)));


    }
}
