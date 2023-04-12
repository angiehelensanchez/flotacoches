import java.util.Date;

public class ContratoAlquiler {
    private Date fechaInicio;
    private Date fechaFin;
    private float precioDia;
    public Vehiculo vehiculo;
    public Cliente cliente;

    public ContratoAlquiler(Date fechaInicio, Date fechaFin, float precioDia, Vehiculo vehiculo, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }


    public float getPrecioDia() {
        return precioDia;
    }

    public int nDias(Date fechaInicio, Date fechaFinal) {
        int dias;
        dias = (int) ((fechaFinal.getTime()- fechaInicio.getTime())/(1000*60*60*24));
        return dias;
    }
    public float costeTotal(float precioDia, int dias){
        float coste = precioDia * (float) dias;
        return coste;
    }

    public String toString(){
        //String strDateFormat = "dd-MM-AAAA";
        //SimpleDateFormat asd = new SimpleDateFormat(strDateFormat);
    return "\nContrato de Alquiler" + "\n----------------" + "\nFecha Inicio: " + fechaInicio + "\nFecha Fin: " +fechaFin +
            "\nPrecio Día: " + precioDia + "\n\nVehículo" + "\n----------------" + vehiculo + "\n\nCliente" + "\n----------------" + cliente;
    }


}
