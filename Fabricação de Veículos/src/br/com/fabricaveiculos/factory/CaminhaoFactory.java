package br.com.fabricaveiculos.factory;

import br.com.fabricaveiculos.model.Caminhao;
import br.com.fabricaveiculos.model.Veiculo;

public class CaminhaoFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Caminhao();
    }

}
