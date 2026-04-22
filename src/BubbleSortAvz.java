import java.util.Arrays;

public class BubbleSortAvz {
    // Constructor
    int[] Array;

    public BubbleSortAvz(int[] Array) {
        // 1. Darle valor de forma directa
        // array = new int[] (10,5,0);
        // 2. Darle valor en base a parametro
        this.Array = Array;

    }

    public void printArreglo() {
        System.out.print("Arreglo : [ ");
        for (int i : Array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    public void sortAvz(boolean asc) {
        boolean huboIntercambio;
        int contComparaciones = 0;
        int tamaño = Array.length;
        int aux;
        for (int i = 0; i < tamaño - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < tamaño - i - 1; j++) {
                
                if (asc) {
                    if (Array[j] > Array[j + 1]) {
                        huboIntercambio = true;
                        // Si cumple se realiza el intecambio
                        aux = Array[j];
                        Array[j] = Array[j + 1];
                        Array[j + 1] = aux;
                    }
                    
                } else {
                    if (Array[j] < Array[j + 1]) {
                        huboIntercambio = true;
                        // Si cumple se realiza el intecambio
                        aux = Array[j];
                        Array[j] = Array[j + 1];
                        Array[j + 1] = aux;
                    }
                    
                }
                contComparaciones++;
                

            }
            if (!huboIntercambio) {
                break;
            }

        }
        System.out.println("Comparaciones totales " + contComparaciones);
    }
}
