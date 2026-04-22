import java.util.Arrays;

public class BubbleSort {
    public BubbleSort() {
        System.out.println("Se creo la clase en el constructor");
    }

    public void printArreglo(int[] numeros) {
        System.out.print("Arreglo : [ ");
        for (int i : numeros) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    // [asc] True ordenara ascendentemente
    // [asc] False ordenara ascendentemente
    public void sort(int[] numeros, boolean asc) {

        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (asc) {
                    if (numeros[i] > numeros[j]) {
                        // Si cumple se realiza el intecambio
                        aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }
                } else {
                    if (numeros[i] < numeros[j]) {
                        // Si cumple se realiza el intecambio
                        aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }
                }

            }
        }
    }

    

}
