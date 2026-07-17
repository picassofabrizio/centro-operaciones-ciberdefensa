package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;

import ar.edu.unahur.obj2.operaciones.criterios.ICriterioDeTriaje;

public class Analistas {
    private final String legajo;
    private ICriterioDeTriaje criterioDeTriaje;
    private ArrayList<Alerta> HistorialDeAlertas;

    public Analistas(String legajo, ICriterioDeTriaje criterioDeTriaje) {
        this.legajo = legajo;
        this.criterioDeTriaje = criterioDeTriaje;
        this.HistorialDeAlertas = new ArrayList<>();
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
