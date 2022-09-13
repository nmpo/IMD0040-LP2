package br.ufrn.imd;

import java.util.List;

/**
 * Interface responsável por padronizar estratégias de verificação de elegibilidade dos contribuintes.
 */
public interface Elegibilidade {

    /**
     * Verifica a elegibilidade para aposentadoria de uma lista de contribuintes.
     * @param contribuintes contribuintes a serem verificados
     * @return Lista contendo apenas contribuintes aptos a se aposentarem
     */
    List<Contribuinte> elegiveis(List<Contribuinte> contribuintes);

}
