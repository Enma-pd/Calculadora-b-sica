package es.cic.curso25;

import static java.lang.Math.round;

public class Coche {

    
    public static final double CONSUMO_INSTANTANEO = 4.3;
    private Calculadora calculadora = new Calculadora();

    public Coche(){
        this.calculadora = new Calculadora();
    }

    private int velocidad = 0;

    public int getVelocidad(){
        return velocidad;
    }
     public double getConsumo(){
        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100.0);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);

        return calculadora.getTotal();
    }
    public int acelerar(int incrementoVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoVelocidad);

        this.velocidad = (int) round(calculadora.getTotal());
        
        return this.velocidad;
        
    }
     public int frenar(int decrementoVelocidad){
        this.calculadora.limpiar();
        this.calculadora.restar(this.velocidad);
        this.calculadora.restar(decrementoVelocidad);

        this.velocidad = (int) round(calculadora.getTotal());
        
       
        return this.velocidad;
        
    }

}
