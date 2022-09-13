package br.ufrn.imd;

public class Cartao implements MetodoPagamento {
    Cartao(){
    }

    @Override
    public boolean debitar() {
        return false;
    }

    @Override
    public void estornar() {
    }
}
