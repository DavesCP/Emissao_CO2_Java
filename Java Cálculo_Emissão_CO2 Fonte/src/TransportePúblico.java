public final class TransportePúblico {
    private double emissãoDiesel; //em Kg/L
    private final double fatDiesel = 2.89; //densidade*fator de transformação em co2

    public TransportePúblico(double emissãoDiesel) {
        this.setEmissãoDiesel(emissãoDiesel);
    }

    public double getEmissãoDiesel() {
        return emissãoDiesel;
    }

    public void setEmissãoDiesel(double emissãoDiesel) {
        this.emissãoDiesel = emissãoDiesel;
    }

    public double getFatDiesel() {
        return fatDiesel;
    }
    
}
