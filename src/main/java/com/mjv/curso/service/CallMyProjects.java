package com.mjv.curso.service;

import com.mjv.curso.model.Movie;

public class CallMyProjects {

//    public static void main(String[] args) {
//        Movie movie = new Movie();
//
//        //movie.movieList();
//       //movie.cpfValidation();
//    }

    private static void exercicioUsuarioMaisCarro(){
        /** AQUI TODA A LOGICA DO NOSSO SERVICO UserService */
        //CadastroUsuarioService cadastroUsuarioService = new CadastroUsuarioService();

        //cadastroUsuario.cadastrar("Samuel","Samuel Ferreira Duarete", 38);
        //cadastroUsuarioService.imprimir();

        //User user = new User();
        //cadastroUsuario.cadastrar(user);
        /** FIM AQUI TODA A LOGICA DO NOSSO SERVICO UserService */

        CarroService carroService = new CarroService();

        StringBuilder texto = new StringBuilder();
        carroService.carroFabricadoNovo();
    }
}
