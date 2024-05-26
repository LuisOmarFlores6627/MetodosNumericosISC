package shellsort2;

public class Shellsort2 {

    public static void main(String[] args) {
        // Matriz predefinida 
        int[][] matriz = {
            {5, 9, 3, 7},
            {2, 8, 1, 6},
            {4, 0, 11, 10}
        };

        // Ordenar cada fila de la matriz utilizando el algoritmo de ordenamiento Shell
        for (int i = 0; i < matriz.length; i++) {
            ordenamientoShell(matriz[i]);
        }

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
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
Matriz ordenada:
3 5 7 9 
1 2 6 8   
0 4 10 11  
*/
