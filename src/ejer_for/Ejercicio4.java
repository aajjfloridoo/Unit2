package ejer_for;

public class Ejercicio4 {

    public static void main(String[] args) {

        int suma = 0;
        int numeroImpar = 1;

        for (int i = 0; i < 10; i++) {
            suma += numeroImpar;
            numeroImpar += 2; 
        }
        
        System.out.println("Suma: " + suma);
        
    }
}
