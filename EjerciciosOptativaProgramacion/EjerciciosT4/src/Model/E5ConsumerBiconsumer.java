package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class E5ConsumerBiconsumer {

    public static class Estudiantes {
        private final String nombre;
        private final Integer edad;

        Estudiantes (String nombre, Integer edad){
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }
        public Integer getEdad() {
            return edad;
        }
    }

    public void eje5() {

        // Crea un BiConsumer que reciba un nombre (String) y una edad (Integer) e
        // imprima un mensaje formateado como "Nombre: [nombre], Edad: [edad]".
        // Úsalo para imprimir información de varios estudiantes.

        List <Estudiantes> ListaEstudiantes = new ArrayList<>();
        ListaEstudiantes.add(new Estudiantes("Rafa", 39));
        ListaEstudiantes.add(new Estudiantes("Maria", 40));
        ListaEstudiantes.add(new Estudiantes("Martin", 5));
        ListaEstudiantes.add(new Estudiantes("Lucas", 2));

        BiConsumer<String, Integer> miConsumer = (nombre, edad) ->
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);

        ListaEstudiantes.forEach(Estudiantes ->
                miConsumer.accept(Estudiantes.getNombre(), Estudiantes.getEdad()));


//        miConsumer.accept("Rafa", 39);
//        miConsumer.accept("Maria", 40);
//        miConsumer.accept("Martin", 5);
//        miConsumer.accept("Lucas", 2);
    }



}
