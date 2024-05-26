package shellsort4;

public class Shellsort4 {

    public static void main(String[] args) {
        // Arreglo de números predefinido
        int[] numeros = {10, 5, 8, 2, 7, 3, 6, 1, 9, 4};

        // Llamada al método de ordenamiento Shell
        ordenamientoShell(numeros);

        // Imprimir el arreglo ordenado de manera descendente
        System.out.println("Arreglo ordenado de manera descendente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void ordenamientoShell(int[] arr) {
        int n = arr.length;
        int brecha = n / 2; // Selección inicial de brecha

        while (brecha > 0) {
            for (int i = brecha; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= brecha && arr[j - brecha] < temp) {
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
Arreglo ordenado de manera descendente:
1 2 3 4 5 6 7 8 9 10
*/
