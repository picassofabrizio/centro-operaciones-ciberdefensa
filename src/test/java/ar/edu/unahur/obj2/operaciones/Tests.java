package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.criterios.EspecialistaEnAmenazasCriticas;
import ar.edu.unahur.obj2.operaciones.criterios.ICriterioDeTriaje;

public class Tests {
    @Test
    public void testAlerta() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        assertTrue(alerta.severidadBase() == 10);
        assertTrue(alerta.getCodigoIdentificador().equals("A1"));
        assertTrue(alerta.getTiempoDeDeteccion() == 5.0);
        assertTrue(alerta.getIPOrigen() == 123456789);
    }

    @Test
    public void testAlertaConEnriquecimientoDeInteligencia() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        alerta.severidadBase();
        assertTrue(alerta.severidadBase() == 15);
    }

    @Test
    public void testAlertaConEnriquecimientoDeInteligenciaYGeolocalizacionDeIP() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        alerta.severidadBase();
        assertTrue(alerta.severidadBase() == 15);
        alerta.severidadBase();
        assertTrue(alerta.severidadBase() == 20);
    }

    @Test
    public void testCriterioDeTriaje() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == false);
    }

    @Test
    public void testCriterioDeTriajeConSeveridadAlta() {
        Alerta alerta = new Alerta(80, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == true);
    }

    @Test
    public void testCriterioDeTriajeConSeveridadAltaYGeolocalizacionDeIP() {
        Alerta alerta = new Alerta(80, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == true);
        alerta.severidadBase();
        assertTrue(criterio.criterio(alerta) == true);
    }

    @Test
    public void testAnalistaNivel1() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == false);
        alerta.severidadBase();
        assertTrue(criterio.criterio(alerta) == false);
    }

    @Test
    public void testEspecialistaEnAmenazasCriticas() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == false);
        alerta.severidadBase();
        assertTrue(criterio.criterio(alerta) == false);
    }

    @Test
    public void testDefensaHibrida() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == false);
        alerta.severidadBase();
        assertTrue(criterio.criterio(alerta) == false);
    }

    @Test
    public void testDefensaHibridaConIPEnInfraestructura() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        ICriterioDeTriaje criterio = new EspecialistaEnAmenazasCriticas();
        assertTrue(criterio.criterio(alerta) == false);
        alerta.severidadBase();
        assertTrue(criterio.criterio(alerta) == false);
    }

    @Test
    public void testAnalisisDeMalwareEnSandbox() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        alerta.severidadBase();
        assertTrue(alerta.severidadBase() == 15);
        alerta.severidadBase();
        assertTrue(alerta.severidadBase() == 20);
    }

    @Test
    public void testSIEMConModoForense() {
        Alerta alerta = new Alerta(10, "A1", 5.0, 123456789);
        SIEM siem = new SIEM(alerta, new Analistas(), "ModoForense");
        siem.aplicarEnriquecimientoDeInteligencia(alerta);
        assertTrue(alerta.severidadBase() == 20);
    }

    @Test
    

}
