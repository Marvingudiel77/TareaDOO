package edu.gt.miumg.sistema_cafeteria;

public class Equipo {
    private String tipo;
    private boolean estado;
    private String nombre;

    public Equipo(String tipo, boolean estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public void encender(){
        estado = true;

        System.out.println("Se comienza a encender el equipo");
    }

    public void reparar(){
        estado = false;
        System.out.println("Se esta reparando el equipo");
        estado = true;
    }

    public void apagar(){
        estado = false;
        System.out.println("El esta apagandose");
    }


}
