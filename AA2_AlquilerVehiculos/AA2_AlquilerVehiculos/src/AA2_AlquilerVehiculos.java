
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AA2_AlquilerVehiculos {

    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        AA2_AlquilerVehiculos prg = new AA2_AlquilerVehiculos();
        prg.inicio();
    }

    void inicio() {
        boolean salir = false;
        char opcio;
        do {
            System.out.println("");
            System.out.println("1. Añadir vehiculos en una flota");
            System.out.println("2. Mostrar vehiculos de una flota");
            System.out.println("3. Quitar un vehiculo de una flota");
            System.out.println("4. Ejemplo solución AA1");
            System.out.println("0. Salir de la aplicación");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1':
                    addVehiculoFlota();
                    break;
                case '2':
                    mostrarVehiculosFlota();
                    break;
                case '3':
                    quitarVehiculosFlota();
                    break;
                case '4':
                    ejemploAA1();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    char demanarOpcioMenu() {
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    void addVehiculoFlota() {
        // TODO
    }

    void mostrarVehiculosFlota() {
        // TODO
    }

    void quitarVehiculosFlota() {
        // TODO
    }

    void ejemploAA1() {
//indicamos el formato de fecha a la que vamos a convertir nuestros tipos String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        //1. Crea un objeto de cada una de las clases Coche, Moto y Camión
        Coche coche1 = new Coche("1122ABC", "Audi", "TT", 2, 4);
        Moto moto1 = new Moto("2233LML", "Piaggio", "Liberty", 125);
        Camion camion1 = new Camion("3344HJK", "Renault", "Jumpy", 560);

        //2. Crea dos objetos de tipo Cliente
        Cliente cliente1 = new Cliente("11222333A", "Ana");
        Cliente cliente2 = new Cliente("22333444B", "Josep");

        //3. Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente
        ContratoAlquiler contrato1 = new ContratoAlquiler(LocalDate.parse("15/11/2022", formatter), LocalDate.parse("25/11/2022", formatter), 100, coche1, cliente1);
        ContratoAlquiler contrato2 = new ContratoAlquiler(LocalDate.parse("30/03/2022", formatter), LocalDate.parse("04/04/2022", formatter), 60, moto1, cliente2);
        ContratoAlquiler contrato3 = new ContratoAlquiler(LocalDate.parse("16/07/2022", formatter), LocalDate.parse("05/08/2022", formatter), 250, camion1, cliente1);

        //4. Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado
        System.out.println("\nVEHÍCULOS: \n" + coche1.toString() + "\n" + moto1.toString() + "\n" + camion1.toString());
        System.out.println("\n///////////////////////////////////////////////////  \n");

        System.out.println("CLIENTES: \n" + cliente1 + "\n" + cliente2 + "\n");
        System.out.println("\n///////////////////////////////////////////////////  \n");

        System.out.println("\nCONTRATOS DE ALQUILER: \n" + "\nContrato 1" + contrato1
                + "\nContrato 2" + contrato2
                + "\nContrato 3" + contrato3);
    }

}
