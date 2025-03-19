package EjercicioCalc;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números:");

        double numero1 = sc.nextDouble();

        double numero2 = sc.nextDouble();

        System.out.println("Selecciona operación: 1-Suma 2-Resta 3-Multiplicación 4-División");

        
        sc.close();
    }
}