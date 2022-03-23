import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private final List<Cuestionario> categorias;

    public Categoria() {
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria (Cuestionario c){this.categorias.add(c);}

    public void preguntarPorCategoria(){
        for(Cuestionario c: this.categorias){
            if(c.preguntar()==false){ c.imprimirResultados(); break;}


            System.out.println("\n muy bien pasas a la siguiente ronda de preguntas");
            System.out.println("---------------------------------------");
        }
    }
}
