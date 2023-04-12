/**
 * The type Coche.
 */
public class Coche extends Vehiculo {
    private int puertas;
    private int plazas;

    /**
     * Instantiates a new Coche.
     *
     * @param matricula the matricula
     * @param marca     the marca
     * @param modelo    the modelo
     * @param puertas   the puertas
     * @param plazas    the plazas
     */
    public Coche( String matricula, String marca, String modelo, int puertas, int plazas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
        this.plazas = plazas;
    }
    
    // Getters y Setters

    /**
     * Gets puertas.
     *
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * Sets puertas.
     *
     * @param puertas the puertas
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * Gets plazas.
     *
     * @return the plazas
     */
    public int getPlazas() {
        return plazas;
    }

    /**
     * Sets plazas.
     *
     * @param plazas the plazas
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return super.toString() + " Coche{" + "puertas=" + puertas + ", plazas=" + plazas + '}';
    }

    
    

    
    
   
}
