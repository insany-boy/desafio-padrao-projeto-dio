package br.com.fabricaveiculos;

import br.com.fabricaveiculos.factory.CarroFactory;
import br.com.fabricaveiculos.factory.MotocicletaFactory;
import br.com.fabricaveiculos.factory.CaminhaoFactory;
import br.com.fabricaveiculos.factory.VeiculoFactory;
import br.com.fabricaveiculos.model.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        //Criação de um carro

        VeiculoFactory carroFactory = new CarroFactory();
        Veiculo carro = carroFactory.criarVeiculo();
        carro.exibirDetalhes();

        //Criando uma motocicleta
        
        VeiculoFactory motoFactory = new MotocicletaFactory();
        Veiculo moto = motoFactory.criarVeiculo();
        moto.exibirDetalhes();

       //Criando um caminhão
       
       VeiculoFactory caminhaoFactory = new CaminhaoFactory();
       Veiculo caminhao = caminhaoFactory.criarVeiculo();
       caminhao.exibirDetalhes();

    }
}
