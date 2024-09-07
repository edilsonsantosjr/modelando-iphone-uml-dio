package org.example.models.iphone;

import org.example.models.aparelhotelefonico.AparelhoTelefonicoInterface;
import org.example.models.navegadorinternet.NavegadorInternetInterface;
import org.example.models.reprodutormusical.ReprodutorMusicalInterface;

public class Iphone implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorInternetInterface {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número : " + numero);
    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina(String url) {
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {
        System.out.println("A música está tocando!");
    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
