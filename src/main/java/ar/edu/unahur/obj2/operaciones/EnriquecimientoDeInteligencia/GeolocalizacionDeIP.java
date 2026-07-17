package ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia;

public class GeolocalizacionDeIP extends ModuloDeInteligencia {

    public GeolocalizacionDeIP(IModulosDeInteligencia modulo) {
        super(modulo);
    }

    @Override
    public Integer severidadBase() {
        return modulo.severidadBase() + 5;
    }

}
