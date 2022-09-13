package br.ufrn.imd;

import java.time.LocalDate;
import java.util.List;

/**
 * Classe responsável por armazenar dados do contribuinte
 */
public class Contribuinte {

    private LocalDate dataNascimento;
    private String nome;
    private Sexo sexo;
    private List<Vinculo> vinculos;

    /**
     * Construtor de um contribuinte.
     * @param dataNascimento Data de nascimento
     * @param nome Nome do contribuinte
     * @param sexo Sexo do contribuinte
     * @param vinculos Vinculos empregatícios
     */
    public Contribuinte(LocalDate dataNascimento, String nome, Sexo sexo, List<Vinculo> vinculos) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sexo = sexo;
        this.vinculos = vinculos;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }
}
