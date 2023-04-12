import java.util.ArrayList;

/**
 * The type Vehiculos rent.
 */
public class VehiculosRent {
    private String nif;
    private String nombre;
    private ArrayList<Cliente> cl;
    private ArrayList<Flota> fl;
    private ArrayList<Agencia> ag;

    /**
     * Instantiates a new Vehiculos rent.
     *
     * @param nif    the nif
     * @param nombre the nombre
     */
//constructores
    public VehiculosRent(String nif, String nombre){
    this.nif = nif;
    this.nombre = nombre;
    this.cl = new ArrayList<Cliente>();
    this.fl = new ArrayList<Flota>();
    this.ag = new ArrayList<Agencia>();
    }

    /**
     * Gets nif.
     *
     * @return the nif
     */
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

    /**
     * Gets cl.
     *
     * @return the cl
     */
    public ArrayList<Cliente> getCl() {
        return cl;
    }

    /**
     * Sets cl.
     *
     * @param cl the cl
     */
    public void setCl(ArrayList<Cliente> cl) {
        this.cl = cl;
    }

    /**
     * Gets fl.
     *
     * @return the fl
     */
    public ArrayList<Flota> getFl() {
        return fl;
    }

    /**
     * Sets fl.
     *
     * @param fl the fl
     */
    public void setFl(ArrayList<Flota> fl) {
        this.fl = fl;
    }

    /**
     * Gets ag.
     *
     * @return the ag
     */
    public ArrayList<Agencia> getAg() {
        return ag;
    }

    /**
     * Sets ag.
     *
     * @param ag the ag
     */
    public void setAg(ArrayList<Agencia> ag) {
        this.ag = ag;
    }

    @Override
    public String toString() {
        return "VehiculosRent{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cl=" + cl +
                ", fl=" + fl +
                ", ag=" + ag +
                '}';
    }
}
