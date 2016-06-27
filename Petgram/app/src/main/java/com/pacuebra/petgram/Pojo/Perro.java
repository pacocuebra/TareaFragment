package com.pacuebra.petgram.Pojo;

/**
 * Created by Francisco on 14/06/2016.
 */
public class Perro {
    private String nombre;
    private int foto;

    private int btlike;

    public Perro (int foto,String nombre, int btlike){
        this.nombre = nombre;
        this.foto = foto;

        this.btlike = btlike;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getBtlike() {
        return btlike;
    }

    public void setBtlike(int btlike) {
        this.btlike = btlike;
    }
}
