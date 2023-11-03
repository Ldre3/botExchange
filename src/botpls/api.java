/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botpls;

import com.google.gson.Gson;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 *
 * @author jabro
 */
public class api {
    public static BigDecimal conversion(String from, String to, double dinero) throws URISyntaxException, IOException, InterruptedException{
        String link = "https://api.freecurrencyapi.com/v1/latest?base_currency="+from+"&currencies="+to;
        Gson gson = new Gson();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(link))
                .header("apikey","fca_live_fHgTErOzzFajHW32zg2xsUdMzDWQIBS4tE0kMFx5")
                .build();
        HttpResponse <String> response = httpClient.send(request, BodyHandlers.ofString());
        Respuesta rate = gson.fromJson(response.body(), Respuesta.class);
        return rate.getRate().get(to).multiply(BigDecimal.valueOf(dinero));
        
    }
}
