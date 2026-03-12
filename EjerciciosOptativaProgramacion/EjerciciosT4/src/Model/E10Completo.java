package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class E10Completo {
    public void ejer10() {

        ArrayList<E10Alumno> alumnos = new ArrayList<>();
        alumnos.add(new E10Alumno("Rafa", 6.5, 9.0));
        alumnos.add(new E10Alumno("Maria", 9.9, 10.0));
        alumnos.add(new E10Alumno("Martin", 9.0, 6.8));
        alumnos.add(new E10Alumno("Lucas", 4.0, 8.0));
        alumnos.add(new E10Alumno("Miguel", 5.5, 7.0));
        alumnos.add(new E10Alumno("Erica", 7.0, 2.0));
        alumnos.add(new E10Alumno("Dylan", 5.0, 1.0));
        alumnos.add(new E10Alumno("Carmen", 0.0, 0.1));

        BiFunction<Double, Double, Double>
                notaFinal = (Double teoria, Double practica) -> (60 * teoria / 100)+(40 * practica / 100);

        BiPredicate<Double, Double>
                aprobado = (Double notaT, Double notaP)-> notaFinal.apply(notaT, notaP) > 5;

        Function<Double, String>
                letras = (Double notaF) -> {
            if (notaF > 9){
                return "A";
            } else if (notaF > 7) {
                return "B";
            }else if (notaF > 5) {
                return "C";
            }else if (notaF > 3) {
                return "D";
            }else  {
                return "F";
            }
        };

        BiConsumer<E10Alumno, Double>
                informe = (E10Alumno alumno, Double notaFin) ->
                System.out.printf("Alumno: %-15s | Nota final: %-10.2f | Letra: %-5s | Aprobado: %s%n",
                        alumno.getNombre(), notaFin,  letras.apply(notaFin), aprobado.test(alumno.getNotaTeoria(), alumno.getNotaPractica()));

        Predicate<E10Alumno>
                aprobadosYsuspensos = (alumno) -> aprobado.test(alumno.getNotaTeoria(), alumno.getNotaPractica());

        for (E10Alumno alumno :alumnos){
             informe.accept(alumno, notaFinal.apply(alumno.getNotaTeoria(), alumno.getNotaPractica()));

        }

        
    }
}
