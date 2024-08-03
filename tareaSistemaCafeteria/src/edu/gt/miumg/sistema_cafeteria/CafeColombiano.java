package edu.gt.miumg.sistema_cafeteria;

import edu.gt.miumg.sistema_cafeteria.Ingrediente;

import java.util.List;

public class CafeColombiano extends Cafe {

    private String tipoGrano;

    public CafeColombiano(String nombre, int tamano, int precio, String tipoGrano , List<Ingrediente> ingredientes) {
        super(nombre, tamano, precio, ingredientes);
        this.tipoGrano = tipoGrano;
    }

    public String getTipoGrano() {
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    public void preparar() {
        System.out.println("Comienza la preparacion del mejor cafe colombiano");

    }

    public void servir() {
        System.out.println("Se sirve perfectamente el cafe");
    }
}
