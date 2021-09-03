public final class Carro extends Veículo {
    private double emissãoCarro; // em Kg/L
    private final double fatGasolina = 2.2755; //porcentagem de gasolina pura*densidade*fator de transformação em co2
    private final double fatEtanol = 0.5185; //densidade*fator de transformação em co2

    public Carro(double kmDiária, double emissãoAnual, double emissãoCarro) {
        super(kmDiária,emissãoAnual);
        this.setEmissãoCarro(emissãoCarro);
    }

    public double getFatGasolina() {
        return fatGasolina;
    }

    public double getFatEtanol() {
        return fatEtanol;
    }

    public double getEmissãoCarro() {
        return emissãoCarro;
    }

    public void setEmissãoCarro(double emissãoCarro) {
        this.emissãoCarro = emissãoCarro;
    }

}