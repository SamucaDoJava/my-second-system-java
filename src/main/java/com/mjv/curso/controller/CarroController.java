package com.mjv.curso.controller;


import com.mjv.curso.dto.CarroDTO;
import com.mjv.curso.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService coCarroService;

    @GetMapping("/list")
    public String carro(){
       return coCarroService.carroFabricadoNovo().toString();
    }

    //TODO Fazer isso amanha
    @PostMapping("/save")
    public String save(CarroDTO carroDTO){
        return null;
    }

}
