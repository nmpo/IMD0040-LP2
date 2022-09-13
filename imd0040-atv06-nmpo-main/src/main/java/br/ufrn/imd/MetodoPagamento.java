package br.ufrn.imd;

public interface MetodoPagamento {
    boolean debitar();

    void estornar();
}
