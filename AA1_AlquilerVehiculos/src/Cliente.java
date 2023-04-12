public class Cliente {
    public String nif;
    public String nombre;

    public Cliente(String nif, String nombre){
        this.nif=nif;
        this.nombre=nombre;
    }

    public String toString(){
        return "\nNIF: " + nif + "\nNombre :" + nombre ;
    }
}
