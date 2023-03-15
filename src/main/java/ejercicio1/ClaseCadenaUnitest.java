package ejercicio1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ClaseCadenaUnitest extends ClaseCadena {


    @Test
    public void DevuelveIniciales() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        Assert.assertEquals("A.D.", iniciales);
    }

    @Test
    public void pruebaUnSoloNombre() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas");
        Assert.assertEquals("A.", iniciales);
    }

    @Test
    public void pruebaNombreConEspaciosExtra() {
        String iniciales = ClaseCadena.DevuelveIniciales("   Andreas    Dulac   ");
        Assert.assertEquals("A.D.", iniciales);

}


}
