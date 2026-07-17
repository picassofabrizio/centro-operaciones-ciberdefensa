package ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia;

public class HistoriaForense extends ModuloDeInteligencia {

    public HistoriaForense(IModulosDeInteligencia modulo) {
        super(modulo);
    }

    @Override
    public Integer severidadBase() {
        return modulo.severidadBase() + 15;
    }

}
