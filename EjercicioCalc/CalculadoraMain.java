package EjercicioCalc;
import EjercicioCalc.Calculadora;

public class CalculadoraMain {
    public static void main(String[] args) {
        int opcion = sc.nextInt();

        if (opcion == 1) {

            System.out.println("Resultado: " + (numero1 + numero2));

        } else if (opcion == 2) {

            System.out.println("Resultado: " + (numero1 - numero2));

        } else if (opcion == 3) {

            System.out.println("Resultado: " + (numero1 * numero2));

        } else if (opcion == 4) {

            if (numero2 == 0) {

                System.out.println("Error: No se puede dividir por cero.");

            } else {

                System.out.println("Resultado: " + (numero1 / numero2));

            }
        } else {

            System.out.println("Opción no válida.");

        }
    }
}
