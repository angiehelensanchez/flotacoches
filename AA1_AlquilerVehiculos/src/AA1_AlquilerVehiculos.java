import java.util.Date;

public class AA1_AlquilerVehiculos {

    public static void main(String[] args) {
        AA1_AlquilerVehiculos aa1 = new AA1_AlquilerVehiculos();
        aa1.inicio();

    }

    void inicio() {
        // Crea un objeto de cada una de las clases Coche, Moto y Camión.
        Coche coche1 = new Coche("4467FDG", "Citroen", "XSara",5, 5);
        Moto moto1 = new Moto("7896GRT", "Vespa", "C2", 600);
        Camion camion1 = new Camion("6832AVO", "Nissan", "FH", 4000);

        // Crea dos objetos de tipo cliente.
        Cliente cliente1 = new Cliente("78634915F", "Fernando Garcia");
        Cliente cliente2 = new Cliente("64321865G", "Valeria Ramirez");

        // Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente.
        //Contrato1
        Date fechainicio = new Date(123,03,14);
        Date fechafin = new Date(123,03,24);
        ContratoAlquiler contrato1 = new ContratoAlquiler(fechainicio,fechafin,78F, coche1, cliente2);
        int dias = contrato1.nDias(fechainicio, fechafin);
        float coste = contrato1.costeTotal(contrato1.getPrecioDia(), dias);
        System.out.println(contrato1.toString());
        System.out.println("----------------");
        System.out.println("Número de días de alquiler:" + dias);
        System.out.println("Coste total:" + coste);
        //Contrato2
        fechainicio = new Date(123, 01, 06);
        fechafin = new Date(123, 02,27);
        ContratoAlquiler contrato2 = new ContratoAlquiler(fechainicio, fechafin, 15.32F, moto1, cliente1);
        dias = contrato2.nDias(fechainicio, fechafin);
        coste = contrato2.costeTotal(contrato2.getPrecioDia(), dias);
        System.out.println(contrato2.toString());
        System.out.println("----------------");
        System.out.println("Número de días de alquiler:" + dias);
        System.out.println("Coste total:" + coste);
        //Contrato 3
        fechainicio = new Date(123, 06, 26);
        fechafin = new Date(123, 8,01);
        ContratoAlquiler contrato3 = new ContratoAlquiler(fechainicio, fechafin, 15.32F, camion1, cliente1);
        dias = contrato3.nDias(fechainicio, fechafin);
        coste = contrato3.costeTotal(contrato3.getPrecioDia(), dias);
        System.out.println(contrato3.toString());
        System.out.println("----------------");
        System.out.println("Número de días de alquiler:" + dias);
        System.out.println("Coste total:" + coste);


    }
}
