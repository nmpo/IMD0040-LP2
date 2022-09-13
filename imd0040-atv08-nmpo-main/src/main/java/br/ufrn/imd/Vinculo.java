package br.ufrn.imd;

import java.time.LocalDate;

/**
 * Classe responsável por modelar vinculos empregatícios do contribuinte.
 * @author Gustavo Leitão
 */
public class Vinculo {

    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String cnpj;

    /**
     * Construtor dos vínculos.
     * @param dataInicial Inicio do contrato de trabalho
     * @param dataFinal Encerramento do contrato de trabalho
     * @param cnpj Cadastro nacional de pessoa jurídica
     */
    public Vinculo(LocalDate dataInicial, LocalDate dataFinal, String cnpj) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cnpj = cnpj;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public String getCnpj() {
        return cnpj;
    }
}
