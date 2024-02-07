import java.util.Arrays;

public class EJERCICIO6 {
    public static void main(String[] args) {
        int N = 10; // Número de primeros números primos a mostrar
        int[] primes = getPrimes(N);
        System.out.println(Arrays.toString(primes));
    }

    public static int[] getPrimes(int N) {
        int[] primes = new int[N];
        int count = 0;
        int num = 2;

        while (count < N) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
