package org.example.olimpiadas_invierno;

import java.util.ArrayList;

public class Equipo {

    private String pais;
    private ArrayList<Deportista> listaDeportista;

    public Equipo(String pais) {
        this.pais = pais;
        listaDeportista = new ArrayList<>();
    }

    public Equipo() {
        pais = null;
        listaDeportista = null;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportista() {
        return listaDeportista;
    }

    public void setLstaDeportista(ArrayList<Deportista> listaDeportista) {
        this.listaDeportista = listaDeportista;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", lstaDeportista=" + lstaDeportista +
                '}';
    }

    public void inscribirDeportista(Deportista deportista){

    }
}
