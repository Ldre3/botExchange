package botpls;

import java.math.BigDecimal;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jabro
 */
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
