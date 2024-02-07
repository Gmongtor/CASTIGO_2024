public class EJERCICIO5 {
    public static void main(String[] args) {
        int N = 10;
        int[][] tablaMultiplicar = generarTablaMultiplicar(N);
        
        for (int i = 0; i < N; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + tablaMultiplicar[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int[][] generarTablaMultiplicar(int N) {
        int[][] tablaMultiplicar = new int[N][10];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = i * j;
            }
        }
        
        return tablaMultiplicar;
    }
}
