import java.util.ArrayList;

/**
 * The type Agencia.
 */
public class Agencia {
    private String nombre;
    private ArrayList<Flota> flotas;
    private ArrayList<ContratoAlquiler> contratoAlquileres;

    /**
     * Instantiates a new Agencia.
     *
     * @param nombre the nombre
     */
    public Agencia(String nombre) {
        this.nombre = nombre;
        this.flotas = new ArrayList<Flota>();
        this.contratoAlquileres = new ArrayList<ContratoAlquiler>();
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets flotas.
     *
     * @return the flotas
     */
    public ArrayList<Flota> getFlotas() {
        return flotas;
    }

    /**
     * Sets flotas.
     *
     * @param flotas the flotas
     */
    public void setFlotas(ArrayList<Flota> flotas) {
        this.flotas = flotas;
    }

    /**
     * Gets contrato alquileres.
     *
     * @return the contrato alquileres
     */
    public ArrayList<ContratoAlquiler> getContratoAlquileres() {
        return contratoAlquileres;
    }

    /**
     * Sets contrato alquileres.
     *
     * @param contratoAlquileres the contrato alquileres
     */
    public void setContratoAlquileres(ArrayList<ContratoAlquiler> contratoAlquileres) {
        this.contratoAlquileres = contratoAlquileres;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "nombre='" + nombre + '\'' +
                ", flotas=" + flotas +
                ", contratoAlquileres=" + contratoAlquileres +
                '}';
    }
}
