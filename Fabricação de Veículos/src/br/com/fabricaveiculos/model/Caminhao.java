package br.com.fabricaveiculos.model;

public class Caminhao implements Veiculo {
    @Override
    public void exibirDetalhes() {
        System.out.println("Veículo: Caminhão, Velocidade máxima: 100 km/h");
    }
}
