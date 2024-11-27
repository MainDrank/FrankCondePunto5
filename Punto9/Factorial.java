import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Factorial {
    private LinkedList<Integer> queue;

    public Factorial() {
        queue = new LinkedList<>();
    }

    public void addNumber(int number) {
        queue.add(number);
    }

    public long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void sortAscen() {
        Collections.sort(queue);
    }

    public void sortDescen() {
        Collections.sort(queue, Collections.reverseOrder());
    }

    public boolean buscarQuitar(int number) {
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == number) {
                iterator.remove();
                return true; 
            }
        }
        return false; 
    }

    public void mostrarCola() {
        System.out.print("Cola: ");
        for (Integer num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void mostrarFactorial() {
        System.out.println("Factoriales de los números en la cola:");
        for (Integer num : queue) {
            System.out.println(num + "! = " + calcularFactorial(num));
        }
    }
}

