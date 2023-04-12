/**
 * The type Camion.
 */
public class Camion extends Vehiculo {

    private int kg;

    /**
     * Instantiates a new Camion.
     *
     * @param matricula the matricula
     * @param marca     the marca
     * @param modelo    the modelo
     * @param kg        the kg
     */
    public Camion(String matricula, String marca, String modelo, int kg) {
        super(matricula, marca, modelo);
        this.kg = kg;
    }

    /**
     * Gets kg.
     *
     * @return the kg
     */
// Getters y Setters
    public int getKg() {
        return kg;
    }

    /**
     * Sets kg.
     *
     * @param kg the kg
     */
    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return super.toString() + " Camion{" + "kg=" + kg + '}';
    }



}
