package FrankCondePunto5;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos ObjVector = new Metodos();

        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = sc.nextInt();
        int[] vector = new int[tamanio];

        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        Stack<Integer> pilaFactoriales = ObjVector.procesarVector(vector);

        System.out.println("Factoriales almacenados en la pila:");
        for (int i = tamanio - 1; i >= 0; i--) {
            int factorial = pilaFactoriales.pop();
            System.out.println("El factorial del número " + vector[i] + " es: " + factorial);
        }
    }
}