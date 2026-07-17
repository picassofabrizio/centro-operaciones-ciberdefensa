package ar.edu.unahur.obj2.operaciones.EnriquecimientoDeInteligencia;

public abstract class ModuloDeInteligencia implements IModulosDeInteligencia {
    protected IModulosDeInteligencia modulo;

    public ModuloDeInteligencia(IModulosDeInteligencia modulo) {
        this.modulo = modulo;
    }
}
