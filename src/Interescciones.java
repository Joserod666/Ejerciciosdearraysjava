import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Interescciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar tama�o de los arreglos
        System.out.println("Ingrese el tama�o del primer arreglo:");
        int sizeA = scanner.nextInt();
        System.out.println("Ingrese el tama�o del segundo arreglo:");
        int sizeB = scanner.nextInt();
        
        // Crear arreglos
        int[] a = new int[sizeA];
        int[] b = new int[sizeB];
        
        // Solicitar valores para el primer arreglo
        System.out.println("Ingrese los valores del primer arreglo:");
        for (int i = 0; i < sizeA; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Solicitar valores para el segundo arreglo
        System.out.println("Ingrese los valores del segundo arreglo:");
        for (int i = 0; i < sizeB; i++) {
            b[i] = scanner.nextInt();
        }
        
        // Encontrar intersecci�n
        Set<Integer> intersection = findIntersection(a, b);
        
        // Mostrar intersecci�n
        if (intersection.isEmpty()) {
            System.out.println("No hay intersecci�n entre los dos arreglos.");
        } else {
            System.out.println("La intersecci�n de los dos arreglos es:");
            for (int num : intersection) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
    
    // M�todo para encontrar la intersecci�n de dos arreglos
    public static Set<Integer> findIntersection(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        // Agregar elementos del primer arreglo al conjunto setA
        for (int num : a) {
            setA.add(num);
        }
        
        // Verificar elementos del segundo arreglo en setA
        for (int num : b) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }
        
        return intersection;
    }
}