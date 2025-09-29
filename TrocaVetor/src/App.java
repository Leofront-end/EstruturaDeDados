import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            vetor[i] = sc.nextInt();
        }

        int inicio = 0;
        int fim = vetor.length -1;

        while (inicio < fim) {
            int temporario = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temporario;

            inicio++;
            fim--;
        }

        for (int j = 0; j < vetor.length; j++) {
            System.out.println("N["+j+"] = "+vetor[j]);
        }
        
    }
}
