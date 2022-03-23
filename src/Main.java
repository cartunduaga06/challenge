import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cuestionario c = new Cuestionario();
        Categoria categorias = new Categoria();

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre jugador ");
        String respuesta = sc.nextLine();
        Jugador j = new Jugador(respuesta);

        categorias.agregarCategoria(c);
        categorias.agregarCategoria(c);

        c.agregarPregunta(new Pregunta("Lenguaje de programación más fácil de aprender", List.of(
                new Respuesta("Java", false),
                new Respuesta("Go", false),
                new Respuesta("Python", true),
                new Respuesta("JavaScript", false)
        )));
        c.agregarPregunta(new Pregunta("1 + 1", List.of(
                new Respuesta("3", false),
                new Respuesta("2", true),
                new Respuesta("4", false)
        )));
        c.agregarPregunta(new Pregunta("¿NetBeans es un lenguaje de programación?", List.of(
                new Respuesta("Sí", false),
                new Respuesta("No", true)
        )));

        c.agregarPregunta(new Pregunta("Lenguajes de programación (¡Miren! alguien dijo el chiste de que HTML no es un lenguaje de programación, ríanse) que sirven para programar en la web del lado del cliente", List.of(
                new Respuesta("HTML, CSS y JavaScript", true),
                new Respuesta("PHP, Python y JavaScript", false),
                new Respuesta("C y C++", false),
                new Respuesta("Perl y Kotlin", false),
                new Respuesta("Go, JavaScript y TypeScript", false)
        )));

        categorias.preguntarPorCategoria();
        System.out.println(j.getNombre());


    }
}
