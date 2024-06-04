package principal;

import consultas.ConsultaMonedas;
import dto.MonedaDto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaMonedas consultaMonedas = new ConsultaMonedas();
        MonedaDto monedaDto;
        Scanner scan = new Scanner(System.in);

        Double cantidad;
        Integer opcion =0;

        while (opcion !=9){

            System.out.println("*****************CONVERSOR DE MONEDAS*****************\n");
            System.out.println("*****************OPCIONES*****************");
            System.out.println("1. Quetzal Guatemalteco => Dolar Estadounidense");
            System.out.println("2. Dolar Estadounidense => Quetzal Guatemalteco");
            System.out.println("3. Quetzal Guatemalteco => Peso Mexicano");
            System.out.println("4. Peso Mexicano => Quetzal Guatemalteco");
            System.out.println("5. Quetzal Guatemalteco => Peso Argentino");
            System.out.println("6. Peso Argentino => Quetzal Guatemalteco");
            System.out.println("7. Quetzal Guatemalteco => Euro");
            System.out.println("8. Euro => Quetzal Guatemalteco");
            System.out.println("9. Salir");
            System.out.println("******************************************\n");

            System.out.println("Ingrese una opción válida: ");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor en quetzales que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("GTQ","USD",cantidad);

                    System.out.println("El valor Q" + cantidad + " [GTQ] corresponde al valor final de --> $" + monedaDto.conversion_result() + " [USD]");

                    break;

                case 2:
                    System.out.println("Ingrese el valor en dolares estadounidenses que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("USD","GTQ",cantidad);

                    System.out.println("El valor $" + cantidad + " [USD] corresponde al valor final de --> Q" + monedaDto.conversion_result() + " [GTQ]");

                    break;
                case 3:
                    System.out.println("Ingrese el valor en quetzales que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("GTQ","MXN",cantidad);

                    System.out.println("El valor Q" + cantidad + " [GTQ] corresponde al valor final de --> $" + monedaDto.conversion_result() + " [MXN]");
                    break;
                case 4:
                    System.out.println("Ingrese el valor en pesos mexicanos que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("MXN","GTQ",cantidad);

                    System.out.println("El valor $" + cantidad + " [MXN] corresponde al valor final de --> Q" + monedaDto.conversion_result() + " [GTQ]");
                    break;
                case 5:
                    System.out.println("Ingrese el valor en quetzales que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("GTQ","ARS",cantidad);

                    System.out.println("El valor Q" + cantidad + " [GTQ] corresponde al valor final de --> $" + monedaDto.conversion_result() + " [ARS]");
                    break;
                case 6:
                    System.out.println("Ingrese el valor en pesos argentinos que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("ARS","GTQ",cantidad);

                    System.out.println("El valor $" + cantidad + " [ARS] corresponde al valor final de --> Q" + monedaDto.conversion_result() + " [GTQ]");
                    break;
                case 7:
                    System.out.println("Ingrese el valor en quetzales que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("GTQ","EUR",cantidad);

                    System.out.println("El valor Q" + cantidad + " [GTQ] corresponde al valor final de --> €" + monedaDto.conversion_result() + " [EUR]");
                    break;
                case 8:
                    System.out.println("Ingrese el valor en euros que desea convertir:");
                    cantidad=scan.nextDouble();

                    monedaDto=consultaMonedas.conversorDeMonedasConCantidad("EUR","GTQ",cantidad);

                    System.out.println("El valor €" + cantidad + " [EUR] corresponde al valor final de --> $" + monedaDto.conversion_result() + " [GTQ]");
                    break;
                case 9:
                    System.out.println("¡Nos vemos!");
                    break;
                default:
                    System.out.println("Favor de ingresar una opción valida");
            }


        }


    }
}
