/**
 * The type Moto.
 */
public class Moto extends Vehiculo {

    private int cc;

    /**
     * Instantiates a new Moto.
     *
     * @param matricula the matricula
     * @param marca     the marca
     * @param modelo    the modelo
     * @param cc        the cc
     */
    public Moto(String matricula, String marca, String modelo, int cc) {
        super(matricula, marca, modelo);
        this.cc = cc;
    }

    /**
     * Gets cc.
     *
     * @return the cc
     */
// Getters y Setters
    public int getCc() {
        return cc;
    }

    /**
     * Sets cc.
     *
     * @param cc the cc
     */
    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "cc=" + cc + '}';
    }

}


