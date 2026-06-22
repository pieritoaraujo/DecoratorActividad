import java.util.HashMap;
import java.util.Map;

public class TostadoNegro extends Bebida{

    private final Map <Tamano, Double> precios = new HashMap<>();

    public TostadoNegro(){
        descripcion = "cafe tostado negro";
        precios.put(Tamano.NORMAL, 0.99);
        precios.put(Tamano.MEDIANO, 1.09);
        precios.put(Tamano.GRANDE, 1.19);
    }

    @Override
    public double costo(){
        return precios.get(getTamano());
    }
}
