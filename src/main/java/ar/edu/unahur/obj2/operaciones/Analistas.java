package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;

import ar.edu.unahur.obj2.operaciones.criterios.ICriterioDeTriaje;

public class Analistas {
    private String legajo;
    private ICriterioDeTriaje criterioDeTriaje;
    private ArrayList<Alerta> HistorialDeAlertas;

    public Analistas() {
        this.HistorialDeAlertas = new ArrayList<>();
    }

    

    public void setCriterioDeTriaje(ICriterioDeTriaje criterioDeTriaje) {
        this.criterioDeTriaje = criterioDeTriaje;
    }



    public void setlegajo(String legajo) {
        this.legajo = legajo;
    }



    public void agregarAlerta(Alerta alerta) {
        HistorialDeAlertas.add(alerta);
    }

    public String getLegajo() {
        return legajo;
    }

    public ICriterioDeTriaje getCriterioDeTriaje() {
        return criterioDeTriaje;
    }

    public ArrayList<Alerta> getHistorialDeAlertas() {
        return HistorialDeAlertas;
    }
}
