import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterseccionArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tama�o del primer arreglo
        System.out.println("Ingrese el tama�o del primer arreglo:");
        int sizeA = solicitarEntero(scanner);

        // Solicitar elementos del primer arreglo
        int[] arregloA = solicitarArreglo(scanner, sizeA);

        // Solicitar tama�o del segundo arreglo
        System.out.println("Ingrese el tama�o del segundo arreglo:");
        int sizeB = solicitarEntero(scanner);

        // Solicitar elementos del segundo arreglo
        int[] arregloB = solicitarArreglo(scanner, sizeB);

        // Encontrar la intersecci�n de los arreglos
        Set<Integer> interseccion = encontrarInterseccion(arregloA, arregloB);

        // Mostrar la intersecci�n
        if (interseccion.isEmpty()) {
            System.out.println("No hay intersecci�n entre los dos arreglos.");
        } else {
            System.out.println("La intersecci�n de los dos arreglos es:");
            for (int num : interseccion) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // M�todo para solicitar un entero desde la consola
    public static int solicitarEntero(Scanner scanner) {
        int entero = 0;
        boolean valido = false;
        do {
            try {
                entero = Integer.parseInt(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un n�mero entero v�lido.");
            }
        } while (!valido);
        return entero;
    }

    // M�todo para solicitar un arreglo de enteros desde la consola
    public static int[] solicitarArreglo(Scanner scanner, int size) {
        int[] arreglo = new int[size];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < size; i++) {
            arreglo[i] = solicitarEntero(scanner);
        }
        return arreglo;
    }

    // M�todo para encontrar la intersecci�n de dos arreglos
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