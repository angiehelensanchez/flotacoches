public class Coche extends Vehiculo{
    private int puertas;
    private int plazas;

    public Coche(String matricula, String marca, String modelo,int plazas, int puertas){
        super(matricula, marca, modelo);
        this.puertas = puertas;
        this.plazas = plazas;
    }

    public String toString(){
        return "\nMatricula: " + matricula + "\nModelo :" + modelo + "\nMarca: " + marca + "\nPuertas: " + puertas + "\nPlazas:" + plazas;
    }

}