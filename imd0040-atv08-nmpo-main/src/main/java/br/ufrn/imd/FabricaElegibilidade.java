package br.ufrn.imd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Fábrica responsável por construir instância válida da interface de Elegibilidade.
 * @see Elegibilidade
 */
public class FabricaElegibilidade {

    /**
     * Cria instância da interface de Elegibilidade.
     * @return instância coma estratégia ser utilizada
     */
    public static Elegibilidade create(){
        return new Elegibilidade() {
            @Override
            public List<Contribuinte> elegiveis(List<Contribuinte> contribuintes) {
                Stream<Contribuinte> stream = contribuintes.stream();
                return stream.filter(c -> (c.getSexo().equals(Sexo.MASCULINO)  &&
                                c.getDataNascimento().getYear() <= 1957) ||
                                (c.getSexo().equals(Sexo.FEMININO)  &&
                                c.getDataNascimento().getYear() <= 1960)).collect(Collectors.toList());
            }
        };
    }

}
