public class Moto extends Vehiculo{
    private int cc;
    public Moto(String matricula, String marca, String modelo, int cc){
        super(matricula, marca, modelo);
        this.cc=cc;
    }

    public String toString(){
        return "\nMatricula: " + matricula + "\nModelo :" + modelo + "\nMarca: " + marca + "\nCC: " + cc;
    }
}
