package Model;

import java.util.function.Function;

public class E1LambdaBasica {
    //Crea una función lambda que reciba un número entero y devuelva su cuadrado. Pruébala con los números del 1 al 5.
  public void e1() {

      Function<Integer, Integer> cuadrado = n -> n*n;

      for (int i = 1; i <= 5; i++) {
          cuadrado.apply(i);
          System.out.println("El cuadrado de "+i+ " es " +cuadrado.apply(i));
      }
  };
}