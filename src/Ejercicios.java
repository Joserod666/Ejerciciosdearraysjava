import java.util.Scanner;

public class Ejercicios {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo de cadenas: ");
        int size = scanner.nextInt();

        // Declarar y crear el arreglo de cadenas
        String[] strings = new String[size];

        // Solicitar ingreso de las cadenas
        System.out.println("Ingrese las cadenas una por una:");
        for (int i = 0; i < size; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }

        // Encontrar la cadena más larga
        String longestString = findLongestString(strings);
        int longestIndex = findLongestIndex(strings, longestString);

        // Mostrar la cadena más larga y su índice
        System.out.println("La cadena más larga es \"" + longestString + "\" y se encuentra en el índice " + longestIndex);

        scanner.close();
    }

    public static String findLongestString(String[] strings) {
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    public static int findLongestIndex(String[] strings, String longest) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(longest)) {
                return i;
            }
        }
        return -1; // Si no se encuentra, retornamos -1
    }
}
