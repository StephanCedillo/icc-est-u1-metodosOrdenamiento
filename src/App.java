import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        int[] array = creatorArraysRandom();
        runBubbleSort(array);
    }

    public static void runBubbleSort(int[] array) {
        int[] numeros = { 9, 2, 3, 0, 8, 5, 10, 50, 100 };

        // System.out.println("Metodo Burbuja");
        // Crear una instancia de la clase
        // BubbleSort instanciaBubbleSort = new BubbleSort();
        // instanciaBubbleSort.printArreglo(numeros);
        // System.out.println();
        // instanciaBubbleSort.sort(numeros, true);
        // instanciaBubbleSort.printArreglo(numeros);
        // System.out.println();
        // instanciaBubbleSort.sort(numeros, false);
        // instanciaBubbleSort.printArreglo(numeros);

        BubbleSortAvz instanciaBubbleSortAvz = new BubbleSortAvz(array);
        instanciaBubbleSortAvz.printArreglo();
        instanciaBubbleSortAvz.sortAvz(false);
        instanciaBubbleSortAvz.printArreglo();

    }

    public static int[] creatorArraysRandom() {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingresar el tamaño del vector");
        int numeroTamaño = leer.nextInt();
        int[] array = new int[numeroTamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;

    }
}
