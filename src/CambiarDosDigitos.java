import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CambiarDosDigitos {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero mayor o igual a dos digitos");
        String[] num = reader.readLine().split("");
        int i = 0;
        do {
            System.out.println("Elige posicion 1: ");
            i = Integer.parseInt(reader.readLine());
        } while (i < 0 || i > num.length);
        int j = 0;
        do {
            System.out.println("Elige posicion 2: ");
            j = Integer.parseInt(reader.readLine());
        } while (j < 0 || j > num.length);
        String aux = num[i - 1];
        num[i - 1] = num[j - 1];
        num[j - 1] = aux;
        for (String x : num) System.out.print(x);

    }
}
