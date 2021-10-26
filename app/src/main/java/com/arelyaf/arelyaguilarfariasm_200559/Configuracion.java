package com.arelyaf.arelyaguilarfariasm_200559;

public class Configuracion {

    private int imagen;
    private String titulo;
    private String descripcion;

    public Configuracion(int imagen, String titulo, String descripcion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
