import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        while (true) {
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);
    }
}
