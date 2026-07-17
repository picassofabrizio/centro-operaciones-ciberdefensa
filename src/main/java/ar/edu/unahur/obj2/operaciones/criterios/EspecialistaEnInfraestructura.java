package ar.edu.unahur.obj2.operaciones.criterios;

import java.util.ArrayList;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class EspecialistaEnInfraestructura implements ICriterioDeTriaje {

    ArrayList<Integer> IPsInfraestructura;

    public EspecialistaEnInfraestructura(ArrayList<Integer> IPsInfraestructura) {
        this.IPsInfraestructura = IPsInfraestructura;
    }


    @Override
    public boolean criterio(Alerta alerta) {
        return IPsInfraestructura.contains(alerta.getIPOrigen());
    }

}
