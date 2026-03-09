package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class E8PredicatesCompuestos {
    public void ejer8() {
        // Ejercicio 8 - Predicates Compuestos: Filtrado Múltiple
        // Crea varios Predicates para filtrar una lista de números:
        // Números mayores que 50
        // Números pares
        // Números divisibles por 3
        // Combínalos usando `and()`, `or()` y `negate()` para crear filtros complejos.

        Predicate<Integer> nMayor50 = n -> n > 50;
        Predicate<Integer> nPar = n -> n % 2 == 0;
        Predicate<Integer> nDivisible3 = n -> n % 3 == 0;

        Predicate<Integer> mayorYpar = nMayor50.and(nPar);
        Predicate<Integer> parYdiv3 = nPar.or(nDivisible3);
        Predicate<Integer> noDivisible3 = nDivisible3.negate();

        List<Integer> comprobaciones = new ArrayList<>();
        comprobaciones.add(6);
        comprobaciones.add(3);
        comprobaciones.add(2);
        comprobaciones.add(10);
        comprobaciones.add(7);
        comprobaciones.add(57);
        comprobaciones.add(58);

        comprobaciones.forEach(numero -> {
            if (mayorYpar.test(numero)) {
                System.out.printf("El numero %s, es mayor que 50 y par.\n" ,numero);
            }
        });
        comprobaciones.forEach(numero -> {
            if (parYdiv3.test(numero)) {
                System.out.printf("El numero %s es par y divisible entre 3. \n" ,numero);
            }
        });
        comprobaciones.forEach(numero -> {
            if (noDivisible3.test(numero)) {
                System.out.printf("El numero %s, no es divisile entre 3. \n" ,numero);
            }
        });
    }
}



