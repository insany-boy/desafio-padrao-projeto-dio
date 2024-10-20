package br.com.fabricaveiculos.factory;

import br.com.fabricaveiculos.model.Carro;
import br.com.fabricaveiculos.model.Veiculo;

public class CarroFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
