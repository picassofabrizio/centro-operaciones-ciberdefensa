package ar.edu.unahur.obj2.operaciones;

import ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia.IModulosDeInteligencia;
import ar.edu.unahur.obj2.operaciones.Excepciones.SeveridadBaseException;

public abstract class Alertas implements IModulosDeInteligencia {
    private Integer severidadBase;
    private String codigoIdentificador;
    private Double tiempoDeDeteccion;
    private Integer IPOrigen;

    public Alertas(Integer severidadBase, String codigoIdentificador, Double tiempoDeDeteccion, Integer IPOrigen) {
        this.severidadBase = severidadBase;
        this.codigoIdentificador = codigoIdentificador;
        this.tiempoDeDeteccion = tiempoDeDeteccion;
        this.IPOrigen = IPOrigen;
    }

    private void validarSeveridadBase(Integer severidadBase) {
        if (severidadBase < 90) {
            throw new SeveridadBaseException("La severidad base debe ser superior a 90.");
        }
    }

    @Override
    public Integer severidadBase() {
        return severidadBase;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public Double getTiempoDeDeteccion() {
        return tiempoDeDeteccion;
    }

    public Integer getIPOrigen() {
        return IPOrigen;
    }

    

}
