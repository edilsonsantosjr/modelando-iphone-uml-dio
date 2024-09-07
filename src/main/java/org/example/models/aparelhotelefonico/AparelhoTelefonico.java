package org.example.models.aparelhotelefonico;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número : " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }
}
