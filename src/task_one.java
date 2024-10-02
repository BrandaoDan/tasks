import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_one {

    public static List<Integer> fibonacci(int n) {
        List<Integer> seqFib = new ArrayList<>();
        seqFib.add(0);
        seqFib.add(1);

        while (seqFib.get(seqFib.size() - 1) < n) {
            int nextFib = seqFib.get(seqFib.size() - 1) + seqFib.get(seqFib.size() - 2);
            seqFib.add(nextFib);
        }

        return seqFib;
    }

    public static boolean pertenceFibonacci(int num) {
        List<Integer> seqFib = fibonacci(num);
        return seqFib.contains(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
