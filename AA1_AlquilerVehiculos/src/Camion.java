public class Camion extends Vehiculo{
    private int kg;
    public Camion(String matricula, String marca, String modelo, int kg){
        super(matricula, marca, modelo);
        this.kg =kg;
    }

    public String toString(){
        return "\nMatricula: " + matricula + "\nModelo :" + modelo + "\nMarca: " + marca + "\nKg: " + kg;
    }
}
