import java.util.HashMap;
import java.util.Map;

public class Batido extends Bebida{

    private final Map<Tamano, Double> precios = new HashMap<>();

    public Batido(){
        descripcion = "cafe batido";
        precios.put(Tamano.NORMAL, 0.89);
        precios.put(Tamano.MEDIANO, 0.99);
        precios.put(Tamano.GRANDE, 1.09);
    }
    @Override
    public double costo(){
        return precios.get(getTamano());
    }
}
