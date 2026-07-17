package ar.edu.unahur.obj2.operaciones.criterios;

import java.util.ArrayList;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class DefensaHibrida implements ICriterioDeTriaje {

    ArrayList<Integer> IPsInfraestructura;

    public DefensaHibrida(ArrayList<Integer> IPsInfraestructura) {
        this.IPsInfraestructura = IPsInfraestructura;
    }

    @Override
    public boolean criterio(Alerta alerta) {
        if (alerta.severidadBase() >= 75 || IPsInfraestructura.contains(alerta.getIPOrigen())) {
            return true;
        } else {
            return false;
        }
    }

}
