package com.mjv.curso.service;

public class CallMyProjects {


    public static void main(String[] args) {

        /** AQUI TODA A LOGICA DO NOSSO SERVICO UserService */
        //CadastroUsuarioService cadastroUsuarioService = new CadastroUsuarioService();

        //cadastroUsuario.cadastrar("Samuel","Samuel Ferreira Duarete", 38);
        //cadastroUsuarioService.imprimir();
        
        //User user = new User();
        //cadastroUsuario.cadastrar(user);
        /** FIM AQUI TODA A LOGICA DO NOSSO SERVICO UserService */

        CarroService carroService = new CarroService();

        carroService.carroFabricadoNovo();

    }
}
