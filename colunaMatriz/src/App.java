import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float [][]matriz = new float[12][12];
        int valorColuna;
        String caractere;
        float resultado,valor;

        valorColuna = sc.nextInt();
        caractere = sc.next();
        resultado = 0;
        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                valor = sc.nextFloat();
                matriz[linha][coluna] = valor;
                if (coluna == valorColuna) {
                    resultado += valor;
                }
            }
        }
        if (resultado == 'S') {
            System.out.format("%.1f", resultado);
        } else {
            resultado = resultado/12;
            System.out.format("%.1f", resultado);
        }
    }
}
