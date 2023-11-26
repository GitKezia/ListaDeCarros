package kezia.br.car;

// Exemplo de outra classe concreta que estende a classe abstrata Carro
class CarroSedan extends Carro {
    public CarroSedan(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " está acelerando como um sedan.");
    }

    @Override
    public void frear() {
        System.out.println(getModelo() + " está freando como um sedan.");
    }
}
