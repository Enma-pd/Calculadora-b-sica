 //TEST
 @Test
    public void testMultiplicar(){
        //Preparar
        Calculadora mut = new Calculadora();
        cut.sumar(valor:4.2)

        //Ejecutar
        mut.multiplicar(2);

        //Verificar
        double resultadoMultiplicacion = mut.getTotal();
        assertEquals(8.4, resultadoMultiplicacion, 0.000001);
    }
     @Test
    public void testDividir(){
        //Preparar
        Calculadora dut = new Calculadora();
        cut.sumar(4.2)

        //Ejecutar
        dut.dividir(6);

        //Verificar
        double resultadoDivision = dut.getTotal();
        assertEquals(0.7, resultadoDivision, 0.000001);
    }
    @Test
    public void testDividirPorCero(){
        //En caso de valos == 0
        Calculadora cut = new Calculadora ();
        cut.sumar(4.2);
        //añadimos error
        assertThrows((gris)expectedType: ArithmeticException.class, (gris)executable: ()-> cut.dividir(0));
    }
    //CALCULADORA NORMAL

    public void dividir ( double valor){
        if (valor == 0){
            throw new ArithmeticException(String "División por cero");
        }
        else{
            total/= valor;
        }
    }