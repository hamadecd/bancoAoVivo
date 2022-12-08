package tech.ada.banco;

import tech.ada.banco.model.OutraPessoa;
import tech.ada.banco.model.Pessoa;

import java.time.LocalDate;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Ada");
        Pessoa pessoa1 = new Pessoa("Samir", "08991606169", LocalDate.parse("1989-11-09"));
        OutraPessoa outraPessoa = new OutraPessoa("Samir", "08991606169", "09/11/1989");
        System.out.println(pessoa1.toString());
    }
}
