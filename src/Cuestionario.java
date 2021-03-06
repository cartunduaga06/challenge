
import java.util.ArrayList;
import java.util.List;


public class Cuestionario {
    private final List<Pregunta> preguntas;
    private int aciertos;
    private int errores;


    public Cuestionario() {
        this.preguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta p) {
        this.preguntas.add(p);
    }

    public boolean  preguntar() {
        int numero = 1;
        boolean acierta1 = true;
        for (Pregunta p : this.preguntas) {
            boolean acierta = p.preguntar(numero);
            numero++;
            if (acierta) {
                System.out.println("Correcto");
                this.aciertos++;
               acierta1=true;
            } else {
                System.out.println("Incorrecto");
                this.errores++;
                System.out.println("el juego termina");
                acierta1=false;
                break;
            }

        }
     return acierta1;
    }

    public void imprimirResultados() {
        int total = this.preguntas.size();
        double porcentajeAciertos = (100 * (double) this.aciertos) / total;
        double porcentajeErrores = (100 * (double) this.errores) / total;

        System.out.printf("Total de preguntas: %d\nAciertos: %d (%.2f %%)\nErrores: %d (%.2f %%)", total, this.aciertos, porcentajeAciertos, this.errores, porcentajeErrores);
    }
}
