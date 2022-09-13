package br.ufrn.imd;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.ufrn.imd.Agenda.getAgenda;

public class AgendaTelefonica implements Agenda {

    List<Contato> contatoList = new ArrayList<>();
    @Override
    public void salvar(@NotNull Contato contato) {
        Map<String, String> mapAgenda = new HashMap<>();
        mapAgenda.put(contato.getEmail(), contato.getNome());
        contatoList.add(contato);
    }

    @Override
    public Contato buscarPorEmail(String email) {
//        contatoList.forEach(contato -> {
//            if (contato.getEmail().equals(email)) {
//                return contato;
//            }
//        });
        for (Contato contato : contatoList) {
            if (contato.getEmail().equals(email)) {
                return contato;
            }
        }
        return null;
    }

    @Override
    public Contato buscarPorNome(String nome) {
//        contatoList.forEach(contato -> {
//            if (contato.getNome().equals(nome)) {
//                return contato;
//            }
//        });
        for (Contato contato : contatoList) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }



}
