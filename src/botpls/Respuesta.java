package botpls;

import java.math.BigDecimal;
import java.util.Map;

// Clase para obtener el dato del gson

public class Respuesta {
    private Map <String, BigDecimal> data;

    public Respuesta(Map<String, BigDecimal> rate) {
        this.data = rate;
    }

    public Map<String, BigDecimal> getRate() {
        return data;
    }

    public void setRate(Map<String, BigDecimal> rate) {
        this.data = rate;
    }
    
    
}
