package es.cic.curso25;
import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    public void lanzame(){
        boolean valor = true;
        char letra = 'e';
        char otraLetra = "e".charAt(0);

        Object miCoche = new Coche();

        Coche miCoche2 = new Coche();
        Object miCoche3 = miCoche2;

        ((Coche)miCoche).acelerar('e');

        Camion miCamioncito =new Camion();
        miCamioncito.meterCarga();
        GrueDelPuerto pepe = new GrueDelPuerto();
        pepe.meterCarga();
        public void acerarRemotamente (Vehiculo coche, int velocidad){
            coche.acelerar(velocidad);
        }


    }

}
