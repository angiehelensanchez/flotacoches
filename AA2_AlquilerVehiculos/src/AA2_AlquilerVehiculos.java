
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * The type Aa 2 alquiler vehiculos.
 */
public class AA2_AlquilerVehiculos {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        inicio();
    }

    /**
     * Inicio.
     */
    public static void inicio() {
        Flota flota1 = new Flota("Algete");
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

    /**
     * Demanar opcio menu char.
     *
     * @return the char
     */
    public static char demanarOpcioMenu() {
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): \n");
        resp = teclado.nextLine();
        if (resp.isEmpty()){
            resp = "";
        }
        return resp.charAt(0);
    }

    /**
     * Crear coche coche.
     *
     * @return the coche
     * @throws Exception the exception
     */
    public static Coche crearCoche() throws  Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la matricula del coche: ");
        String matricula = teclado.nextLine();
        System.out.println("Introduzca la marca del coche: ");
        String marca = teclado.nextLine();
        System.out.println("Introduzca el modelo del coche: ");
        String modelo = teclado.nextLine();
        System.out.println("Introduzca el número de puertas del coche");
        int puertas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el número d eplazas del coche: ");
        int plazas = teclado.nextInt();
        return new Coche(matricula,marca,modelo, puertas, plazas);
    }

    /**
     * Crear moto moto.
     *
     * @return the moto
     * @throws Exception the exception
     */
    public static Moto crearMoto() throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la matricula de la moto: ");
        String matricula = teclado.nextLine();
        System.out.println("Introduzca la marca de la moto: ");
        String marca = teclado.nextLine();
        System.out.println("Introduzca el modelo de la moto: ");
        String modelo = teclado.nextLine();
        System.out.println("Introduzca el cc de la moto: ");
        int cc = teclado.nextInt();
        return new Moto(matricula,marca,modelo, cc);
    }

    /**
     * Crear camion camion.
     *
     * @return the camion
     * @throws Exception the exception
     */
    public static Camion crearCamion() throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la matricula del camión: ");
        String matricula = teclado.nextLine();
        System.out.println("Introduzca la marca del camión: ");
        String marca = teclado.nextLine();
        System.out.println("Introduzca el modelo del camión: ");
        String modelo = teclado.nextLine();
        System.out.println("Introduzca el peso en KG del camión: ");
        int kg = teclado.nextInt();
        return new Camion(matricula,marca,modelo, kg);
    }

    /**
     * Add vehiculo flota.
     */
    public static void addVehiculoFlota() {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca el tipo de vehiculo: ");
            String tipo = teclado.nextLine();
            if (tipo.equalsIgnoreCase("Coche")){
                Coche coche = crearCoche();
                System.out.println("El coche se ha agregado correctamente");
                Flota.addVehiculo(coche);
            } else if (tipo.equalsIgnoreCase("Moto")) {
                Moto moto = crearMoto();
                Flota.addVehiculo(moto);
                System.out.println("La moto se ha agregado correctamente");
            } else if (tipo.equalsIgnoreCase("Camion")) {
                Camion camion = crearCamion();
                Flota.addVehiculo(camion);
                System.out.println("El camión se ha agregado correctamente");
            }else {
                System.out.println("El tipo de vehículo no es valido. ");
            }
        }catch (Exception e){
            System.out.println("Ha habido un error");
        }
    }

    /**
     * Mostrar vehiculos flota.
     */
    public static void mostrarVehiculosFlota() {
        Flota.listVehiculo();
    }

    /**
     * Quitar vehiculos flota.
     */
    public static void quitarVehiculosFlota() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la matrícula: ");
        String matricula = teclado.nextLine();
        Flota.removeVehiculo(matricula);
    }

    /**
     * Ejemplo aa 1.
     */
    public static void ejemploAA1() {
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
