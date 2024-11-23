package FrankCondePunto5;
   import java.util.Stack;

public class Metodos {

    private int calcularFacto(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public Stack<Integer> procesarVector(int[] vector) {
        Stack<Integer> pilaFactoriales = new Stack<>();
        for (int numero : vector) {
            pilaFactoriales.push(calcularFacto(numero));
            
        }
        return pilaFactoriales;
    }
}


