public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 10, 0, -5, 5, 15, 2 };
        runBubbleSort();
    }

    public static void runBubbleSort() {
        int[] numeros = { -5, 10, 2, 0, 7 };
        System.out.println("Metodo Burbuja");
        // Crear una instancia de la clase
        BubbleSort instanciaBubbleSort = new BubbleSort();
        instanciaBubbleSort.printArreglo(numeros);
        System.out.println();
        instanciaBubbleSort.sort(numeros, true);
        instanciaBubbleSort.printArreglo(numeros);
        System.out.println();
        instanciaBubbleSort.sort(numeros, false);
        instanciaBubbleSort.printArreglo(numeros);

    }
}
