public abstract class Veículo {
    private double kmDiária, emissãoAnual;

    public Veículo(double kmDiária, double emissãoAnual){
        this.setKmDiária(kmDiária);
        this.setEmissãoAnual(emissãoAnual);
    }
    
    public static double distânciaAnual(double kmDiária, double semanal){
        double resultado = kmDiária * semanal * 4 * 12;
        return resultado;
    }
    
    public static double litroAnual(double kmAnual, double eficienciaMotor){
        double resultado = kmAnual / eficienciaMotor;
        return resultado;
    }
    
    public static double calculoFinal(double litroAnual, double fatMulti){
        double resultado = litroAnual * fatMulti;
        return resultado;
    }
    
    public double getKmDiária() {
        return kmDiária;
    }
    
    public void setKmDiária(double kmDiária) {
        this.kmDiária = kmDiária;
    }

    public double getEmissãoAnual() {
        return emissãoAnual;
    }

    public void setEmissãoAnual(double emissãoAnual) {
        this.emissãoAnual = emissãoAnual;
    }
    
}