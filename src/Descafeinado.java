import java.util.HashMap;
import java.util.Map;

public class Descafeinado extends Bebida{

    private final Map<Tamano, Double> precios = new HashMap<>();

    public Descafeinado(){
        descripcion = "cafe descafeinado";
        precios.put(Tamano.NORMAL, 1.05);
        precios.put(Tamano.MEDIANO, 1.15);
        precios.put(Tamano.GRANDE, 1.25);
    }
    @Override
    public double costo(){
        return precios.get(getTamano());
    }
}
