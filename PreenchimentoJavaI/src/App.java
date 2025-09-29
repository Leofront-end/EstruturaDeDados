import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int valor;
        
        valor = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                vetor[i] = valor;
                System.out.println("N[0] = "+vetor[i]);
            } else {
                vetor[i] = vetor[i-1] * 2;
                System.out.println("N["+i+"] = "+vetor[i]);
            }
        }
    }
}
