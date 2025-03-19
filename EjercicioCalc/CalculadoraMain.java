package EjercicioCalc;
import java.util.Scanner;

import EjercicioCalc.Calculadora;

public class CalculadoraMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calcu = new Calculadora();
        boolean programa = true;

        System.out.println("Bienvenido al programa de calculadora.");
        do {
            System.out.println("Seleccione lo que desea hacer: \n1: Establecer números\n2: Calcular\n3: Salir");
            int eleccionMenuUno = sc.nextInt();
            switch (eleccionMenuUno){
                case 1:
                ponerNumeros(sc, calcu);
                break;
                case 2:
                if(calcu.numero1Getter()==0 && calcu.numero2Getter()==0){
                    System.out.println("Ambos números son 0. No es posible continuar con la operación.");
                    break;
                } else {
                calculos(sc, calcu);
                }
                break;

            }
        } while (programa);

        

        sc.close();
    }

    public static void ponerNumeros(Scanner sc, Calculadora calcu){
        System.out.println("Introduzca el primer número:");
        double tempNumero1 = sc.nextDouble();
        calcu.numero1Setter(tempNumero1);
        System.out.println("Introduzca el segundo número:");
        tempNumero1 = sc.nextDouble();
        calcu.numero2Setter(tempNumero1);
        System.out.println("Operación ejecutada con éxito.");
        return;
    }

    public static void calculos(Scanner sc, Calculadora calcu){
        System.out.println("Seleccione su operación. \n1: Suma\n2: Resta\n3: Multiplicación\n4: División\n5: Potencia\n6: Raíz");
        

    }
}
