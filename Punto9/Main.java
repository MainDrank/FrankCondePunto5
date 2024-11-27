import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factorial queue = new Factorial();
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int opt = 0;

        for (int i = 0; i < 2; i++) {
            int numero = num.nextInt(10) + 1;
            queue.addNumber(numero);
        }
        System.out.println("Ingrese la opción deseada:"+"\n"+
                            "1. Mostrar cola inicial."+"\n"+
                            "2. Ordenar de manera ascendente."+"\n"+
                            "3. Ordenar de manera descendente."+"\n"+
                            "4. Eliminar un número de la cola.");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Cola inicial:");
                queue.mostrarCola();
                queue.mostrarFactorial();
                break;
            case 2:
                queue.sortAscen();
                System.out.println("\nCola ordenada de manera ascendente:");
                queue.mostrarCola();
                break;
            case 3:
                queue.sortDescen();
                System.out.println("\nCola ordenada de manera descendente:");
                queue.mostrarCola();
                break;
            case 4:
                System.out.print("\nIngrese un número para eliminar de la cola: ");
                int numberToRemove = sc.nextInt();
                if (queue.buscarQuitar(numberToRemove)) {
                    System.out.println("Número " + numberToRemove + " eliminado de la cola.");
                } else {
                    System.out.println("Número no encontrado en la cola.");
                }
        
                System.out.println("\nCola después de eliminar el número:");
                queue.mostrarCola();
                break;
            default: System.out.println("Opción no válida, intente de nuevo");
        }
    }
}
