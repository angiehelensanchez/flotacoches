
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * The type Contrato alquiler.
 */
public class ContratoAlquiler {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private float precioDia;
    private Vehiculo v;
    private Cliente c;

    /**
     * Instantiates a new Contrato alquiler.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin    the fecha fin
     * @param precioDia   the precio dia
     * @param v           the v
     * @param c           the c
     */
// Constructores
    public ContratoAlquiler(LocalDate fechaInicio, LocalDate fechaFin, float precioDia, Vehiculo v, Cliente c) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.v = v;
        this.c = c;
    }

    /**
     * Gets fecha inicio.
     *
     * @return the fecha inicio
     */
//Getters y Setters
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets fecha inicio.
     *
     * @param fechaInicio the fecha inicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Gets fecha fin.
     *
     * @return the fecha fin
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets fecha fin.
     *
     * @param fechaFin the fecha fin
     */
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Gets precio dia.
     *
     * @return the precio dia
     */
    public float getPrecioDia() {
        return precioDia;
    }

    /**
     * Sets precio dia.
     *
     * @param precioDia the precio dia
     */
    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    /**
     * Gets v.
     *
     * @return the v
     */
    public Vehiculo getV() {
        return v;
    }

    /**
     * Sets v.
     *
     * @param v the v
     */
    public void setV(Vehiculo v) {
        this.v = v;
    }

    /**
     * Gets c.
     *
     * @return the c
     */
    public Cliente getC() {
        return c;
    }

    /**
     * Sets c.
     *
     * @param c the c
     */
    public void setC(Cliente c) {
        this.c = c;
    }

    /**
     * N dias int.
     *
     * @return the int
     */
// Métodos
    //Método nDias para calcular los dias que está alquilado el vehículo, aqui hago también la transformación de tipo String a LocalDateFormate
    public int nDias() {

        //creamos variable days-between para hacer el calculo de los días que hay entre fechaInicio y fechjaFin
        long dias = ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);

        //este método nos devuelve el resultado de la operación que hemos hecho, tipo int. 
        // Convierta un valor long en int
        return (int) dias;
    }

    /**
     * Coste total float.
     *
     * @param total the total
     * @return the float
     */
//método para calcular el coste total
    public float costeTotal(float total) {

        total = this.nDias() * this.precioDia;
        return total;
    }

    @Override
    public String toString() {
        return "\nFecha de Inicio: " + fechaInicio
                + "\nFecha Final: " + fechaFin
                + "\nNúmero de Dias: " + this.nDias()
                + "\nPrecio de un Dia: " + precioDia + " €"
                + "\nPrecio Total: " + this.costeTotal(precioDia) + " €"
                + "\n\n---------------------------\n";
    }
}
