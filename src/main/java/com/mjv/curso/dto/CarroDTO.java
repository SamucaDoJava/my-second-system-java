package com.mjv.curso.dto;


import com.mjv.curso.model.User;

public class CarroDTO {

    Integer id;

    // Atributos (características) do carro.
    private String marca; // Ex: Toyota, Ford, etc.
    private String modelo; // Ex: Corolla, Mustang, etc.
    private int ano; // Ano de fabricação do carro.
    private double preco; // Preço do carro em reais.

    private Boolean novoCadastro;

    public CarroDTO(){

    }


    private User user;

    // Construtor para inicializar um objeto Carro com valores específicos.
    public CarroDTO(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public CarroDTO(String marca, String modelo, int ano, double preco, Boolean novoCadastro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.novoCadastro = novoCadastro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNovoCadastro(Boolean novoCadastro) {
        this.novoCadastro = novoCadastro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Boolean getCadastrado() {
        return novoCadastro;
    }

    public void setCadastrado(Boolean cadastrado) {
        this.novoCadastro = novoCadastro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    // Método que retorna a descrição completa do carro.
    public String obterDescricao() {
        return "Marca: " + marca + "\nModelo: " + modelo +
                "\nAno: " + ano + "\nPreço: R$" + preco +
                "\nCarro Novo? " + novoCadastro;
    }

    // Métodos getter e setter para acessar e modificar os atributos encapsulados.
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "CarroDTO{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                ", novoCadastro=" + novoCadastro +
                ", user=" + user +
                '}';
    }
}
