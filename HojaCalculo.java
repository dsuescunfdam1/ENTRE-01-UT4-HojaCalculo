
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -  David Suescun  
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        if(fila1 == null){
            return 3;
        }
        else if(fila2 == null){
            return 2;
        }
        else if(fila3 == null){
            return 1;
        }
        return 0;

    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if(fila1 != null && fila2 != null && fila3 != null){

            return true;
        }

        return false;
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        if(hojaCompleta()){

            System.out.println("FilaX no se puede añadir en HOJAX");
        }

        else{ 
            if(fila1 == null){
                fila1 = fila;
            }

            else if(fila2 == null){
                fila2 = fila;
            }

            else{
                fila3 = fila;
            }

        }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        if(fila1 == null){
            fila1 = new Fila(id, fecha, ingresos, gastos);
        }

        else if(fila2 == null){
            fila2 = new Fila(id, fecha, ingresos, gastos);
        }

        else if(fila3 == null){
            fila3 = new Fila(id, fecha, ingresos, gastos);
        }
        else{
            System.out.println(id + "no se puede añadir en" + this.nombre);
        }
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double totalIngresos = 0;
        if(getNumeroFilas() == 0){
            totalIngresos = fila3.getIngresos();
        }

        if(getNumeroFilas() == 1){
            totalIngresos += fila2.getIngresos();
        }

        if(getNumeroFilas() == 2){
            totalIngresos += fila1.getIngresos();
        }
        return totalIngresos;
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        double totalGastos = 0;
        if(getNumeroFilas() == 0){
            totalGastos = fila3.getGastos();
        }

        if(getNumeroFilas() == 1){
            totalGastos += fila2.getGastos();
        }

        if(getNumeroFilas() == 2){
            totalGastos += fila1.getGastos();
        }
        return totalGastos;
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        double totalBeneficio = getTotalIngresos() - getTotalGastos();
        return totalBeneficio;

    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {
        String hoja = "";
         if(getNumeroFilas() == 1){
            hoja = hoja + "\n" + fila1.toString();
        }
        if(getNumeroFilas() == 2){
            hoja = hoja + "\n" + fila1.toString() + "\n" + fila2.toString();
        }
        if(getNumeroFilas() == 3){
            hoja = hoja + "\n" + fila1.toString() + "\n" + fila2.toString() + "\n" + fila2.toString();
        }
        return hoja;

    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {
        HojaCalculo nombre = new HojaCalculo(this.nombre);
        Fila fila01 = new Fila(fila1.getId(), fila1.getFecha(), fila1.getIngresos(), fila1.getGastos());
        Fila fila02 = new Fila(fila2.getId(), fila2.getFecha(), fila2.getIngresos(), fila2.getGastos());
        Fila fila03 = new Fila(fila3.getId(), fila3.getFecha(), fila3.getIngresos(), fila3.getGastos());
       
        return null ;
    }

}
