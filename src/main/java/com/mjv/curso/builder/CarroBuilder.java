package com.mjv.curso.builder;

import com.mjv.curso.dto.CarroDTO;
import com.mjv.curso.model.Carro;

import java.util.List;

public class CarroBuilder {

    public CarroDTO toDTO(Carro carro) {
        CarroDTO carroDTO = new CarroDTO();

        carroDTO.setAno(carro.getAno());
        carroDTO.setMarca(carro.getMarca());
        carroDTO.setModelo(carro.getModelo());
        carroDTO.setPreco(carro.getPreco());
        carroDTO.setCadastrado(carro.getCadastrado());

        return carroDTO;
    }

    public Carro toEntity(CarroDTO carroDTO){
        return null;
    }

    public List<CarroDTO> toListDTO(List<Carro> carroList) {
        return null;
    }

    public List<Carro> toList(List<CarroDTO> carroDTOList) {
        return null;
    }

}
