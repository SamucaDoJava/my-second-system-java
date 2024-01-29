package com.mjv.curso.model;

import br.com.caelum.stella.validation.CPFValidator;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Objects;

public class Movie {

    public void movieList(ArrayList<String> movieList) {

        if(Objects.isNull(movieList)) {
            movieList = new ArrayList<>();
        }

        String movieOne = "Matrix";
        String movieTwo = "Barbie";

        movieList.add(movieOne);
        //movieList.add(" ");
        movieList.add(movieTwo);

        //Precisamos apenas imprimir filmes e ignorar espaços em branco
        for(String movie: movieList){
           if(StringUtils.isNotBlank(movie)) {
               System.out.println(movie);
           } else {
               System.out.println("O valor está em branco: " + movie);
           }
        }
    }

    public void cpfValidation(){
        String cpfSamuel = "072.007.454-13";
        String cpfInvalido = "12345678912";

        ArrayList<String> cpfList = new ArrayList<>();
        cpfList.add(cpfSamuel);
        cpfList.add(cpfInvalido);

        CPFValidator cpfValidator = new CPFValidator();

        for(String cpf: cpfList) {
            cpfValidator.assertValid(cpf);
            System.out.println(cpf);
        }
    }

}
