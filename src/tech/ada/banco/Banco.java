package tech.ada.banco;

import tech.ada.banco.model.OutraPessoa;
import tech.ada.banco.model.Pessoa;
import tech.ada.banco.utils.LeitorTeclado;

import java.time.LocalDate;

public class Banco {
    public static void main(String[] args) {
        LeitorTeclado leitorTeclado = new LeitorTeclado();
        int numero = leitorTeclado.getNumero("Digite um número: ");
        System.out.println(numero);
    }
}
