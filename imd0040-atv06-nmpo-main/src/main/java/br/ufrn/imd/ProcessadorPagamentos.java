package br.ufrn.imd;

import java.util.Collection;

public class ProcessadorPagamentos {
    public ProcessadorPagamentos(){
    }

    public boolean processarPagamento(Collection<MetodoPagamento> pagamentos){
           final boolean[] erro = {true};
           pagamentos.forEach(item -> {
               if(item.debitar()){
                   System.out.println("Deu certo");
               }else{
                   System.out.println("Estorno");
                   pagamentos.forEach(item2 -> item2.estornar());
                   erro[0] = false;
               }
           }
           );
           return erro[0];
    }
}
