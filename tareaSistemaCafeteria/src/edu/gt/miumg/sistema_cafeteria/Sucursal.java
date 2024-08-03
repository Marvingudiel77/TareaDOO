package edu.gt.miumg.sistema_cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private List<Empleado> empleados = new ArrayList<>();
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<String> especialidades = new ArrayList<>();

    public Empleado agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("El empleado se ha agregado correctamente: " + empleado.getNombre());
        return empleado;
    }

    public Ingrediente agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
        System.out.println("El ingrediente se ha agregado correctamente: " + ingrediente.getNombre());
        return ingrediente;
    }

    public Equipo agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("El equipo se ha agregado correctamente: " + equipo.getTipo());
        return equipo;
    }

    public String agregarEspecialidad(String especialidad) {
        especialidades.add(especialidad);
        System.out.println("Se ha agregado la especialidad: " + especialidad);
        return especialidad;
    }
}
