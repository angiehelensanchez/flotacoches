import java.util.ArrayList;
import java.util.Iterator;

/**
 * The type Flota.
 */
public class Flota {
    private String nombreZona;
    /**
     * The Vehiculos.
     */
    public static ArrayList<Vehiculo> vehiculos;

    /**
     * Instantiates a new Flota.
     *
     * @param nombreZonas the nombre zonas
     */
    public Flota(String nombreZonas) {
        this.nombreZona = nombreZona;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    /**
     * Gets nombre zona.
     *
     * @return the nombre zona
     */
    public String getNombreZona() {
        return nombreZona;
    }

    /**
     * Sets nombre zona.
     *
     * @param nombreZona the nombre zona
     */
    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    /**
     * Gets vehiculos.
     *
     * @return the vehiculos
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Sets vehiculos.
     *
     * @param vehiculos the vehiculos
     */
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }


    /**
     * Add vehiculo.
     *
     * @param vehiculo the vehiculo
     */
    public static void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * List vehiculo.
     */
    public static void listVehiculo(){
        for (Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.toString());
        }
    }

    /**
     * Remove vehiculo.
     *
     * @param matricula the matricula
     */
    public static void removeVehiculo(String matricula){
        Iterator<Vehiculo> iter = vehiculos.iterator();
        while (iter.hasNext()) {
            Vehiculo vehiculo = iter.next();
            if (vehiculo.getMatricula().equals(matricula)){
                iter.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "Flota{" +
                "nombreZona='" + nombreZona + '\'' +
                '}';
    }
}

