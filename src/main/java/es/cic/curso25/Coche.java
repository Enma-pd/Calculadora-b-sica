package es.cic.curso25;

public class Coche {

    private int velocidad = 0;
    public static final double CONSUMO_INSTANTANEO = 4.3;

    public int getVelocidad(){
        return velocidad;
    }
     public double getConsumo(){

        return ((double)velocidad) /100 *CONSUMO_INSTANTANEO;
    }
     public int acelerar(int incrementoVelocidad){
        this.velocidad += incrementoVelocidad;
        return this.velocidad;
        
    }
     public int frenar(int decrementoVelocidad){
        this.velocidad -= decrementoVelocidad;
        return this.velocidad;
        
    }

}
