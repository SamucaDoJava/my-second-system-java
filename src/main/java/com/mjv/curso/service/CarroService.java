package com.mjv.curso.service;

import com.mjv.curso.builder.CarroBuilder;
import com.mjv.curso.dto.CarroDTO;
import com.mjv.curso.model.Carro;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    public CarroDTO carroFabricadoNovo(){
        // Criando uma instância (objeto) da classe Carro.
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 80000.0, Boolean.TRUE);

        // Acessando e exibindo informações do carro utilizando o método obterDescricao.
        System.out.println("Detalhes do Carro:");
        System.out.println(meuCarro.obterDescricao());

        //Alterando o ano e a o boolean setNovoCadastro do meu objeto "meuCarro"
        meuCarro.setAno(2023);
        meuCarro.setNovoCadastro(Boolean.FALSE);

              // Exibindo as informações atualizadas do carro.
        System.out.println("\nDetalhes Atualizados do Carro:");
        System.out.println(meuCarro.obterDescricao());

        CarroBuilder carroBuilder = new CarroBuilder();

        return carroBuilder.toDTO(meuCarro);
    }

    public void carroDepoisDeAuditado(){
        // Criando uma instância (objeto) da classe Carro.
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 80000.0, Boolean.TRUE);


        // Modificando o ano do carro utilizando o método setter.
        meuCarro.setAno(2023);
        meuCarro.setNovoCadastro(Boolean.FALSE);
    }

}
