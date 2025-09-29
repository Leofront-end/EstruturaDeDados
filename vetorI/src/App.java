import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
            if (vetor[i] < 0) {
                System.out.println("X["+i+"] = 1");
            } else {
                System.out.println("X["+i+"] = "+vetor[i]);
            }
        }
    }
}
