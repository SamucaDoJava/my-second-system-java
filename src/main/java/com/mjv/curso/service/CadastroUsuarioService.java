package com.mjv.curso.service;

import com.mjv.curso.model.User;

public class CadastroUsuarioService {

    //O User neste momento não tem nada dentro dele, ele está como null e não tem instancia em memória
    //Ele não ocupa espaço em memória e não sobrecarrega a JVM
    private User user = null;

    /** Este é um metodo que cadastra nome e nome completo do usuário
    E a idade do usuário, ele não retorna nada apenas armazena em
    Memória os valores do atributo user; */
    public void cadastrar(String name, String fullName, int age){
        user = new User();
        user.setName(name);
        user.setFullName(fullName);
        user.setAge(age);
    }

    @Deprecated
    public void cadastrar(User user) {
        user.setName(user.getName());
        user.setFullName(user.getFullName());
        user.setAge(user.getAge());
    }

    public void imprimir(){
        System.out.println(user);
    }


}
