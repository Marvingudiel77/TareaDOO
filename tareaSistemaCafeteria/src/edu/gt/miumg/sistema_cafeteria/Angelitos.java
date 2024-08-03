package edu.gt.miumg.sistema_cafeteria;

public class Angelitos  implements Ingrediente {
    private String nombre;
    private int cantidad;

    public Angelitos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }
}