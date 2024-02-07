import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        int[] vector1 = leerVector(dimension);
        int[] vector2 = leerVector(dimension);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los vectores es: " + productoEscalar);
    }

    public static int[] leerVector(int dimension) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[dimension];

        System.out.println("Ingrese los elementos del vector separados por espacios:");

        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;

        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
