package shellsort5;

import java.util.Arrays;

public class Shellsort5 {

    public static void main(String[] args) {
        // Arreglo de números aleatorios predefinido
        int[] numeros = {29, 14, 7, 56, 23, 49, 3, 19};

        // Llamada al método de ordenamiento Shell
        ordenamientoShell(numeros); 

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(numeros));
    }

    public static void ordenamientoShell(int[] arr) {
        int n = arr.length;
        int brecha = n / 2; // Selección inicial de brecha

        while (brecha > 0) {
            for (int i = brecha; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= brecha && arr[j - brecha] > temp) {
                    arr[j] = arr[j - brecha];
                    j -= brecha;
                }
                arr[j] = temp;
            }
            brecha /= 2; // Reducir la brecha
        }
    }
}
/*
  Salida en pantalla:
Arreglo ordenado:
[3, 7, 14, 19, 23, 29, 49, 56]  
*/
