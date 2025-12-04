package arrays;

public class Funcion {

    static boolean Siono(int numeros) {

        if (numeros < 6) {
            return false;
        } else if (numeros > 6) {
            return true;
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {

        int numero = 7;
        boolean resultado = Siono(numero);

        System.out.println("Número: " + numero);
        System.out.println("Resultado: " + resultado);
    }
}
