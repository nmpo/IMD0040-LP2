package br.ufrn.imd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

public class ElebilidadeTest {

    Elegibilidade elegibilidade = FabricaElegibilidade.create();

    @Test
    void naoPossuiIdadeMasc()  {
        List<Vinculo> vinculos = Collections.EMPTY_LIST;
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1983, 1, 1), "nome", Sexo.MASCULINO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void naoPossuiIdadeFem() {
        List<Vinculo> vinculos = Collections.EMPTY_LIST;
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1983, 1, 1), "nome", Sexo.FEMININO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void possuiApenasIdadeMasc() {
        List<Vinculo> vinculos = Collections.EMPTY_LIST;
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1957, 1, 1), "nome", Sexo.MASCULINO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void possuiApenasIdadeFem() {
        List<Vinculo> vinculos = Collections.EMPTY_LIST;
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1960, 1, 1), "nome", Sexo.MASCULINO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void possuiRequisitosUmVinculoMasc() {
        Vinculo vinculo = new Vinculo(LocalDate.of(1980, 1, 1), LocalDate.of(2000, 1, 1), "11.111.111-01");
        List<Vinculo> vinculos = Arrays.asList(vinculo);
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1957, 1, 1), "nome", Sexo.MASCULINO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void possuiRequisitosDoisVinculosMasc() {
        Vinculo vinculo1 = new Vinculo(LocalDate.of(1980, 1, 1), LocalDate.of(1990, 1, 1), "11.111.111-01");
        Vinculo vinculo2 = new Vinculo(LocalDate.of(1990, 1, 1), LocalDate.of(2000, 1, 1), "11.111.111-01");
        List<Vinculo> vinculos = Arrays.asList(vinculo1, vinculo2);
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1957, 1, 1), "nome", Sexo.MASCULINO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void possuiRequisitosUmVinculoFem() {
        Vinculo vinculo = new Vinculo(LocalDate.of(1980, 1, 1), LocalDate.of(1995, 1, 1), "11.111.111-01");
        List<Vinculo> vinculos = Arrays.asList(vinculo);
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1960, 1, 1), "nome", Sexo.FEMININO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void possuiRequisitosDoisVinculosFem() {
        Vinculo vinculo1 = new Vinculo(LocalDate.of(1980, 1, 1), LocalDate.of(1990, 1, 1), "11.111.111-01");
        Vinculo vinculo2 = new Vinculo(LocalDate.of(1990, 1, 1), LocalDate.of(1995, 1, 1), "11.111.111-01");
        List<Vinculo> vinculos = Arrays.asList(vinculo1, vinculo2);
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1960, 1, 1), "nome", Sexo.FEMININO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void naoPossuiApenasIdadeMasc() {
        Vinculo vinculo = new Vinculo(LocalDate.of(1980, 1, 1), LocalDate.of(2000, 1, 1), "11.111.111-01");
        List<Vinculo> vinculos = Arrays.asList(vinculo);
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1958, 1, 1), "nome", Sexo.MASCULINO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void naoPossuiApenasIdadeFem() {
        Vinculo vinculo = new Vinculo(LocalDate.of(1980, 1, 1), LocalDate.of(1995, 1, 1), "11.111.111-01");
        List<Vinculo> vinculos = Arrays.asList(vinculo);
        Contribuinte contribuinte = new Contribuinte(LocalDate.of(1961, 1, 1), "nome", Sexo.FEMININO, vinculos);
        List<Contribuinte> result = elegibilidade.elegiveis(Arrays.asList(contribuinte));
        Assertions.assertEquals(0, result.size());
    }


}
