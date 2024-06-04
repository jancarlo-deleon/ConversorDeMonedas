package consultas;

import com.google.gson.Gson;
import dto.MonedaDto;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    public MonedaDto conversorDeMonedas(String monedaBase, String monedaObjetivo){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9d77872c5e09aa2a9bb6c9f8/pair/"+monedaBase+"/"+monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),MonedaDto.class);
        } catch (Exception e) {
            throw new RuntimeException("ERROR al tratar de convertir la moneda: " + e);
        }

    }

    public MonedaDto conversorDeMonedasConCantidad(String monedaBase, String monedaObjetivo, Double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9d77872c5e09aa2a9bb6c9f8/pair/"+monedaBase+"/"+monedaObjetivo+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),MonedaDto.class);
        } catch (Exception e) {
            throw new RuntimeException("ERROR al tratar de convertir la moneda: " + e);
        }

    }

}
