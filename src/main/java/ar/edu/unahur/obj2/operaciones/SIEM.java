package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;

import ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia.GeolocalizacionDeIP;
import ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia.HistoriaForense;
import ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia.IModulosDeInteligencia;

public class SIEM {

    private ArrayList<Alerta> alertasPendientes;

    private String modo;

    private Analistas analista;

    public SIEM(IModulosDeInteligencia modulo, Analistas analista, String modo) {
        this.alertasPendientes = new ArrayList<>();
        this.modo = modo;
        this.analista = analista;
    }

    public void agregarAlerta(Alerta alerta) {
        alertasPendientes.add(alerta);
    }

    public void asignarTrabajoAAnalista(){
        for (Alerta alerta : alertasPendientes) {
            if (analista.getCriterioDeTriaje().criterio(alerta)) {
                aplicarEnriquecimientoDeInteligencia(alerta);
                analista.agregarAlerta(alerta);
            }
        }
    }

    private void aplicarEnriquecimientoDeInteligencia(Alertas alerta) {
        if (modo == "ModoForense") {
            IModulosDeInteligencia alertaEnriquecida = new HistoriaForense(new GeolocalizacionDeIP(alerta));
        }
        
    }




}
