package controll;

import java.util.List;
import java.util.stream.Collectors;

import model.*;

public class ControleCarros {
    private List<Carro> carro;

    public ControleCarros(ControleDados d, int posicao, int i) {
        carro = d.getCarro();    
    }

    public String[] getCarros() {
        List<Carro> carros = carro.stream()
            .filter(carro -> carro.getMarca().equals("Audi"))
            .collect(Collectors.toList());
        
        String[] listaCarros = new String[carros.size()];
        for (int i = 0; i < carros.size(); i++) {
            listaCarros[i] = " " + carros.get(i).getNome();
        }
        return listaCarros;

    }
    public String[] getMarcas() {
        List<String> marcas = carro.stream()
            .map(Carro::getMarca)
            .distinct()
            .collect(Collectors.toList());
        
        return marcas.toArray(new String[marcas.size()]);
    }
}