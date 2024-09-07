package org.example.main;


import org.example.models.aparelhotelefonico.AparelhoTelefonicoInterface;
import org.example.models.iphone.Iphone;
import org.example.models.navegadorinternet.NavegadorInternetInterface;
import org.example.models.reprodutormusical.ReprodutorMusicalInterface;
import org.example.models.reprodutormusical.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        ReprodutorMusicalInterface reprodutorMusical = iphone;
        AparelhoTelefonicoInterface aparelhoTelefonico = iphone;
        NavegadorInternetInterface navegadorInternet = iphone;

        reprodutorMusical.tocar();
        aparelhoTelefonico.ligar("81900000000");
        navegadorInternet.adicionarNovaAba();
    }
}