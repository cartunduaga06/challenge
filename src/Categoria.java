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
            c.preguntar();

            c.imprimirResultados();
        }
    }
}
