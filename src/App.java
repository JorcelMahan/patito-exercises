import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        int n = 4;
        int m = 4;
        int[][] arr = new int[n][m];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(reader.readLine());
            }
        }

        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != j) {
                    if (arr[i][j] == 0) {
                        cont++;
                    }
                }
            }
        }
        int resultado = ((n * m) - n) / 2;
//        System.out.println(resultado);
        if (cont >= resultado) {
            System.out.println("Es triangular");
        } else {
            System.out.println("No es triangular");
        }


    }


}
