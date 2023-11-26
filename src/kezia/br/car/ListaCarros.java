package kezia.br.car;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros {
    public static void main(String[] args) {
        // Criando uma lista de carros
        List<Carro> listaCarros = new ArrayList<>();

        // Adicionando carros à lista
        listaCarros.add(new Tesla("Tesla "));
        listaCarros.add(new CarroSedan("Sedan "));
        listaCarros.add(new BMW("BMW "));

        // Iterando sobre a lista e chamando métodos específicos de cada tipo de carro
        for (Carro carro : listaCarros) {
            carro.acelerar();
            carro.frear();
            System.out.println(); // Adicionando uma linha em branco para separar a saída
        }
    }
}
