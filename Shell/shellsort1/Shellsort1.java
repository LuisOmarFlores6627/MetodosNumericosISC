package shellsort1;

public class Shellsort1 {
 
    public static void main(String[] args) {
        // Arreglo predefinido
        int[] arr = {12, 34, 54, 2, 3};

        // Llamada al método de ordenamiento Shell
        ordenamientoShell(arr);

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
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
2 3 12 34 54
*/
