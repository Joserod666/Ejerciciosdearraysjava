import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterseccionArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño del primer arreglo
        System.out.println("Ingrese el tamaño del primer arreglo:");
        int sizeA = solicitarEntero(scanner);

        // Solicitar elementos del primer arreglo
        int[] arregloA = solicitarArreglo(scanner, sizeA);

        // Solicitar tamaño del segundo arreglo
        System.out.println("Ingrese el tamaño del segundo arreglo:");
        int sizeB = solicitarEntero(scanner);

        // Solicitar elementos del segundo arreglo
        int[] arregloB = solicitarArreglo(scanner, sizeB);

        // Encontrar la intersección de los arreglos
        Set<Integer> interseccion = encontrarInterseccion(arregloA, arregloB);

        // Mostrar la intersección
        if (interseccion.isEmpty()) {
            System.out.println("No hay intersección entre los dos arreglos.");
        } else {
            System.out.println("La intersección de los dos arreglos es:");
            for (int num : interseccion) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // Método para solicitar un entero desde la consola
    public static int solicitarEntero(Scanner scanner) {
        int entero = 0;
        boolean valido = false;
        do {
            try {
                entero = Integer.parseInt(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        } while (!valido);
        return entero;
    }

    // Método para solicitar un arreglo de enteros desde la consola
    public static int[] solicitarArreglo(Scanner scanner, int size) {
        int[] arreglo = new int[size];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < size; i++) {
            arreglo[i] = solicitarEntero(scanner);
        }
        return arreglo;
    }

    // Método para encontrar la intersección de dos arreglos
    public static Set<Integer> encontrarInterseccion(int[] arregloA, int[] arregloB) {
        Set<Integer> setA = new HashSet<>();
        for (int num : arregloA) {
            setA.add(num);
        }

        Set<Integer> interseccion = new HashSet<>();
        for (int num : arregloB) {
            if (setA.contains(num)) {
                interseccion.add(num);
            }
        }
        return interseccion;
    }
}