import java.util.ArrayList;
import java.util.Scanner;

public class UsaClasses implements MostrarDados{
    
    public static void main(String[] args) {
        double fatMulti = 0;
        Scanner leia = new Scanner(System.in);
        ArrayList<Double> guardar = new ArrayList();
        
        System.out.println("Digite a distância diária percorrida em Km abaixo(Ida e Volta): ");
        guardar.add(leia.nextDouble());  //guardar[0] 
        System.out.println("Digite quantas vezes por semana realiza esse trajeto:");
        guardar.add(leia.nextDouble());  //guardar[1]
        System.out.println("Digite a eficiência do motor em Km/Litro abaixo :");
        guardar.add(leia.nextDouble());  //guardar[2]
        
        Carro gol = new Carro(guardar.get(0),Veículo.distânciaAnual(guardar.get(0),guardar.get(1)),2.21);
        TransportePúblico ônibus = new TransportePúblico(3.41);
        
        System.out.println("Escolha o tipo de combustível utilizado:");
        System.out.println("[1] Gasolina ");
        System.out.println("[2] Etanol ");
        int escolha = leia.nextInt();
        if (escolha == 1){
            fatMulti = gol.getFatGasolina();
        }else
            if (escolha == 2){
                fatMulti = gol.getFatEtanol();
            }
        
        System.out.println("Digite quantas pessoas vão embarcadas durante seu trajeto: ");
        guardar.add(leia.nextDouble());  //guardar[3]
        
        gol.setEmissãoCarro(Veículo.calculoFinal(Veículo.litroAnual(Veículo.distânciaAnual(guardar.get(0), guardar.get(1)), guardar.get(2)), fatMulti));
        System.out.println("A estimativa de sua emissão média de CO2 anual por pessoa é: " + Math.round(gol.getEmissãoCarro()/guardar.get(3)) + " Kg/CO2");
        
        ônibus.setEmissãoDiesel(Veículo.calculoFinal(Veículo.litroAnual(Veículo.distânciaAnual(guardar.get(0), guardar.get(1)), 2.567), ônibus.getFatDiesel()));
        System.out.println("A estimativa de emissão média de CO2 anual por pessoa em um ônibus com média de 30 pessoas é: " + Math.round(ônibus.getEmissãoDiesel()/30) + " Kg/CO2");
        
    }

    @Override
    public void imprimirDados() {
        
    }
}