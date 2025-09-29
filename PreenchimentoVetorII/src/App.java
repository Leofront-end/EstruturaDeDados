import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[100];
        int valorVetor;
        int valor;

        valor = sc.nextInt();
        valorVetor = -1;
        for (int i = 0; i < 100; i++) {
            valorVetor++;
            if (valorVetor == valor) {
                valorVetor = 0;
            }
            vetor[i] = valorVetor;
            System.out.println("N["+i+"] = "+vetor[i]);
        }
    }
}
