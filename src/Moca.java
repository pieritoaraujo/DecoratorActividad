import java.util.HashMap;
import java.util.Map;

public class Moca extends DecoratorComplemento {
    Bebida bebida;

    private final Map<Tamano, Double> precios = new HashMap<>();

    public Moca(Bebida bebida){
        this.bebida = bebida;
        precios.put(Tamano.NORMAL, 0.10);
        precios.put(Tamano.MEDIANO, 0.15);
        precios.put(Tamano.GRANDE, 0.20);
    }
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " con moca";
    }

    @Override
    public double costo(){
        return bebida.costo() + precios.get(bebida.getTamano());
    }
    @Override
    public Tamano getTamano(){
        return bebida.getTamano();
    }
}
