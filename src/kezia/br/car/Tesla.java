package kezia.br.car;

class Tesla extends Carro{

    public Tesla(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " está acelerando como um Tesla.");
    }

    @Override
    public void frear() {
        System.out.println(getModelo() + " está freando como um Tesla.");
    }


}
