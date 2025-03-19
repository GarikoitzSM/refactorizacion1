package EjercicioCalc;
import java.util.Scanner;

public class Calculadora {
        private double numero1;
        private double numero2;

        public Calculadora(){}

        public void numero1Setter(double numero1){
            this.numero1 = numero1;
        }

        public void numero2Setter(double numero2){
            this.numero2 = numero2;
        }

        public double numero1Getter(){
            return numero1;
        }

        public double numero2Getter(){
            return numero2;
        }

        public double suma(){
            return numero1 + numero2;
        }

        public double resta(){
            return numero1 - numero2;
        }

        public double multi(){
            return numero1 * numero2;
        }

        public double divi(){
            return numero1 / numero2;
        }

        public double poten(){
            return Math.pow(numero1, numero2);
        }

        public double raiz(){
            return Math.round(Math.pow(numero1, 1.0 / numero2));
        }
    }