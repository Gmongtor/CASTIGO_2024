import java.util.Scanner;

public class EJERCICIO8 {
    public static void main(String[] args) {
        int[] numbers = readNumbers();
        double average = calculateAverage(numbers);
        int minimum = calculateMinimum(numbers);
        int maximum = calculateMaximum(numbers);

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }

    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop):");

        int[] numbers = new int[0];
        int input;

        do {
            input = scanner.nextInt();
            if (input != 0) {
                int[] temp = new int[numbers.length + 1];
                System.arraycopy(numbers, 0, temp, 0, numbers.length);
                temp[numbers.length] = input;
                numbers = temp;
            }
        } while (input != 0);

        return numbers;
    }

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static int calculateMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }

    public static int calculateMaximum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }
}
