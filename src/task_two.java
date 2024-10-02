import java.util.Scanner;

public class task_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int cont = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vez(es).");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }

        scanner.close();
    }
}
