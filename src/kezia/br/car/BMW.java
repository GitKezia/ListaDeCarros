package kezia.br.car;
class BMW extends Carro {
    public BMW(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " está acelerando como uma BMW.");
    }

    @Override
    public void frear() {
        System.out.println(getModelo() + " está freando como uma BMW.");
    }
}
