package br.com.fabricaveiculos.model;

public class Carro implements Veiculo {
    @Override
    public void exibirDetalhes() {
        System.out.println("Veículo: Carro, Velocidade máxima: 180km/h");
    }
}
