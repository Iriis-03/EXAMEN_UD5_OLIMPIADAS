package org.example.olimpiadas_invierno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deportista {

    private String nombre;
    private LocalDate fecha_nacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listaModalidades;

    public Deportista(String nombre, LocalDate fecha_nacimiento, int medallas, Equipo equipo) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.medallas = medallas;
        this.equipo = equipo;
        listaModalidades = new ArrayList<>();
    }

    public Deportista() {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.medallas = medallas;
        this.equipo = equipo;
        listaModalidades = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ArrayList<String> getListaModalidades() {
        return listaModalidades;
    }

    public void setListaModalidades(ArrayList<String> listaModalidades) {
        this.listaModalidades = listaModalidades;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", medallas=" + medallas +
                ", equipo=" + equipo +
                ", listaModalidades=" + listaModalidades +
                '}';
    }

    public void inscribirse(String modalidad){
        Equipo equipo = new Equipo(modalidad);
        listaModalidades.add(modalidad);
    }

    public void verModalidades(){
        System.out.println("El deportista " + getNombre() + "participa en " + listaModalidades + "modalidades");
    }

    public void verMedallero() {
        System.out.println("Deportistas que han coseguido medallas para ESPAÑA");
    }



    public void deportistaTOP(){

    }


}
