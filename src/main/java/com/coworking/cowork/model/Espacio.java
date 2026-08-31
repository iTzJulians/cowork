package com.coworking.cowork.model;

public class Espacio {
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public String getDescription() {
        return description;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    private Long id;
    private String nombre;
    private int capacidad;
    private double precioHora;
    private String description;
    private String nombreCategoria;
    private String nombreSede;

    public Espacio() {

    }

    public Espacio(Long id, String nombre, int capacidad, double precioHora, String description, String nombreCategoria, String nombreSede) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioHora = precioHora;
        this.description = description;
        this.nombreCategoria = nombreCategoria;
        this.nombreSede = nombreSede;
    }
}
