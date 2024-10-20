package br.com.fabricaveiculos.model;

public class Motocicleta implements Veiculo {
    @Override
    public void exibirDetalhes() {
        System.out.println("Veículo: Motocicleta, Velocidade máxima: 120 km/h");
    }
}
