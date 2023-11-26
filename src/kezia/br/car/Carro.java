package kezia.br.car;

import java.util.ArrayList;
import java.util.List;

// Classe abstrata representando um carro genérico
abstract class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    // Métodos abstratos que as subclasses devem implementar
    public abstract void acelerar();

    public abstract void frear();
}

