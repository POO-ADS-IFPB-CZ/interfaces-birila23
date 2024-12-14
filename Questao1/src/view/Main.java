package view;

import model.Ciclista;
import model.*;

public class Main {
    public static void main(String[] args) {
        Ciclista ciclista = new Triatleta("Ana");
        ciclista.correrDeBicicleta();

        Corredor corredor = new Triatleta("Joaquim");
        corredor.correr();

        Nadador nadador = new Triatleta("Maria");
        nadador.aquecer();
    }
}