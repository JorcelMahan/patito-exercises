import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosFelices {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero");
        int num = Integer.parseInt(reader.readLine());
        while (num != 1) {
            int sum = 0;
            while (num > 0) {
                int d = num % 10;
                sum += Math.pow(d, 2);
                num /= 10;
            }
            if (sum == 4) break;
            num = sum;
        }
        if (num == 1) System.out.println("FELIZ");
        else System.out.println("TRISTE");
    }


}
