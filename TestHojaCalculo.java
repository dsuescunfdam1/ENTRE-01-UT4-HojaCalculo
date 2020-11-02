
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - 
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
        HojaCalculo test1;
        HojaCalculo test2;
        HojaCalculo test3;

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
        HojaCalculo test1 = new HojaCalculo("HOJA1");         
        Fecha fecha1 = new Fecha(4,10,2020);
        Fecha fecha2 = new Fecha(5,10,2020);                          
        test1.addFila(new Fila("Fila1",fecha1,25.50,132));         
        test1.addFila(new Fila("Fila2",fecha2,300,350));         
        test1.addFila(new Fila("Fila3"));
        test1.addFila(new Fila("Fila4")); 
        HojaCalculo copia = test1.duplicarHoja();         
        System.out.println(test1.toString());         
        System.out.println(copia.toString()); 

    }
    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
        HojaCalculo test2 = new HojaCalculo("HOJA2");         
        Fecha fecha1 = new Fecha(7,10,2020);
        Fecha fecha2 = new Fecha(8,10,2020);                          
        test2.addFila(new Fila("Fila1",fecha1,260,125));         
        test2.addFila(new Fila("Fila2",fecha2,125,135));                                
        HojaCalculo copia = test2.duplicarHoja();         
        System.out.println(test2.toString());         
        System.out.println(copia.toString());

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        HojaCalculo test3 = new HojaCalculo("HOJA3");         
        Fecha fecha1 = new Fecha(7,10,2020);                          
        test3.addFila(new Fila("Fila1",fecha1,260,125));                                        
        HojaCalculo copia = test3.duplicarHoja();         
        System.out.println(test3.toString());         
        System.out.println(copia.toString());

    }
}
