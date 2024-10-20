package br.com.fabricaveiculos.factory;

import br.com.fabricaveiculos.model.Motocicleta;
import br.com.fabricaveiculos.model.Veiculo;

public class MotocicletaFactory extends VeiculoFactory {            
    @Override
    public Veiculo criarVeiculo() {
        return new Motocicleta();
    }
}
