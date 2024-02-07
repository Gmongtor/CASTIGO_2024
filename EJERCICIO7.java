import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int number = scanner.nextInt();
        scanner.close();

        List<Integer> primeFactors = getPrimeFactors(number);

        System.out.print(number + " = ");
        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.print(primeFactors.get(i));
            if (i < primeFactors.size() - 1) {
                System.out.print(" * ");
            }
        }
    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
}
