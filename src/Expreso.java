import java.util.HashMap;
import java.util.Map;

public class Expreso extends Bebida{

    private final Map<Tamano, Double> precios = new HashMap<>();

    public Expreso (){
        descripcion = "cafe expreso";
        precios.put(Tamano.NORMAL, 1.99);
        precios.put(Tamano.MEDIANO, 2.09);
        precios.put(Tamano.GRANDE, 2.15);
    }
    @Override
    public double costo(){
        return precios.get(getTamano());
    }
}
