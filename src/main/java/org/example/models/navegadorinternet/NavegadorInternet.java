package org.example.models.navegadorinternet;

public class NavegadorInternet implements NavegadorInternetInterface {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Página sendo exibida!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }
}
