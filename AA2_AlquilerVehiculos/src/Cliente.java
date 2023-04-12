/**
 * The type Cliente.
 */
public class Cliente {

    private String nif;
    private String nombre;

    /**
     * Instantiates a new Cliente.
     *
     * @param nif    the nif
     * @param nombre the nombre
     */
    public Cliente(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    /**
     * Gets nif.
     *
     * @return the nif
     */
// Getters y Setters
    public String getNif() {
        return nif;
    }

    /**
     * Sets nif.
     *
     * @param nif the nif
     */
    public void setNif(String nif) {
        this.nif = nif;
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

    @Override
    public String toString() {
        return "NIF: " + nif + " Nombre: " + nombre;
    }

}
