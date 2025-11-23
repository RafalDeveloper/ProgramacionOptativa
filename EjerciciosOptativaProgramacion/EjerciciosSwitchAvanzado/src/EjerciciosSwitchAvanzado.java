import java.sql.SQLOutput;
import java.util.Scanner;

public class EjerciciosSwitchAvanzado {

    public void ejercicio01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nota obtuviste?");
        double calificacion = sc.nextDouble();

        // Convertimos el double a int según el rango indicado (truncar hacia abajo)
        int nota = (int) calificacion;

        char letra = switch (nota) {
            case 0, 1, 2, 3 -> 'F';
            case 4 -> 'D';
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> '?';
        };

        System.out.printf("Obtuviste una nota de %.2f, con una calificación de %c%n", calificacion, letra);

        sc.close();
    }

    public enum Moneda {
        DOLAR,
        LIBRA,
        YEN,
        PESO
    }

    public void ejercicio02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que cantidad de EUROS quieres convertir?");
        double euros = sc.nextDouble();

        System.out.printf("Eligue la moneda de destino.%nDOLAR, LIBRA, YEN o PESO.%n");
        String monedaDestino = sc.next().toUpperCase();

        Moneda monedadestino = Moneda.valueOf(monedaDestino);

        switch (monedadestino) {
            case DOLAR -> System.out.printf("La conversion de %.2f euros, son %.2f dolares.%n", euros, euros * 1.1);
            case LIBRA -> System.out.printf("La conversion de %.2f euros, son %.2f libras.%n", euros, euros * 0.85);
            case YEN -> System.out.printf("La conversion de %.2f euros, son %.2f yens.%n", euros, euros * 160);
            case PESO -> System.out.printf("La conversion de %.2f euros, son %.2f pesos.%n", euros, euros * 21);
        }

        sc.close();

    }

    public void ejercicio03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que tempareatura hace?");
        int temperatura = sc.nextInt();

        int rango =
                (temperatura < 0) ? 1 :
                        (temperatura <= 15) ? 2 :
                                (temperatura <= 25) ? 3 :
                                        (temperatura <= 35) ? 4 :
                                                5;

        switch (rango) {
            case 1 -> System.out.println("NOS CONGELAMOS! Hace menos de 0 grados, hay que abrigrase mucho");
            case 2 -> System.out.println("Hace bastante frio, hay que abrigarse bien");
            case 3 -> System.out.println("Hace templado, ya no hay que abrigarse tanto");
            case 4 -> System.out.println("Hace calor, con poquita ropa nos vale");
            case 5 -> System.out.println("Hace muchisima calor, bañador y a la piscina");
            default -> System.out.println("Temperatura no valida");
        }

        sc.close();
    }

    public enum CategoriaPlato {
        ENTRANTES,
        PRINCIPAL,
        POSTRE,
        BEBIDA
    }

    public void ejercicio04() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opcion.");
        System.out.println("ENTRANTES, PRINCIPAL, POSTRE, BEBIDA");
        String entrada = sc.next().toUpperCase();

        CategoriaPlato plato = CategoriaPlato.valueOf(entrada);

        switch (plato) {
            case ENTRANTES -> {
                System.out.println("=== ENTRANTES ===");
                System.out.println("Papas fritas");
                System.out.println("Ensaladas");
                System.out.println("Aceitunas");
            }
            case PRINCIPAL -> {
                System.out.println("=== PLATOS PRINCIPALES ===");
                System.out.println("Sopa");
                System.out.println("Espaguetis");
                System.out.println("Carne");
            }
            case BEBIDA -> {
                System.out.println("=== BEBIDAS ===");
                System.out.println("Agua");
                System.out.println("Cocacola");
                System.out.println("Vino");
            }
            case POSTRE -> {
                System.out.println("=== POSTRES ===");
                System.out.println("Helado");
                System.out.println("Tarta");
                System.out.println("Fruta");
            }
        }
        sc.close();
    }

    public void ejercicio05() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Selecciona una operacion (+, -, * o /)");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.printf("La suma de %.2f y %.2f es %.2f.", num1, num2, (num1 + num2));
            case '-' -> System.out.printf("La resta de %.2f y %.2f es %.2f.", num1, num2, (num1 - num2));
            case '*' -> System.out.printf("La multiplicacion de %.2f y %.2f es %.2f.", num1, num2, (num1 * num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero");
                } else {
                    System.out.printf("La division de %.2f y %.2f es %.2f.%n", num1, num2, (num1 / num2));
                }
            }
            default -> System.out.println("Operador no válido, utiliza + , - , * o / .");
        }
        sc.close();
    }

    public int obtenerHoraActual() {
        return (int) (Math.random() * 24);
    }

    public void ejercicio06() {
        int hora = obtenerHoraActual(); // Guardamos la hora en una variable

        System.out.println("Hora actual: " + hora);

        int bloque =
                (hora >= 0 && hora <= 5) ? 1 :
                        (hora >= 6 && hora <= 11) ? 2 :
                                (hora >= 12 && hora <= 19) ? 3 :
                                        (hora >= 20 && hora <= 23) ? 4 : 0;

        switch (bloque) {
            case 1 -> System.out.println("🌙 Buenas madrugadas.");
            case 2 -> System.out.println("☀️ Buenos días.");
            case 3 -> System.out.println("🌤️ Buenas tardes.");
            case 4 -> System.out.println("🌃 Buenas noches.");
            default -> System.out.println("Hora no válida");
        }
    }

    public void ejercicio07() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué puntuación obtuviste?");
        int puntuacion = sc.nextInt();

        System.out.printf("Obtuviste una puntuación de %d, por lo tanto...\n", puntuacion);

        int bloque =
                (puntuacion >= 0 && puntuacion <= 100) ? 1 :
                        (puntuacion <= 500) ? 2 :
                                (puntuacion <= 1000) ? 3 :
                                        (puntuacion <= 5000) ? 4 :
                                                (puntuacion > 5000) ? 5 : 0;

        switch (bloque) {
            case 1 -> {
                System.out.println("Nivel: Principiante.");
                System.out.println("💪 Sigue esforzándote.");
                System.out.println("🎁 Recompensa: 10 Monedas de bronce");
            }
            case 2 -> {
                System.out.println("Nivel: Intermedio.");
                System.out.println("🔥 Vas por buen camino.");
                System.out.println("🎁 Recompensa: 50 Monedas de plata");
            }
            case 3 -> {
                System.out.println("Nivel: Avanzado.");
                System.out.println("⚡ Ya eres una máquina.");
                System.out.println("🎁 Recompensa: 100 Monedas de oro");
            }
            case 4 -> {
                System.out.println("Nivel: Experto.");
                System.out.println("🏆 Impresionante rendimiento.");
                System.out.println("🎁 Recompensa: Cofre legendario");
            }
            case 5 -> {
                System.out.println("Nivel: Maestro.");
                System.out.println("👑 Estás en la cima.");
                System.out.println("🎁 Recompensa: Gema mística");
            }
            default -> System.out.println("Puntuación no válida, introduce un número superior a 0.");
        }

        sc.close();
    }

    public void ejercicio08() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que extension tiene tu archivo?");
        System.out.println("Extension disponibles: jpg, png, gig, pdf, doc, txt, mp3, wav, mp4 y avi.");
        String extension = sc.next().toLowerCase();

        switch (extension) {
            case "jpg", "png", "gif" ->
                    System.out.println("Tipo: Imagen 🖼️ | Programa recomendado: Visor de fotos / Photoshop / Paint");
            case "pdf" -> System.out.println("Tipo: Documento PDF 📄 | Programa recomendado: Adobe Reader");
            case "doc", "docx" -> System.out.println("Tipo: Documento Word 📝 | Programa recomendado: Microsoft Word");
            case "txt" -> System.out.println("Tipo: Texto plano 📃 | Programa recomendado: Bloc de notas / VS Code");
            case "mp3", "wav" -> System.out.println("Tipo: Audio 🎵 | Programa recomendado: VLC / Windows Media Player");
            case "mp4", "avi" -> System.out.println("Tipo: Vídeo 🎬 | Programa recomendado: VLC / KMPlayer");
            default -> System.out.println("Tipo: Desconocido ❓ | Programa recomendado: Ninguno disponible.");
        }
        sc.close();
    }

    public void ejercicio09() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto pesas (en kg)?");
        double peso = sc.nextDouble();
        System.out.println("¿Cuanto mides (en metros)?");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Tienes un IMC de %.2f\n", imc);

        int rango =
                (imc < 18.5) ? 1 :
                        (imc <= 24.9) ? 2 :  // Ya sabemos que es >= 18.5
                                (imc <= 29.9) ? 3 :  // Ya sabemos que es > 24.9
                                        4;

        switch (rango) {
            case 1 -> System.out.println("⚠️ Peso Bajo - Considera consultar un nutricionista");
            case 2 -> System.out.println("✅ Peso Normal - ¡Muy bien!");
            case 3 -> System.out.println("⚠️ Sobrepeso - Considera hacer más ejercicio");
            case 4 -> System.out.println("❗ Obesidad - Se recomienda consultar un médico");
            default -> System.out.println("Error en el cálculo");
        }

        sc.close();
    }

    public enum EstadoPedido {
        PENDIENTE,
        PROCESANDO,
        ENVIADO,
        EN_TRANSITO,
        ENTREGADO,
        CANCELADO;
    }

    public void ejercicio10(){


    }
}
