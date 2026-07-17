package ar.edu.unahur.obj2.operaciones.criterios;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class EspecialistaEnAmenazasCriticas implements ICriterioDeTriaje {

    @Override
    public boolean criterio(Alerta alerta) {
        return alerta.severidadBase() >= 75;
    }

}
