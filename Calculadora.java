import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números:");

        double a = sc.nextDouble();

        double b = sc.nextDouble();

        System.out.println("Selecciona operación: 1-Suma 2-Resta 3-Multiplicación 4-División");

        int opcion = sc.nextInt();

        if (opcion == 1) {

            System.out.println("Resultado: " + (a + b));

        } else if (opcion == 2) {

            System.out.println("Resultado: " + (a - b));

        } else if (opcion == 3) {

            System.out.println("Resultado: " + (a * b));

        } else if (opcion == 4) {

            if (b == 0) {

                System.out.println("Error: No se puede dividir por cero.");

            } else {

                System.out.println("Resultado: " + (a / b));

            }
        } else {

            System.out.println("Opción no válida.");
            
        }
        sc.close();
    }
}